public class PlacedState implements DeliveryState{
    private DeliveryOrder order;

    public PlacedState(DeliveryOrder order){
        this.order = order;
    }
    @Override
    public void processOrder(){
        System.out.println("The order is now being processed ");

        order.SetState(order.getProcessingState());
        order.setStatus("Processing ");
    }

    @Override
    public void shipPackage(){
        System.out.println("The order needs to be processed before it is shipped ");
    }
    @Override
    public void sendOutForDelivery(){
        System.out.println("The order is not ready for delivery yet ");
    }
    @Override
    public  void deliverPackage(){
        System.out.println("The order cannot be delivered yet ");
    }
    @Override
    public void cancelOrder(){
        System.out.println("The order has been cancelled ");

        order.SetState(order.getCancelledState());
        order.setStatus("Cancelled ");
    }


}

