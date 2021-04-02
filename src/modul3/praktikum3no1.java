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
public class praktikum3no1 {
    public static void main(String[] args) {
        
        System.out.println("Sequential Search"+"\n");
        Scanner scan = new Scanner(System.in);
        String A[] = {"Galileo","Archimedes", "Alkhawarizmi", "Aljabar", "Nama Mahasiswa", "Tesla"};
        String cari;
        
        System.out.println("Isi data A adalah : ");
        for (int i = 0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Masukan Nama untuk mencari : ");
        cari = scan.nextLine();
        
        for (int i = 0; i<=A.length; i++){
            if (cari.equalsIgnoreCase(A[i])){
                System.out.println("data " + cari + " berada di index " + i);
                break;
            }
        }
        System.out.println("\n");
        System.out.println("");
        System.out.println("Muhamad Sahrul Syabani");
    }
}