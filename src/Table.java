import java.io.File;
import java.io.IOException;
import java.util.*;

public class Table {

    private int tableId;
    private int numberOfSeats;
    private HashMap<String, String> tableSchedule;// = new HashMap<>();
    //private ArrayList<Table> tableList = new ArrayList<>();

    public Table(int id, int seatsNumber){
        this.tableId = id;
        this.numberOfSeats = seatsNumber;
        HashMap<String, String> tableShedule = new HashMap<>();
        for (int i = 0; i <= 24; i++){
            tableShedule.put(String.valueOf(i), "available");
        }
        this.tableSchedule = tableShedule;
    }
    public Table()throws IOException {
        Restaurant r = new Restaurant();
        for (int i = 0; i < r.getRestaurantList().size(); i++) {
            Scanner tblscan = new Scanner(new File("tables\\" + i + "table.txt"));
            tblscan.useDelimiter(",|\n");
            ArrayList tableList = r.getRestaurantList().get(i).getTables();

            while(tblscan.hasNext()) {
                int tableId = tblscan.nextInt();
                int tableSeat = tblscan.nextInt();

                Table newTable = new Table(tableId, tableSeat);
                this.numberOfSeats = tableSeat;
                this.tableId = tableId;
                HashMap<String, String> tableSchedule = new HashMap<>();
                for (int j = 0; j <= 24; j++){
                    tableSchedule.put(String.valueOf(j), "available");
                }
                this.tableSchedule = tableSchedule;

                tableList.add(newTable);
            }
        }
    }
    /*public Table(int id, int seatsNumber, HashMap<String, String> tableSchedule){
        this.tableId = id;
        this.numberOfSeats = seatsNumber;
        this.tableSchedule = tableSchedule;
        //HashMap<String, String> tableShedule = new HashMap<>();
        for (int i = 0; i <= 24; i++){
            tableSchedule.put(String.valueOf(i), "available");
        }
    }*/

    public int getTableId() {
        return tableId;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public HashMap returnSchedule(){
        return this.tableSchedule;
    }

    public String getAvailability(int hour){
        return tableSchedule.get(String.valueOf(hour));
    }
    /*public ArrayList getTables(){
        return this.tableList;
    }*/
    public String toString(){
        return this.tableId + " " + this.numberOfSeats;
    }



}
