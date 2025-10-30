import java.util.Arrays;

public class ArrayExample2 {
    public static void main(String[] args) {
        String[] onePunchManCharacters = {"Saitama", "Genos", "Silverfang", "Garou", "937-775-3313","Fubu"};

//        System.out.println(onePunchManCharacters[0]);
//        System.out.println(onePunchManCharacters[1]);
//        System.out.println(onePunchManCharacters.length);
//
//        for (int i = 0; i < onePunchManCharacters.length; i++) {
//            System.out.println(onePunchManCharacters[i]);
//
//        }
//        System.out.println(Arrays.toString(onePunchManCharacters));
        String[][] deathNote = {{"light","mello", "misa"},{"l","nate","soichiro"},{"teru","ryuk","matsuda","sayu"}};
        for (int i = 0; i < deathNote.length; i++) {
            for (int j = 0; j < deathNote[i].length; j++) {
                System.out.println(deathNote[i][j]);

            }

        }
    }
}
