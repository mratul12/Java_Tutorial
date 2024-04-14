// Q.3 Use comparison operators to find out whether a given number is greater then the user entered number or not.

package Chapter_2.practice_Set_2;
import java.util.Scanner;

public class Q_3 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("Enter the enteger Num: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a>8);

    }
}
