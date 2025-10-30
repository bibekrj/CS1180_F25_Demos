import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {



    public static void main(String[] args) {
        int a = 10;
        ArrayList<String> movieNames = new ArrayList<>();

        movieNames.add("Avengers");
        movieNames.add("Captain AMmerica");
        movieNames.add("Ironman");
        movieNames.add("Black Panther");
        movieNames.add("Antman");
        movieNames.add("The Incredble Hulk");
        movieNames.add("Black Widow");
        movieNames.add("Spiderman");

        System.out.println(movieNames);
        System.out.println(movieNames.size());
//        System.out.println(movieNames[0]); if this was an array and NOT an ArrayList
        System.out.println(movieNames.get(7));
        movieNames.add(7, "Venom");
        System.out.println(movieNames);
        movieNames.add(2, "Guardians of the galaxy");
        System.out.println(movieNames);
        movieNames.add(10, "Fantastic Four");
        System.out.println(movieNames);
        System.out.println(movieNames.indexOf("Ironman"));

        System.out.println(movieNames.size());
        movieNames.remove(1);
        System.out.println(movieNames);


//        Vehicles vh1 = new Vehicles("Kia", 6);
////        vh1.setVehicleMake("kia");
//        vh1.color = "silver";
//
//        System.out.println(vh1.getVehicleMake());
//
//        vh1.setIsElectric("Definitely Not");
//
//        System.out.println(vh1.getIsElectric());

    }
}
