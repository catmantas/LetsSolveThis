import java.util.ArrayList;

public class Restaurant {

    String restaurantName;
    int ranking;
    ArrayList<Table> tablesList;

    public Restaurant(String name, int ranking){
        this.restaurantName = name;
        this.ranking = ranking;
        this.tablesList = new ArrayList<Table>();
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
            return "Available";
        }
        else System.out.println("not available");
        return "Unavailable";
   }

   public void removeTable(int tableId){

   }
    public void unavailableify(int table, int hour){ //test funkcija
       tablesList.get(table).getMap().replace(String.valueOf(hour), "available", "Unavailable");
    }

}
