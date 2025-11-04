import java.util.ArrayList;
import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        String[] sample = new String[5];
        System.out.println(Arrays.toString(sample));

        String[] names = {"bishal", "ayusha", "allie", "presley", "aj"};
        System.out.println(Arrays.toString(names));
        names[0] = "sam";
        System.out.println(names[0]);
        System.out.println(Arrays.toString(names));

        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));

        numbers[0] = 88;
        numbers[1] = 52;
        numbers[2] = 17;
        numbers[3] = 23;
        numbers[4] = 7;

        System.out.println(Arrays.toString(numbers));


        ArrayList<String> nameListAgain = new ArrayList<String>();
        nameListAgain.add("Whatever I want");
        System.out.println(nameListAgain.get(0));
//        System.out.println(nameListAgain[0]);

//        String[][] studentDetails = new String[4][4];
//
//        studentDetails[0][0] = "Bibek";
//        studentDetails[0][1] = "Joshi";

        String[][] studentDetails = {{"Bibek", "Joshi", "bibek.joshi@wright.edu"},
                {"Clarissa", "Milligan","U90yt789", "clarissa.milligan@wright.edu"}};
        System.out.println(studentDetails);
        System.out.println(Arrays.toString(studentDetails[0]));
        for (int i = 0; i < studentDetails.length; i++) {
            for (int j = 0; j < studentDetails[i].length; j++) {
                System.out.print(studentDetails[i][j]+"\t");

            }
            System.out.println("");

        }


    }
}
