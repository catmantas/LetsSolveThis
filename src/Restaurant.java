import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {

    private String restaurantName;
    private int ranking;
    private ArrayList<Restaurant> restaurantList = new ArrayList<>();
    private int restaurantId;
    private ArrayList<Table> tablesList;

    public Restaurant(int restId, String name, int ranking){
        this.restaurantId = restId;
        this.restaurantName = name;
        this.ranking = ranking;
        this.tablesList = new ArrayList<>();
    }
    public Restaurant()/*throws FileNotFoundException*/ {

        /*this.tablesList = new ArrayList<>();
        Scanner scan = new Scanner(new File("restaurants.txt"));
        scan.useDelimiter(",|\n");

        while(scan.hasNext()){
            int id = scan.nextInt();
            String name = scan.next();
            int ranking = scan.nextInt();

            Restaurant newRest = new Restaurant(id, name, ranking);
            ArrayList tableList = new ArrayList<>();
            this.tablesList = tableList;
            restaurantList.add(newRest);
        }*/
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

   public void addTable(Table table){
        this.tablesList.add(table);
   }

   public String checkTable(int table, int hour){ // test funkcija
        if(tablesList.get(table).getAvailability(hour).equals("available")){
            System.out.println("Available");
            return "available";
        }
        else System.out.println("Not Available");
        return "unavailable";
   }

   public void removeTable(int tableId){

   }
   public void reserve(int table, int hour, int ppl){
        if(ppl <= tablesList.get(table).getNumberOfSeats()) {
            tablesList.get(table).returnSchedule().replace(String.valueOf(hour), "available", "unavailable");
            System.out.println("Table reserved");
        }
        else System.out.println("Too many people for the table, choose a bigger table");
   }

   public void schedule(int table){
       System.out.println("\n" + this.restaurantName + "\nTable " + tablesList.get(table).getTableId());
        for(int i = 0; i <= 23; i++){
            System.out.println(i + "    " + tablesList.get(table).returnSchedule().get(String.valueOf(i)));
        }
   }
   public ArrayList getTableList(){
        return this.tablesList;
   }

   public Table getTable(int tableId){
        Table t = tablesList.get(tableId);
        return t;
   }

   public Restaurant getRestaurant(int index){
        Restaurant rest = restaurantList.get(index);
        return rest;
   }

   public void saveRestaurants()throws IOException {
       FileWriter rSaver = new FileWriter("restaurants.txt");
       for(int i = 0; i < restaurantList.size(); i++) {
           rSaver.write(getRestaurantName() + ",");
           rSaver.write(getRanking() + "\n");
           rSaver.flush();
           rSaver.close();
       }
   }

    public void addRest(Restaurant a) {
        restaurantList.add(a);
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public String toString(){
        return this.restaurantName + ", rating: " + this.ranking;
   }

    public int getRestaurantId(){
        return restaurantId;
    }

    public int returnId(String restName){
        int restID = 0;
        for (Restaurant r : restaurantList) {
            if (r.getRestaurantName().equals(restName)) {
                restID = r.getRestaurantId();
                break;
            }
        }
        return restID;
    }


}
