package Zadanie7;

import java.util.Scanner;

public class zadanie7  {

    public static void main(String[] args) {

        int ilosc_pokojów = 0;
        int ilosc_zajetych_pokoi = 0;
        int iloscpieter;
        int a = 0;
        int liczba_ogólna = 0;
        double oblezenie = 0;
        int suma_zajetych_pokoi = 0;

        Scanner scaner = new Scanner(System.in);
        System.out.println("ile pieter:");
        iloscpieter = scaner.nextInt();

        for(int i = 0; i<=iloscpieter; i++)
        {
         System.out.println("pietro" +i+ "ile pokoi");
         ilosc_pokojów = scaner.nextInt();

         System.out.println("pietro" +i+ "liczba zajetych pokoi");
         ilosc_zajetych_pokoi = scaner.nextInt();
         liczba_ogólna += ilosc_pokojów;
         suma_zajetych_pokoi += ilosc_zajetych_pokoi;

         if(i==iloscpieter)
         {
             oblezenie = (double)suma_zajetych_pokoi/(double)liczba_ogólna;
             System.out.println("wszystkie pokoje"+ liczba_ogólna);
             System.out.println("zajete pokoje"+ilosc_zajetych_pokoi );
             System.out.println("oblezenie"+ oblezenie);

         }



        }




    }
}
