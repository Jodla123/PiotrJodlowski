package Zadanie7;

import java.util.Scanner;
public class zadanie5 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);


        String nazwa;

        String litera;

        int c=0;

        System.out.println("wpisz jakies slowo: ");
        nazwa = klawiatura.nextLine();


        System.out.println("podaj jakas litere: ");
        litera = klawiatura.nextLine();


        int dlugosc = nazwa.length();


        char znak;

        char litera1 = litera.charAt(0);
        for(int i = 0; i < dlugosc; i++)
        {
            znak = nazwa.charAt(i);
            if(znak==litera1)
            {
                c=c+1;
            }



        }
        System.out.println("Litera "+ litera+" wystepuje " + c + " razy w słowie "+ nazwa);

    }
}