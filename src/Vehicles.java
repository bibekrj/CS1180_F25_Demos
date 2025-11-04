public class Vehicles {
    private String vehicleMake;
    private int numOfWheels;
    private String isElectric;
    public String color;



//    public Vehicles(){
//
//    }
    public Vehicles(String vehicleMake, int numOfWheels ){
        this.vehicleMake = vehicleMake;
        this.numOfWheels = numOfWheels;

    }

    public String getIsElectric() {
        return isElectric;
    }

    public void setIsElectric(String isElectric) {
        this.isElectric = isElectric;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }


    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public static void main(String[] args) {
//        System.out.println(Car.color);
//        Car carSample1 = new Car("Chevrolet", "Equinox", 2025);
////        carSample1.headLights = "led";
//
//        carSample1.setHeadLights("led");
//        carSample1.getHeadLights();
//        System.out.println(carSample1.getMake());
//        System.out.println(carSample1.getModel());
//
//        carSample1.setMake("Honda");
//        carSample1.setModel("accord");
//        System.out.println(carSample1.getMake());
//        System.out.println(carSample1.getModel());
//        Car.color= "red";
//        System.out.println(Car.color);
//
//
//        carSample1.moveForward();
////
//       Car carSample2 = new Car("Toyota", "Camry", 2025);
//       Car.color = "purple";
//        System.out.println(Car.color);
//       carSample2.moveForward();
//
//       Car.carGoesVroom();
//       carSample2.carGoesVroomVroom();
////       Car.numberOfTyres = 4;
        Truck tacomaSample = new Truck("Toyota","Tcoma", 5.5);
//        System.out.println(tacomaSample.make);
        System.out.println(tacomaSample.getModel());
        tacomaSample.setModel("Tundra");
    }
}
