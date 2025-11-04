public class Truck {
    private String make;
    private String model;
    private double bedSize;
    final private double valueOfPi = 3.14;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Truck(String make, String model, double bedSize ){
        this.make = make;
        this.model = model;
        this.bedSize = bedSize;
    }


    public static void main(String[] args) {
        Truck f150 = new Truck("Ford", "F150", 5.0);
        System.out.println(f150.make);

//        System.out.println(f150.make);
//        Truck tacoma = new Truck();
//        Truck r1500 = new Truck();
    }
}
