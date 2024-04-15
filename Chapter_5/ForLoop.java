package Chapter_5;

public class ForLoop {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            System.out.println(i);
        }

        // 2n = Even Numbers = 0,2,4,6,8
        System.out.println("\n2n = Even Numbers = 0,2,4,6,8");
        int n=5;
        for(int j=0; j<n; j++){
            System.out.println(2*j);
        }
        
        // 2n+1 = Odd Numbers = 1,3,5,7,9
        System.out.println("\n2n+1 = Odd Numbers = 1,3,5,7,9");
        int m=5;
        for(int k=0; k<m; k++){
            System.out.println(2*k+1);
        }

        
    }
}
