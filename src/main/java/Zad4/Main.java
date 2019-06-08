package Zad4;

import jdk.nashorn.internal.ir.Optimistic;

import java.rmi.StubNotFoundException;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Dziennik dziennik = new Dziennik();

        Optional<Student> s = dziennik.zwrocStudenta1("123");
        if (s.isPresent()) {
            Student wypakowanyZKartonu = s.get();
            System.out.println(wypakowanyZKartonu);
        }

        Student student = dziennik.zwrocStudenta2_zle("123");
           if (student != null) {
                System.out.println(student.getImie());
            }

         try {
             Student student_2 = dziennik.zwrocStudenta2("123");
             //jesli kod dotrał w to miejsce to znaczy, że student istnieje
             System.out.println(student_2);
         } catch (StubNotFoundException e) {
             System.out.println("Błąd, student nie znaeziony");
         }

       }

    }

