public class Car {
    private String make;
    private String model;
    private String plate;
    private String color;

    Car(String make, String model, String plate, String color){
        this.make = make;
        this.model = model;
        this.plate = plate;
        this.color = color;
    }

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getPlate(){
        return plate;
    }
    public String getColor(){
        return color;
    }

    public void ShowCarInfo(){
        System.out.println("Car: " + make + " " + model);
        System.out.println("Plate: " + plate);
        System.out.println("Color: " + color);
    }
}
