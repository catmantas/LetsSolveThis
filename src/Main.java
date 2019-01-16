import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Restaurant r = new Restaurant();
        //Table t = new Table();

        r.addTable(new Table());

        //r.addTable(t);

        Restaurant r1 = new Restaurant(9, "äaaaa", 66);
        r.getRestaurantList().add(r1);
        r1.addTable(new Table());

        /* scannerio testas */
        /*for (int i = 0; i < r.getRestaurantList().size(); i++) {
            Scanner tblscan = new Scanner(new File("tables\\" + i + "table.txt"));
            tblscan.useDelimiter(",|\n");
            ArrayList tableList = r.getRestaurantList().get(i).getTables();

            while (tblscan.hasNext()) {
                int tableId = tblscan.nextInt();
                int tableSeat = tblscan.nextInt();

                Table newTable = new Table(tableId, tableSeat);
                System.out.println(newTable);
                r1.getTables().add(newTable);
            }
        }
        */

        System.out.println(r1.getTables().toString());

        System.out.println(r.getRestaurantList().get(1).getTables());

        //System.out.println((r.getRestaurantList().toString()));
        //System.out.println(t);
        System.out.println(r.getRestaurantList().get(0).getTables().toString());
        //System.out.println(r.getRestaurantList().size());
        System.out.println(r.getRestaurantList().get(0).getTables().size());

        //System.out.println(r.getRestaurantList().get(0).getTables().get(2));



        Restaurant pizza = new Restaurant(2,"Ayyo", 4);
        pizza.addTable(new Table(1,5));
        pizza.addTable(new Table(2, 3));
        r.addRest(pizza);

        System.out.println(pizza.getTables().toString());
        System.out.println(pizza.getTables().size());

        System.out.println(r.getRestaurantList().get(2).getTables().toString());

        /*Restaurant kebab = new Restaurant("forUmyFren", 3);
        kebab.addTable(new Table(1, 2));
        kebab.addTable(new Table(2,2));*/

        //kebab.reserve(1, 21,2);
        //kebab.reserve(1, 15, 3);

        //pizza.checkTable(0, 3);
        //pizza.reserve(0, 3, 4);
        //System.out.println(r.getRestaurantList().get(1));
        //System.out.println(r.getRestaurantList().get(1).getTables());
        //r.getRestaurantList().get(1).reserve(0,14,4);
        //r.getRestaurantList().get(1).schedule(0);
        //pizza.checkTable(0,3);
        //pizza.schedule(0);
        //kebab.schedule(1);
        //pizza.saveRestaurants();







    }
}
