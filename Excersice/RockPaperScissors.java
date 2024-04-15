import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("It's My Turn");
        Scanner sc=new  Scanner(System.in);
        int me=sc.nextInt();
        System.out.println("Player move is: " +me);
        Random sc1=new Random();
        int com=sc1.nextInt(3);
        System.out.println("This turn is a Computer: " +com);
        if(com==me){
            System.out.println("the match is drow");
        }
        else if(me==0 && com==1 || me==1 && com==2 || me==2 && com==0){
            System.out.println("You lost the match.....Try again");
        }
        else{
            System.out.println("I'm win the match");
        }
    }
}
