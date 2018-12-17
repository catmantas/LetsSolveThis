public class Main {

    public static void main(String[] args){

        Restaurant pizza = new Restaurant("Shit", 5);
        pizza.addTable(new Table(1,5));
        pizza.addTable(new Table(2, 3));

        Restaurant kebab = new Restaurant("only for u my frend", 3);
        kebab.addTable(new Table(1, 2));
        kebab.addTable(new Table(2,2));

        kebab.reserve(1, 21);
        kebab.reserve(1, 15);

        pizza.checkTable(0, 3);
        pizza.reserve(0, 3);
        pizza.checkTable(0,3);
        pizza.schedule(0);
        kebab.schedule(1);





    }
}
