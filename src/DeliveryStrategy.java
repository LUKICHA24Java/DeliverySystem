public interface DeliveryStrategy {
    double CalculateCost(double weight);

    String getEstimatedTime();

    void deliver();
}
