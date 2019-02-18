import java.io.FileNotFoundException;
import java.io.IOException;

public class ReservationSystem {

    public ReservationSystem(String restaurantName, int customerId,int tableId, int hour, int numberOfPeople){
        Restaurant r = new Restaurant();
        //int id = r.returnId(restaurantName);

        isTableFree(r.returnId(restaurantName), tableId, 0);


        //Check if it can fit the people
        //check if its not occupied
        //set reservation

        /*if(isTableFree(tableId, hour)) {
            Restaurant r = new Restaurant();
            r.reserve(tableId - 1, hour,numberOfPeople);

        }*/
    }

    public static boolean isTableFree(int restID, int tableId, int hour){
        Restaurant r = new Restaurant();
        for(int i = 0; i < r.getRestaurantList().size(); i++) {
            if (r.getRestaurantList().get(i).getRestaurantId() == restID) {
                r.getRestaurantList().get(i).schedule(tableId);
                System.out.println("aaaaaa");
            }
            else System.out.println("neeeee");
        }
        return true;
    }

    public static boolean cancelReservation(int customerId,int tableId, int hour){
        return true;
    }

    public static boolean updateReservation(int customerId,int tableId, int hour){
        return true;
    }

}
