package Zad5;

public class Obywatel {

    public String pesel;
    public String imie;
    public String nazwisko;


    public Obywatel(String pesel, String imie, String nazwisko) {
        this.pesel = pesel;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }


    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
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

    @Override
    public String toString() {
        return "Obywatel{" +
                "pesel='" + pesel + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
