public class LoopExamples {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++){
            System.out.println("The value of i is " + i);
            for (int j = 0; j < 5; j++){
                System.out.println("the value of j is " + j);
                for (int k = 0; k < 5; k++){
                    System.out.println("the value of k is " + k );
                }
            }
        }

    }
}
