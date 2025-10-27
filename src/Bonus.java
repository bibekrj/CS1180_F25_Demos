public class Bonus {

    public static int numBag(int kids){
       if (kids > 0 && kids <=25){
           return 1;
       }
       else {
           int bags = kids /25;
           if(kids%25!=0){
               bags+=1;
           }
           return bags;
       }

    }

    public static void main(String[] args) {
        System.out.println(numBag(10));
        System.out.println(numBag(25));
        System.out.println(numBag(50));
        System.out.println(numBag(51));
        System.out.println(numBag(60));
        System.out.println(numBag(75));
        System.out.println(numBag(76));
        System.out.println(numBag(100));
        System.out.println(numBag(101));

    }
}

