import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {

    String restaurantName;
    int ranking;
    ArrayList<Restaurant> restaurantList = new ArrayList<>();
    ArrayList<Table> tablesList;

    public Restaurant(String name, int ranking){
        this.restaurantName = name;
        this.ranking = ranking;
        this.tablesList = new ArrayList<Table>();
    }
    public Restaurant()throws FileNotFoundException {
        Scanner scan = new Scanner(new File("restaurants.txt"));
        scan.useDelimiter(",|\n");

        while(scan.hasNext()){
            String name = scan.next();
            int ranking = scan.nextInt();

            Restaurant newRest = new Restaurant(name, ranking);
            restaurantList.add(newRest);
        }
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
        if(ppl <= tablesList.get(table).getNumberOfSeats()){
            tablesList.get(table).returnSchedule().replace(String.valueOf(hour), "available", "unavailable");
            System.out.println("Table reserved");
        }
        else System.out.println("Too many people for the table, choose a bigger table");
   }

   public void schedule(int table){
       System.out.println("\n" + this.restaurantName + "\nTable " + tablesList.get(table).getTableId());
        for(int i = 0; i <= 24; i++){
            System.out.println(i + "    " + tablesList.get(table).returnSchedule().get(String.valueOf(i)));
        }
   }
   public ArrayList getTables(){
        return tablesList;
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

}
