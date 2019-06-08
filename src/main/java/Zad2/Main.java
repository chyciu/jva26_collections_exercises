package Zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random ran = new Random();

        List<Integer> listaA = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int liczbaZaladowana = ran.nextInt(1000);
            listaA.add(liczbaZaladowana);
        }

        List<Integer> listaB = new ArrayList<>(listaA);
        System.out.println("Lista nieposortowana: " + listaB);

        int suma = 0;
        for (Integer elementListy : listaA) {
            suma += elementListy;
        }

        System.out.println("Suma elementów listy: " + suma);
        System.out.println("Srednia elementów z listy: " + suma / listaA.size());

        Collections.sort(listaB);
        System.out.println("Lista posortowana: " + listaB);

        if (listaB.size() % 2 == 0) {
            int indeksLewySrodkowy = (listaB.size() / 2) - 1;
            int indeksPrawySrodkowy = listaB.size() / 2;

            double mediana = (listaB.get(indeksLewySrodkowy) + listaB.get(indeksPrawySrodkowy)) / 2.0;
            System.out.println("Mediana: " + mediana);
        } else {
            int indeksSrodkowy = (listaB.size() / 2);
            int mediana = listaB.get(indeksSrodkowy);

            System.out.println("Mediana: " + mediana);
        }

        int min = listaA.get(0);
        int max = listaA.get(0);

        for (Integer elementyListy : listaA) {
            if (min > elementyListy) {
                min = elementyListy;
            }
            if (max < elementyListy) {
                max = elementyListy;
            }

            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        }

        //znadjowanie elementu max i min listy

        int indexMax = 0;
        int indeksMin = 0;
        for (int i = 0; i < listaA.size(); i++) {
            if (max == listaA.get(i)) {
                indexMax = i;
            }
            if (min == listaA.get(i)) {
                indexMax = i;
            }
        }

        System.out.println("Index max: " + indexMax);
        System.out.println("Index min: " + indeksMin);

        //znajdowanie indeksów maksymalnego elementu i minimalnego elementu
        System.out.println("Index max (indexof):" + listaA.indexOf(max));
        System.out.println("Index min (indexof):" + listaA.indexOf(min));

    }
}
