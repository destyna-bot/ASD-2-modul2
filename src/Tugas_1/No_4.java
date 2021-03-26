
package Tugas_1;

import java.util.Arrays;

public class No_4 {
    public static void main(String[]args){
        // mendeklarasikan array untuk membbuat matrix 2x3
        int B [][] = {
            {2, 1, -5},
            {3, 4, 2},
        };
        
        System.out.println("Saya memiliki matriks B = ");
        for(int i=0; i<B.length; i++){
            for(int j=0; j<B[0].length; j++){
                System.out.print((B[i][j] + " "));
            }
            System.out.println();
        }
        
        System.out.println("Saya mentranspose matriks B sehingga hasilnya sebagai berikut");
        int[][] B_transpose = new int[3][2];
        for(int i=0; i<B.length; i++){
            for(int j=0; j<B[0].length; j++){
                B_transpose[j][i] = B[i][j];
            }
        }
        for(int[] c : B_transpose ){
            for(int q : c) {
                System.out.print(q+" " );                       
            }
        System.out.println();
        }
        System.out.println( "Desty Nurul Anitsa");
    }
}
