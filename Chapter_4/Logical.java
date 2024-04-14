public class Logical {
    public static void main(String[] args) {
        // LOgical AAD(&&) Gate
        System.out.println("For logical AND.....");
        boolean a=true;
        boolean b=false;
        boolean c=true;
        if(a && b && c){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        
        // Logical OR(||) Gate
        System.out.println("For logical OR.....");
        boolean d=true;
        boolean e=false;
        if(d || e){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        // Logical NOT(!) Gate
        System.out.println("For logical NOT.....");
        boolean d1=true;
        boolean e1=false;
        System.out.println("NOT(A) is: " +!d1);
        System.out.println("NOT(B): " +!e1);
    }
}
