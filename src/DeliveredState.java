public class DeliveredState implements DeliveryState{
    private DeliveryOrder order;

    public DeliveredState(DeliveryOrder order){
        this.order = order;
    }

    @Override
    public void processOrder(){
        System.out.println("Order has already been completed.");
    }

    @Override
    public void shipPackage(){
        System.out.println("Package has already been delivered.");
    }

    @Override
    public void sendOutForDelivery(){
        System.out.println("Package has already been delivered.");
    }

    @Override
    public void deliverPackage(){
        System.out.println("Package has already been delivered.");
    }

    @Override
    public void cancelOrder(){
        System.out.println("Delivered order cannot be cancelled.");
    }
}