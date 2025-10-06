import java.sql.SQLOutput;
import java.util.Scanner;

public class MultipleInputs {
    public static void main(String[] args) {
        int total = 0;
        System.out.println("Enter a number:");
        Scanner userInput = new Scanner(System.in);
        boolean status=true;
        while(status){
            if(userInput.hasNextInt()){
                total += userInput.nextInt();
            }
            else{
                String valueGotten = userInput.next();
                if(valueGotten.equalsIgnoreCase("done")){
                    System.out.println(total);
                    status=false;
                }
                else{
                    System.out.println("invalid input");
                }
            }
        }
    }
}


