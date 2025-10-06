public class DeMethod {

    public static int addTwoValues(int incomingValA, int incomingValB){
        int a = incomingValA;
        int b = incomingValB;
        int total = a + b;
        return total;
    }

    public static String sayHello(){
       return "Hello Hello";
    }


    public static void main(String[] args) {
        int val1 = 20;
        int val2 = 30;
        int total = addTwoValues(val1, val2);
        System.out.println(sayHello());
        String message = sayHello();

        System.out.println(message);
        System.out.println("the total value is " + total);


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i +" "+ j);

            }
        }
    }
}
