public class Main {

    public static void main(String[] args){

        Restaurant pizza = new Restaurant("Shit", 5);
        pizza.addTable(new Table(1,5));

        pizza.checkTable(0, 3);
        pizza.unavailableify(0, 3);
        pizza.checkTable(0,3);



    }
}
