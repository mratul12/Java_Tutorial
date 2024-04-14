public class Operator_Precedence {
    public static void main(String[] args) {

        
        // Precendence & Associativity

        // Precedence
        int a= 6*5-34/2;
        /*
          Hightest precedence goes to + and /. They are then evaluate on the basis of left to right associativity
            = 30-34/2
            = 30-17
            = 13
        */
        System.out.println(a);

        // Associativity
        int b=60/5-34*2;
        /*
            = 12-34*2
            = 12-68
            = -56
        */
        System.out.println(b);
    }
}
