package Zad4;

import java.rmi.StubNotFoundException;
import java.util.*;

public class Dziennik {

    private Map<String, Student> studentMap = new HashMap<>();

    public void dodajStudenta (Student student) {
        //umiesc na mapie studenta
        // kluczem wpisu jest indeks, wartoscia obiekt student
        studentMap.put(student.getIndeks(), student);
    }

    //usuwanie studenta
    public void usunStudenta (Student student) {
        //zwroc uwagę - parametrem jest INDEKS, a nie obiekt student
        studentMap.remove(student.getIndeks());
    }

    public void usunStudenta (String indeks) {
        studentMap.remove(indeks);
    }

    // opcja 1 - rzuć excpetion
    public Optional<Student> zwrocStudenta1 (String indeks) {
        if (studentMap.containsKey(indeks)) {
            return Optional.ofNullable(studentMap.get(indeks));
        }
        return Optional.empty();
    }

    // opcja 2 - rzuć excpetion
    public Student zwrocStudenta2 (String indeks) throws StubNotFoundException {
        if (studentMap.containsKey(indeks)) {
            return studentMap.get(indeks);
        }
        throw new StubNotFoundException("Student z podanym indeksem nie jest znaleziony");
    }

    // opcja 3 - zła !!! Ta metoda może zwrócic null co jest nieprawidlowe.
    public Student zwrocStudenta2_zle (String indeks) {
        if (studentMap.containsKey(indeks)) {
            return studentMap.get(indeks);
        } return null;
    }

    public double podajSrednia (String indeks) throws StubNotFoundException {
        double sum = 0.0;

        Student studentKtoregoredniaLiczymy = zwrocStudenta2(indeks);
        for (Double ocena : studentKtoregoredniaLiczymy.getOceny()) {
            sum += ocena;
        } return sum / studentKtoregoredniaLiczymy.getOceny().size();
    }

    public List<Student> zwrocZagrozonych ()  {
        List<Student> listaWynikowa = new ArrayList<>();

        //magia, skopiowanie listy indeksow przed sprawdzaniem. zabepiecza przed bledem, kiedy ktos usunie studenta
        // z listy w trakcie sprawdzania.
        Set<String> kopiaIndesow = new HashSet<>(studentMap.keySet());
        for (String indeks : kopiaIndesow) {
            try {
                if (podajSrednia(indeks) <= 2.0) {
                    listaWynikowa.add(studentMap.get(indeks));
                }
            } catch (StubNotFoundException e) {
                System.out.println("Student nie odnaleziony");
            }
        } return listaWynikowa;
    }

    public List<Student> zwrocPosortowanaListeStudentow () {
        // kopiuje wszystkch studentow z mapy (wartosci) do Listy
        List<Student> studentList = new ArrayList<>(studentMap.values());

        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // zwrot 1 oznacza o1 > o2
                // zwor 0 oznacza ze są rowne
                // zwort -1 oznacza, ze o1 < o2
                int indeks1 = Integer.parseInt(o1.getIndeks());
                int indeks2 = Integer.parseInt(o2.getIndeks());
                return  Integer.compare(indeks1, indeks2);
            }
        }); return studentList;
    }


}
