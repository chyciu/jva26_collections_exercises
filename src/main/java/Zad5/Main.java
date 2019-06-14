package Zad5;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        RejestrObywateli rejestrObywateli = new RejestrObywateli();

        rejestrObywateli.dodajObywatela(new Obywatel("75", "Janusz", "Kowalski"));
        rejestrObywateli.dodajObywatela(new Obywatel("78", "Janusz", "Nowak"));
        rejestrObywateli.dodajObywatela(new Obywatel("90", "Tomasz", "Kowal"));
        rejestrObywateli.dodajObywatela(new Obywatel("92", "Adam", "Ewa"));
        rejestrObywateli.dodajObywatela(new Obywatel("81", "Kazimierz", "Wielki"));


       System.out.println(rejestrObywateli.znajdzObywateliUrodzonychPrzed(75));
       System.out.println(rejestrObywateli.znajdzObywateliZRokuZImieniem("75", "Janusz"));
       System.out.println(rejestrObywateli.znajdzObywatelaPoPeselu("90"));


        rejestrObywateli.dodajObywatlea2("75", "Janusz", "Kowalski");
        rejestrObywateli.dodajObywatlea2("78", "janusz", "Nowak");
        rejestrObywateli.dodajObywatlea2("90", "Tomasz", "Kowal");
        rejestrObywateli.dodajObywatlea2("85", "Malgorzata", "Nowak");
        rejestrObywateli.dodajObywatlea2("92", "Adam", "Ewa");
        rejestrObywateli.dodajObywatlea2("81", "Kazimierz", "Wielki");


    }



}
