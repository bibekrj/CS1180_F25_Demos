public class ClassActivity {
    public static void main(String[] args) {

        int cDS = 10;

        while(cDS>0){
            System.out.println("T-Minus " + cDS);
            if(cDS==7){
                System.out.println("MAIN ENGINE START");
            }
//            else if (cDS ==1) {
//                System.out.println("LIFT OFF!!!");
//            }
            cDS  = cDS - 1;

        }
        System.out.println("LIFT OFF");
    }
}
