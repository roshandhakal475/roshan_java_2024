public class OperatorPrecedence {
    public static void main(String[] args) {
//        int a = 6*5-34/2; //highest precedence goes to * and /. then they are evaluated on the basis of left to right associativity.
//        /*
//        30-17=13
//         */
//        int b= 60/5-34*2;
//        /*
//        12-68=-56
//         */
//        System.out.println(a);
//        System.out.println(b);
        //quick quiz
        int x=6;
        int y=1;
        int a=5, b=1, c=4;
//        int k= x*y/2;
        int k = b*b - (4*a*c)/2*a;
        System.out.println(k);

    }
}