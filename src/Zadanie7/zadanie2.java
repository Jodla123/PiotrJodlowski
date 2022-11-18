package Zadanie7;
import java.util.Scanner;
public class zadanie2 {


    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);


    int speed = 0;
    int czas;
    int suma;

    System.out.println("wpisz prędkość poruszania sie auta: ");
    speed = klawiatura.nextInt();
    klawiatura.nextLine();


    System.out.println("Podaj czas podróży: ");
    czas = klawiatura.nextInt();
    klawiatura.nextLine();

    for(int i =1; i <= czas; i++)
    {
        suma = speed*i;
        System.out.println("w czasie" +i+ "godzin przejedzesz "+suma+ "kilometrow");



    }




    }



}