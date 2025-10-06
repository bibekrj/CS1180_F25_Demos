import java.util.Scanner;

public class ShortCircuitExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        a > 10
        if (false && true){
            System.out.println("doesn't care its true");
        }
        else {
            System.out.println("first statement is false");
        }
        if (true && false){
            System.out.println("checks the second condition");
        }
        else{
            System.out.println("short circuit with second condition checking");
        }

        if(true || false) {
            System.out.println("short circuit because first condition is true");
        }

        if(false || true){
            System.out.println("no short circuit but the whole condition is evaluated");
        }


    }
}
