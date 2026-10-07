public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(
                1001,
                "Luka",
                "Tbilisi",
                "+995555123456"
        );

        DeliveryPackage deliveryPackage = new DeliveryPackage(
                5001,
                "Laptop",
                "Electronics",
                2.6
        );

        Car car = new Car(
                "Toyota",
                "Prius",
                "CX-528-XC",
                "White"
        );

        DeliveryDriver driver = new DeliveryDriver(
                2001,
                "Giorgi",
                "+995555987654",
                car
        );

        DeliveryStrategy strategy = new StandardDelivery();

        DeliveryOrder order = new DeliveryOrder(
                deliveryPackage,
                strategy,
                customer
        );


        customer.ShowCustomerInfo();
        deliveryPackage.ShowPackageInfo();

        System.out.println();

        System.out.println("Delivery cost: "
                + order.CalculateDeliveryCost());

        System.out.println("Estimated time: "
                + order.ShowEstimatedTime());

        order.Order();


        System.out.println("\n--- Delivery Updates ---");

        order.setDeliverydriver(driver);

        order.setStatus("Package received at warehouse");

        order.setCurrentLocation("Tbilisi Distribution Center");

        order.setStatus("Out for delivery");


        System.out.println("\n--- Changing Delivery Strategy ---");

        order.setDeliveryStrategy(new ExpressDelivery());

        System.out.println("New delivery cost: "
                + order.CalculateDeliveryCost());

        System.out.println("New estimated time: "
                + order.ShowEstimatedTime());
    }
}