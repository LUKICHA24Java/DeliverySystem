public class StandardDelivery implements DeliveryStrategy{
@Override
    public double CalculateCost(double weight){
    return weight * 2;
    }
@Override
    public String getEstimatedTime(){
    return "2-5 Days";
    }
@Override
    public void deliver(){
    System.out.println("Package is being delivered using Standard Delivery experience ");
}
}
