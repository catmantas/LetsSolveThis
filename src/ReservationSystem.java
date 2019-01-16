import java.io.FileNotFoundException;
import java.io.IOException;

public class ReservationSystem {

    public ReservationSystem(String restaurantName, int customerId,int tableId, int hour, int numberOfPeople) throws IOException {
        //Check if it can fit the people
        //check if its not occupied
        //set reservation

        /*if(isTableFree(tableId, hour)) {
            Restaurant r = new Restaurant();
            r.reserve(tableId - 1, hour,numberOfPeople);

        }*/
    }

    public static boolean isTableFree(int tableId, int hour){

        return true;}

    public static boolean cancelReservation(int customerId,int tableId, int hour){
        return true;
    }

    public static boolean updateReservation(int customerId,int tableId, int hour){
        return true;
    }

}
