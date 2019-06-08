package Zad4;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Double> oceny = new ArrayList<>();

    public List<Double> getOceny() {
        return oceny;
    }

    private String indeks;
    private String imie;
    private String nazwisko;


    public Student(String indeks, String imie, String nazwisko) {
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }



    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
