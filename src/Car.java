public class Car {
    private String make;
    private String model;
    private int modelYear;
    private boolean electricOrGas;
    public static String color = "white";
    final public int numberOfTyres = 4;


    public static void carGoesVroom(){
        System.out.println("vroom");
    }

    public void carGoesVroomVroom(){
        System.out.println("vroom Vroom");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void moveForward(){
        System.out.println(make+ " has moved forward");
    }

    public Car(String make, String model, int modeYear){
        this.make = make;
        this.model = model;
        this.modelYear = modeYear;
    }


    public static void main(String[] args) {
        Car carSample1 = new Car("Chevrolet", "Equinox", 2025);
        System.out.println(carSample1.make);
        System.out.println(carSample1.model);
        carSample1.setMake("Honda");
        carSample1.setModel("accord");
        System.out.println(carSample1.make);
        System.out.println(carSample1.model);
        carSample1.moveForward();
        carGoesVroom();
        carSample1.carGoesVroomVroom();
//        carSample1.numberOfTyres = 20;

    }

}
