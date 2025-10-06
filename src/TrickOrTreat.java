import java.util.Random;
import java.util.Scanner;

public class TrickOrTreat {


    public static String trickedYou() {
        Random num = new Random();
        int randomValue = num.nextInt(3);
//        System.out.println("the value selected is "+ value);
        if (randomValue == 0) {
            return "Boo!";
        } else if (randomValue == 1) {
            return "I want brains!";

        } else {
            return "tricked you";
        }
    }

    public static String treatYou() {
        Random num = new Random();
        int randomValue = num.nextInt(3);
//        System.out.println("the value selected is "+ value);
        if (randomValue == 0) {
            return "KitKat";
        } else if (randomValue == 1) {
            return "Snickers";

        } else {
            return "M & Ms";
        }
    }

    public static void main(String[] args) {
        System.out.println("how many houses do you want to visit?");
        Scanner scr = new Scanner(System.in);
        int numHouses = scr.nextInt();
        for (int i = 0; i < numHouses; i++) {
            System.out.println("Trick or Treat");
            String personSays = scr.next();
            if (personSays.equalsIgnoreCase("trick")) {
                System.out.println(trickedYou());
            } else if (personSays.equalsIgnoreCase("treat")) {
                String message = treatYou();
                System.out.println(message);

            }
        }


    }
}
