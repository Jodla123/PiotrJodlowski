package Zadanie7;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class zadanie3{


    public static void main(String[] args) throws IOException {

        Scanner klawiatura = new Scanner(System.in);



        int speed = 0;
        int czas;
        int suma;


        PrintWriter pw = new PrintWriter("zadanie.txt");
        System.out.println("wpisz prędkość poruszania sie auta: ");
        speed = klawiatura.nextInt();
        klawiatura.nextLine();


        System.out.println("Podaj czas podróży: ");
        czas = klawiatura.nextInt();
        klawiatura.nextLine();

        for(int i =1; i <= czas; i++)
        {
            suma = speed*i;
            pw.println("w czasie" +i+ "godzin przejedzesz "+suma+ "kilometrow");



        }

        pw.close();

    }

}


