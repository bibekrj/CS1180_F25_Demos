import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        System.out.println(message);
    }
}
