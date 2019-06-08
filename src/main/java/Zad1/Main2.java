package Zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main2 {


        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            Random ran = new Random ();

            List<Integer> lista = new ArrayList<>();

            System.out.println("Podaj ilosc wczytanych liczb od uzytkownika");
            int iloscObiegowPetliScanner = in.nextInt();

            System.out.println("Podaj ilosc wylosowanych liczb");
            int iloscObbiegowPetliRandom = in.nextInt();

            //wczytanie liczb ze scannera
            while ((iloscObiegowPetliScanner --) > 0) {
                System.out.println("Podaj liczbę: ");
                int liczbaZaladowana = in.nextInt();
                lista.add(liczbaZaladowana);
            }

            //wczytanie liczb ze generatora losowego
            while ((iloscObbiegowPetliRandom --) > 0) {
                System.out.println("Podaj liczbę: ");
                int liczbaZaladowana = ran.nextInt(1000);
                lista.add(liczbaZaladowana);

            }



            // wypisanie listy
            System.out.println(lista);

            //sumowanie listy
            int suma = 0;
            for (Integer elementListy : lista) {
                suma += elementListy;
            }

            //wypisuję wynik na ekran
            System.out.println("Suma: " + suma);
            System.out.println("średnia: "+ (suma/ lista.size()));

        }
    }

