public class InTransitState implements DeliveryState{
    private DeliveryOrder order;

    public InTransitState(DeliveryOrder order){
        this.order = order;
    }

    @Override
    public void processOrder(){
        System.out.println("Order has already been processed.");
    }

    @Override
    public void shipPackage(){
        System.out.println("Package is already in transit.");
    }

    @Override
    public void sendOutForDelivery(){
        System.out.println("Package is now out for delivery.");

        order.SetState(order.getOutForDeliveryState());
        order.setStatus("Out For Delivery");
    }

    @Override
    public void deliverPackage(){
        System.out.println("Package is not out for delivery yet.");
    }

    @Override
    public void cancelOrder(){
        System.out.println("Order cannot be cancelled because it is already in transit.");
    }
}
