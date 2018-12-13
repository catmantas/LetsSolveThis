public class Table {

    int tableId;
    int numberOfSeats;

    public Table(int id, int seatsNumber){
        this.tableId = id;
        this.numberOfSeats = seatsNumber;
    }

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

}
