import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Restaurant r = new Restaurant();

        Restaurant r1 = new Restaurant(9, "äaaaa", 66);
        r1.addTable(new Table(0, 2));


        Restaurant pizza = new Restaurant(2,"Ayyo", 4);
        pizza.addTable(new Table(0,5));
        pizza.addTable(new Table(1, 3));

        r.addRest(r1);
        r.addRest(pizza);

        //System.out.println(r.returnId("äaaaa"));
        //System.out.println(r.returnId("Ayyo"));

        //pizza.schedule(1);

        System.out.println(r.getRestaurant(1).getTable(1).getNumberOfSeats());
        System.out.println(r.getRestaurant(1).getTable(1).getAvailability(3));

        ReservationSystem rs = new ReservationSystem("Ayyo", 0, 1, 3, 1);

        System.out.println(r.getRestaurant(1).getTable(1).getAvailability(3));


        //pizza.schedule(1);

        //r.getRestaurantList().get(1).reserve(1,3,1);

        //pizza.schedule(1);


    }

    static int addSauce(){
        int sauce = 0;
        for (int i = 0; i >= 0; i++){
            sauce = i;
        }
        return sauce;
    }
}
