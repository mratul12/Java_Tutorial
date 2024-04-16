package Chapter_5.Practic_Set_5;

import java.util.Scanner;
public class MultiplicationTableReverse {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("Enter the Num: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=10;
        while(i>=1){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
            i--;
        }
    }
}


