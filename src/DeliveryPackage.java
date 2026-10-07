public class DeliveryPackage {
    private int id;
    private String name;
    private String category;
    private double weight;

    public DeliveryPackage(int id, String name, String category, double weight){
        this.id = id;
        this.name = name;
        this.category = category;
        this.weight = weight;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
    public double getWeight(){
        return weight;
    }

    public void ShowPackageInfo(){
        System.out.println("Package ID: " + id);
        System.out.println("Package Name: " + name);
        System.out.println("Package Category: " + category);
        System.out.println("Package Weight: " + weight);

    }
}
