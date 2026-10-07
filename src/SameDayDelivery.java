public class SameDayDelivery implements DeliveryStrategy {
    @Override
    public double CalculateCost(double weight) {
        return weight * 4 + 10;
    }

    @Override
    public String getEstimatedTime() {
        return "Today/";
    }

    @Override
    public void deliver() {
        System.out.println("Package is being delivered using Same Day Delivery experience ");
    }
}