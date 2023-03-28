/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author C-16
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilaiA = 10; int nilaiB = 20;
        double DOUBLE = 1234.53; double DOUBLE2 = 523.14;
        boolean isPlus = true;
        System.out.println(nilaiA); System.out.println(nilaiB);
        System.out.println(DOUBLE); System.out.println(DOUBLE2);
        System.out.println(isPlus);
        
    Scanner testObjek = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Masukkan nama");
    String nama = testObjek.nextLine();  // Read user input
    System.out.println("Nama: " + nama);
    
    Scanner objek2 = new Scanner(System.in);
    
    System.out.println("Masukkan NilaiA");
    nilaiA = objek2.nextInt();
    System.out.println("nilaiA: "+ nilaiA);
    
    System.out.println("Masukkan Nilai B");
    nilaiB = objek2.nextInt();
    System.out.println("nilaiB: "+ nilaiB);
    
    System.out.println("Masukkan Nilai Double 2");
    DOUBLE = objek2.nextDouble();
    System.out.println("nilai double: "+ DOUBLE);
    
    System.out.println("Masukkan Nilai Double 2");
    DOUBLE2 = objek2.nextDouble();
    System.out.println("nilai double 2: "+ DOUBLE2);
    
    System.out.println("Masukkan Boolean");
    isPlus = objek2.nextBoolean();
    System.out.println("nilai Boolean: "+ isPlus);
    
  }
}
        // TODO code application logic here
    
    

