package Chapter_5.Practic_Set_5;

public class FactorialNumWhileLoop {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int factorial=1;
        while(i<=n){
            factorial = factorial*i;
            i++;
        }
        System.out.println("factorial of " +n+ " is: " +factorial);
    }
}
