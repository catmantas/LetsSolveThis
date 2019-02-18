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

        System.out.println(r.returnId("äaaaa"));
        System.out.println(r.returnId("Ayyo"));

        ReservationSystem rs = new ReservationSystem("Ayyo", 0, 1, 0, 0);

        System.out.println(rs);






    }
}
