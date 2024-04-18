public class Multi {
    public static void main(String[] args) {
        int [][] flat= new int[3][3];
        flat[0][0] =1;
        flat[0][1] =0;
        flat[0][2] =0;
        flat[1][0] =0;
        flat[1][1] =1;
        flat[1][2] =0;
        flat[2][0] =0;
        flat[2][1] =0;
        flat[2][2] =1;

        for(int i=0; i<flat.length; i++){
            for(int j=0; j<flat[i].length; j++){
                    System.out.print(flat[i][j]);
                    System.out.print(" ");
                }
                System.out.println("");
            
        }
    }
}
