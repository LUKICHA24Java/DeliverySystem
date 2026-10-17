public class CancelledState implements DeliveryState{
    private DeliveryOrder order;

    public CancelledState(DeliveryOrder order){
        this.order = order;
    }

    @Override
    public void processOrder(){
        System.out.println("Cancelled order cannot be processed.");
    }

    @Override
    public void shipPackage(){
        System.out.println("Cancelled order cannot be shipped.");
    }

    @Override
    public void sendOutForDelivery(){
        System.out.println("Cancelled order cannot be sent out for delivery.");
    }

    @Override
    public void deliverPackage(){
        System.out.println("Cancelled order cannot be delivered.");
    }

    @Override
    public void cancelOrder(){
        System.out.println("Order is already cancelled.");
    }
}