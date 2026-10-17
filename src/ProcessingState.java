public class ProcessingState implements DeliveryState{
    private DeliveryOrder order;

    public ProcessingState(DeliveryOrder order){
        this.order = order;
    }

    @Override
    public void processOrder(){
        System.out.println("The order is already being processed ");
    }

    @Override
    public void shipPackage(){
        System.out.println("The package has been shipped ");

        order.SetState(order.getInTransitState());
        order.setStatus("In Transit ");
    }

    @Override
    public void sendOutForDelivery(){
        System.out.println("Package needs to be shipped first ");
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
