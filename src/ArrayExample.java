import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
//        int[] numbers = new int[6];
//
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//
//        String[] words = new String[6];
//
////        System.out.println(words[8]);
//        System.out.println(words[0]);
//        System.out.println(words[1]);
        int[] numbers = {1, 2, 5, 13, 6, 7, 29, 8, 12, 41, 67, 00};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        //        System.out.println(Arrays.toString(numbers));
//        int total = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            total += numbers[i];
////            System.out.print(numbers[i]+"\t");
//
//        }
//        System.out.println(total);


        String[] names = {"Ellen", "Koen", "Bibek","Joshi","Clark", "Allen","Saitama","Tom", "Toni", "Tommy","Barry","Bruce","Tony"};
//        System.out.println(Arrays.toString(names));
//        Arrays.sort(names);
//        System.out.println(Arrays.toString(names));
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//
//        }


        String[][] values2D = {{"Sam","Yaz","Z"}, {"AJ", "Alex","Connor","Jack"}};
//        System.out.println(values2D[0][2]);
//        System.out.println(Arrays.toString(values2D));
        for (int i = 0; i < values2D.length; i++) {
            for (int j = 0; j < values2D[i].length; j++) {
                System.out.println(values2D[i][j]);

            }

        }
    }

}
