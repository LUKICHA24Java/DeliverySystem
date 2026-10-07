public class DeliveryDriver {
    private int id;
    private String name;
    private String phoneNumber;
    private Car car;

    DeliveryDriver(int id, String name, String phoneNumber, Car car){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.car = car;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public Car getCar(){
        return car;
    }
    public void ShowDriverInfo(){
        System.out.println("Driver ID: " + id);
        System.out.println("Driver Name: " + name);
        System.out.println("Driver Phone Number: " + phoneNumber);
        car.ShowCarInfo();

    }
}
