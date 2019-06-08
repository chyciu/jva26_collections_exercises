package Zad1;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random ran = new Random ();

        List<Integer> lista = new ArrayList<>();

        //wczytanie liczb ze scannera
        for (int i = 0; i < 5 ; i++) {
           // System.out.println("Podaj pięć liczb.");
            int liczbaZaladowana = in.nextInt();
            lista.add (liczbaZaladowana);
      }

        //wczytanie liczb ze generatora losowego
        for (int i = 0; i < 5 ; i++) {
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
