package Practice_Set_4;

import java.util.Scanner;
public class Q_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a English Marks");
        byte eng=sc.nextByte();
        System.out.println("Enter a Math Marks");
        byte math=sc.nextByte();
        System.out.println("Enter a Computer Marks");
        byte com=sc.nextByte();
        float sum=(eng+math+com)/3.0f;
        System.out.println("Your Overall percentage is: " +sum);
        if(sum>=40 && eng>=33 && math>=33 && com>=33){
            System.out.println("Promoted");
        }
        else{
            System.out.println("Not Promoted");
        }
    }
}
