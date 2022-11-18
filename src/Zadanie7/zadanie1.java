package Zadanie7;
import java.util.Scanner;
public class zadanie1 {


    public static void main(String[] args) {

            Scanner klawiatura = new Scanner(System.in);


            int liczba = 0;
            int i;
            int liczbadodatnia1 = 0;
            int liczbadodatnia2 = 0;

            System.out.println("Podaj jakąś liczbe dodatnia calkowita");
            liczba = klawiatura.nextInt();
            klawiatura.nextInt();

            for(i=1; i<liczba; i++) {
                liczbadodatnia2 = liczbadodatnia1;
                liczbadodatnia1 = liczbadodatnia2 + i;

                System.out.println("Wynik wynosi:" + liczbadodatnia1);

            }


        }







    }


