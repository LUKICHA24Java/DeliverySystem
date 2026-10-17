public interface DeliveryState {
    void processOrder();
    void shipPackage();
    void sendOutForDelivery();
    void deliverPackage();
    void cancelOrder();
}
