public class OutForDeliveryState implements DeliveryState{
    private DeliveryOrder order;

    public OutForDeliveryState(DeliveryOrder order){
        this.order = order;
    }

    @Override
    public void processOrder(){
        System.out.println("Order has already been processed.");
    }

    @Override
    public void shipPackage(){
        System.out.println("Package has already been shipped.");
    }

    @Override
    public void sendOutForDelivery(){
        System.out.println("Package is already out for delivery.");
    }

    @Override
    public void deliverPackage(){
        System.out.println("Package has been delivered.");

        order.SetState(order.getDeliveredState());
        order.setStatus("Delivered");
    }

    @Override
    public void cancelOrder(){
        System.out.println("Order cannot be cancelled because it is already out for delivery.");
    }
}