package Chapter_5;

public class BrakAndContinueLoop {
    public static void main(String[] args) {
        // Break and Continue using loop
        for(int i=0; i<5; i++){ 
            System.out.println(i);
            System.out.println("Java is greate");
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
        }
        
        // do-while loop
        int j=0;
        do{
            System.out.println(j);
            System.out.println("Java is greate");
            if(j==2){
                System.out.println("Ending the loop");
                break;
            }
            j++;
        }while(j<5);
        System.out.println("do-while Loop ends here");

        // while loop
        int k=0;
        while(k<5){
            System.out.println(k);
            System.out.println("Java is greate");
            if(k==2){
                System.out.println("Ending the loop");
                break;
            }
            k++;
        }
        System.out.println("While Loop ends here");

        // continue loop

        int a=0;
        while(a<5){
            a++;
            if(a==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(a);
            System.out.println("Java is greate");
            // a++;
        }
        System.out.println("While Loop ends here");
        
    }
}
