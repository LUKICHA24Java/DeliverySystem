public class ExpressDelivery implements DeliveryStrategy {
    @Override
        public double CalculateCost(double weight){
        return weight * 5;

        }
    @Override
        public String getEstimatedTime(){
        return "1-2 Days";

        }
    @Override
        public void deliver(){
        System.out.println("Package is being delivered using an Express delivery experience ");
    }

}
