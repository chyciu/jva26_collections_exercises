package Zad5;

import java.rmi.StubNotFoundException;
import java.util.*;

public class RejestrObywateli {

    private Map<String, Obywatel> obywatelMap = new HashMap<>();

    public void dodajObywatela(Obywatel obywatel) {
        obywatelMap.put(obywatel.getPesel(), obywatel);
        System.out.println(obywatelMap.toString());
    }

    public void dodajObywatlea2(String pesel, String imie, String nazwisko) {

        List<Obywatel> obywatelList = new ArrayList<>(obywatelMap.values());
        System.out.println(obywatelList);
    }

    public List<Obywatel> znajdzObywateliUrodzonychPrzed(int rok) {

        List<Obywatel> listaObywateli = new ArrayList<>(obywatelMap.values());

        Set<String> kopiaPesel = new HashSet<>(obywatelMap.keySet());
        for (String pesel : kopiaPesel) {
            if (rok < 75) {
                listaObywateli.add(obywatelMap.get(pesel));
            }
        }
        return listaObywateli;
    }

    public List<Obywatel> znajdzObywateliZRokuZImieniem(String pesel, String imie) {

        List<Obywatel> listaObywateli = new ArrayList<>(obywatelMap.values());
          try {
             if (listaObywateli.contains(pesel) && listaObywateli.contains(imie)) {
                System.out.println(listaObywateli.toString().contains(imie));
            }
          } catch (Exception e) {
               System.out.println("Obywatel nie odnaleziony");
           } return listaObywateli;
         }

     public Obywatel znajdzObywatelaPoPeselu (String pesel) {

       if (obywatelMap.containsKey(pesel))
           System.out.println(obywatelMap.containsKey(pesel));
       else
           System.out.println("Nie ma takiego obywatela");
           return obywatelMap.get(pesel);
        }
     }




