/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan21;

import java.util.Scanner;

/**
 *
 *NAMA :Muhamad Rizky Permana
 * KELAS : IF-2
 * NIM : 10118050
 * Deskripsi Program :
 */
public class Latihan21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // TODO code application logic here
        int array[],i,n;
        array = new int[100];
        float rata,total = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Banyak Mahasiswa : ");
        n = scan.nextInt();
        
        for (i=1;i<=n;i++){
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+i+ ": ");
            array[i] = scan.nextInt();
            total = total + array[i];
        }
        
        rata = total/n;
        
        System.out.println("Rata rata Nilai Mahasiswa : " + rata);
    }
    
}
