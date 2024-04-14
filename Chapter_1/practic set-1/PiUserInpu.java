import java.util.Scanner;

public class PiUserInpu {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int Num=sc.nextInt();
        float Pi=Num*22/7f;
        System.out.println("The value of pi: " +Pi);
    }
}
