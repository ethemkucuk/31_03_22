/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hem.asal.hem.fibonacci.sayıları.bulma;

import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class HEMASALHEMFİBONACCİSAYILARIBULMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int sayac = 0;
        
        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(sayi + " Asal bir sayidir.");
        }
        else {
            System.out.println(sayi + " Asal bir sayi degildir.");
        }
                
        int t1 = 0, t2 = 1;
        System.out.print(sayi + "Sayısının Fibonacci Sayıları: ");
 
        for (int i = 1; i <= sayi; ++i)
    {
      System.out.print(t1 + " + ");
 
      int toplam = t1 + t2;
      t1 = t2;
      t2 = toplam;
        // TODO code application logic here
    }}}
    

