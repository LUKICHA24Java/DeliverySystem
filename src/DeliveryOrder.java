import java.util.ArrayList;
import java.util.List;

public class DeliveryOrder {
    private Customer customer;
    private DeliveryPackage deliverypackage;
    private DeliveryStrategy deliverystrategy;
    private DeliveryDriver deliverydriver;

    private DeliveryState placedState;
    private DeliveryState processingState;
    private DeliveryState inTransitState;
    private DeliveryState outForDeliveryState;
    private DeliveryState deliveredState;
    private DeliveryState cancelledState;

    private DeliveryState currentState;

    private String CurrentLocation;
    private String status;

    private List<DeliveryObserver> observers =  new ArrayList<>();

    public DeliveryOrder(DeliveryPackage deliverypackage, DeliveryStrategy deliverystrategy, Customer customer){
        placedState = new PlacedState(this);
        processingState = new ProcessingState(this);
        inTransitState = new InTransitState(this);
        outForDeliveryState = new OutForDeliveryState(this);
        deliveredState = new DeliveredState(this);
        cancelledState = new CancelledState(this);

        currentState = placedState;

        this.deliverypackage = deliverypackage;
        this.deliverystrategy = deliverystrategy;
        this.customer = customer;

        addObserver(customer);
    }
        // Strategy Pattern
    public void setDeliveryStrategy(DeliveryStrategy deliverystrategy){
        this.deliverystrategy = deliverystrategy;

        notifyObservers(
                "Delivery method has been changed. "
        );
    }

    public double CalculateDeliveryCost() {
        return deliverystrategy.CalculateCost(deliverypackage.getWeight());
    }
    public String ShowEstimatedTime(){
        return deliverystrategy.getEstimatedTime();
    }
    public void Order(){
        deliverystrategy.deliver();
    }
         // Observer Pattern
    public void addObserver(DeliveryObserver observer){
        observers.add(observer);
    }
    public void removeObserver(DeliveryStrategy observer){
        observers.remove(observer);
    }

    private void notifyObservers(String message){
        for(DeliveryObserver observer : observers){
            observer.update(message);
        }
    }

       // Driver

    public void setDeliverydriver(DeliveryDriver deliverydriver){
        this.deliverydriver = deliverydriver;

        notifyObservers(
                "Your Driver now is " + deliverydriver.getName()
        );
    }
    public DeliveryDriver getDeliverydriver(){
        return deliverydriver;
    }

    // Package Location
    public void setCurrentLocation(String CurrentLocation){
        this.CurrentLocation = CurrentLocation;

        notifyObservers(
                "Your package is currently at " + CurrentLocation
        );
    }
    public String getCurrentLocation(){
        return CurrentLocation;
    }


    // Status

    public void setStatus(String status){
        this.status = status;

        notifyObservers(
                "Package's current status is " + status
        );
    }

    public String getStatus(){
        return status;
    }

    public Customer getCustomer() {
        return customer;
    }


    public DeliveryPackage getDeliveryPackage() {
        return deliverypackage;
    }


    public DeliveryStrategy getDeliveryStrategy() {
        return deliverystrategy;
    }

    public void processOrder(){
        currentState.processOrder();
    }

    public void shipPackage(){
        currentState.shipPackage();
    }

    public void sendOutForDelivery(){
        currentState.sendOutForDelivery();
    }

    public void deliverPackage(){
        currentState.deliverPackage();
    }

    public void cancelOrder(){
        currentState.cancelOrder();
    }
    public void SetState(DeliveryState state){
        currentState = state;
    }

    public DeliveryState getPlacedState(){
        return placedState;
    }

    public DeliveryState getProcessingState(){
        return processingState;
    }

    public DeliveryState getInTransitState(){
        return inTransitState;
    }

    public DeliveryState getOutForDeliveryState(){
        return outForDeliveryState;
    }

    public DeliveryState getDeliveredState(){
        return deliveredState;
    }

    public DeliveryState getCancelledState(){
        return cancelledState;
    }





}
