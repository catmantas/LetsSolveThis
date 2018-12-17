import java.util.*;

public class Table {

    private int tableId;
    private int numberOfSeats;
    private HashMap<String, String> tableSchedule;// = new HashMap<>();

    public Table(int id, int seatsNumber){
        this.tableId = id;
        this.numberOfSeats = seatsNumber;
        HashMap<String, String> tableShedule = new HashMap<>();
        for (int i = 0; i <= 24; i++){
            tableShedule.put(String.valueOf(i), "available");
        }
        this.tableSchedule = tableShedule;
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



}
