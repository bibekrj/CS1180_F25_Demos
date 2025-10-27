import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

    public static void main(String[] args) {
        File example = new File("C:\\Users\\Bibek\\Desktop\\shortcircuit\\src\\sample.txt");
        Scanner scr = null;
        try {
            scr = new Scanner(example);

            int sum = 0;
            while(scr.hasNextInt()){
                sum = sum + scr.nextInt();
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
