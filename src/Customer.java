public class Customer {

    private int customerId;
    private String fullName;
    private String telephoneNumber;

    public Customer(int id, String name, String phone){
        this.customerId = id;
        this.fullName = name;
        this.telephoneNumber = phone;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

}

