/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;
import java.util.Scanner;
/**
 *
 * @author Sahrul
 */
public class praktikum3no2 {
    public static void main(String[] args) {
        System.out.println("Binary Search");
   
        Scanner scan = new Scanner(System.in);
        int A[] = {2,4,6,8,10,12,14,16,18,20};
        int cari;
        int batasatas = 0;
        int batasbawah = A.length-1;
        int ketemu = 0;
        int point = 0;
        
        
        System.out.println("Isi Data A adalah :");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i]+ " ");
        }
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Masukan Angka Yang akan dicari : ");
        cari = scan.nextInt();
        while ((batasatas <= batasbawah) && (ketemu == 0)){
            point = (batasatas + batasbawah)/2;
            System.out.println("Index Pointer " + point);
            if(cari == A[point]){
                ketemu = 1;
            }
            else if(cari < A[point]){
                System.out.println("Cari di kiri");
                batasbawah = point-1;
            } else {
                batasbawah = point+1;
                System.out.println("Cari di kanan");
            }
            }
        if (ketemu == 1){
            System.out.println("data ditemukan");
        } else {
            System.out.println("data tidak ditemukan");
        }
        
        System.out.println("");
        System.out.println("Muhamad Sahrul Syabani");
    }
}
