
package Tugas_1;
//import library atau membuat scanner
import java.util.Scanner;
public class No_4_Input {
    public static void main(String[] args){
       
   // mendeklarasi i, j, m, n. dengan m = ukuran baris, n = ukuran kolom 
   int i, j, m, n;
   int matriks[][] = new int[10][10]; //yang [10][10] merupakan range atau batas yang akan diinput, batas panjang barisnya 10 batas panjang kolomnya juga 10
   int transpose[][] = new int[10][10];
   //membuat scanner, perintah untuk mengambil input dari keyboard
   Scanner scan = new Scanner(System.in);
   System.out.print("Masukkan jumlah baris matriks: "); // semisalkan 2
   // mengambil input dari keybiard 
   m = scan.nextInt();
   System.out.print("Masukkan jumlah kolom matriks: "); // semisalkan 3
   n = scan.nextInt();
   System.out.println("Masukkan elemen matriks: ");// masukkan 2 1 -5 3 4 2 
   for(i=0; i<m; i++){
       for(j=0; j<n; j++){
           matriks[i][j]=scan.nextInt();
       }
   }
   System.out.println("Hasil matriks: ");
   for(i=0; i<m; i++){
       for(j=0; j<n; j++){
           System.out.print(matriks[i][j]+"\t"); //"\t" merupakan untuk tab, misal 20    23
       }
       System.out.println();
   }
   
   for(i=0; i<m; i++){
       for(j=0; j<n; j++){
           transpose [j][i] = matriks[i][j];
       }
   }
   System.out.println("Hasil transpose matriks: ");
   for(i=0; i<n ;i++){
       for(j=0; j<m; j++){
           System.out.print(transpose[i][j]+ "\t");
       }
       System.out.println();
   }
   System.out.println("Desty Nurul Anitsa");
   }
}


