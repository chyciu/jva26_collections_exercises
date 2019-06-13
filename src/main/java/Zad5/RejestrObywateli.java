package Zad5;

import java.rmi.StubNotFoundException;
import java.util.*;

public class RejestrObywateli {

    private Map<String, Obywatel> obywatelMap = new HashMap<>();

    public void dodajObywatela(Obywatel obywatel) {
        obywatelMap.put(obywatel.getPesel(), obywatel);
    }

    public List<Obywatel> znajdzObywateliUrodzonychPrzed(int rok) {

        List<Obywatel> listaObywateli = new ArrayList<>(obywatelMap.values());

        Set<String> kopiaPesel = new HashSet<>(obywatelMap.keySet());
        for (String pesel : kopiaPesel) {
            if (rok < 75) {
                listaObywateli.add(obywatelMap.get(pesel));
            }
        }  return listaObywateli;
    }

    public List <Obywatel> znajdzObywateliZRokuZImieniem (int rok, String imie) {

        List<Obywatel> listaObywateli = new ArrayList<>(obywatelMap.values());
         try {
                if (obywatelMap.containsKey(rok) && obywatelMap.containsValue(imie)) {
                    System.out.println(listaObywateli);
                }
            } catch (Exception e) {
                System.out.println("Obywatel nie odnaleziony");
            } return listaObywateli;
    }
}

