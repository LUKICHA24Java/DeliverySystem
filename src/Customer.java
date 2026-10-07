public class Customer implements DeliveryObserver{
    private int id;
    private String name;
    private String address;
    private String phoneNumber;


    public Customer(int id, String name, String address, String phoneNumber){
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String message){
        System.out.println("Notification for " + name + ": " + message);
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void ShowCustomerInfo(){
        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Address: " + address);
        System.out.println("Customer Phone Number: " + phoneNumber);
    }
}
