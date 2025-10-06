import java.util.Scanner;

public class TrickOrTreat {


    public static String trickedYou(){
        return "BOO!";
    }

    public static String treatYou(){
        return "KitKat";
    }
    public static void main(String[] args) {
        System.out.println("Trick or Treatt!");
        Scanner sc = new Scanner(System.in);
        String whatDidTheUserSay = sc.next();
        if(whatDidTheUserSay.equalsIgnoreCase("trick")){
            System.out.println(trickedYou());
        } else if (whatDidTheUserSay.equalsIgnoreCase("treat")) {
            System.out.println(treatYou());

        }
    }
}
