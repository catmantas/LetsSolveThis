import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ReservationSystem {

    public ReservationSystem(String restaurantName, int customerId,int tableId, int hour, int numberOfPeople) throws IOException{
        Restaurant r = new Restaurant();
        ArrayList restList = r.getRestaurantList();
        int id = r.returnId(restaurantName);

        if(isTableFree(id, tableId, hour)){
            for (int i = 0; i < r.getRestaurantList().size(); i++){
                if(r.getRestaurant(i).getTable(tableId).getNumberOfSeats() <= numberOfPeople || r.getRestaurant(i).getTable(tableId).getAvailability(hour).equals("available")){
                    System.out.println("Victory");
                    r.getRestaurant(i).reserve(tableId, hour, numberOfPeople);


                }
            }

        }
        else System.out.println("defeat"); // default outcome, neveikia zopa


    }


        //Check if it can fit the people
        //check if its not occupied
        //set reservation

        /*if(isTableFree(tableId, hour)) {
            Restaurant r = new Restaurant();
            r.reserve(tableId - 1, hour,numberOfPeople);

        }*/

    /*(ppl <= tablesList.get(table).getNumberOfSeats()) {
            tablesList.get(table).returnSchedule().replace(String.valueOf(hour), "available", "unavailable");
            System.out.println("Table reserved");
            */

    public static boolean isTableFree(int restID, int tableId, int hour){

        boolean freedom = false;

        Restaurant r = new Restaurant();

        for(int i = 0; i < r.getRestaurantList().size(); i++) {
            if (r.getRestaurant(i).getRestaurantId() == restID){// || r.getRestaurant(i).getTable(tableId).getAvailability(hour).equals("available")) {
                freedom = true;
                break;
            }
        }
        return freedom;
    }

    public static boolean cancelReservation(int customerId,int tableId, int hour){
        return true;
    }

    public static boolean updateReservation(int customerId,int tableId, int hour){
        return true;
    }
    public String toString(){
        return "reaseras";
    }

}
