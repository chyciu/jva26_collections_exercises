package Zad3;

import java.util.ArrayList;
import java.util.List;

public class MainStudent {

   public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("123", "Pawel", "Kowalski", Gender.MALE));
        studentList.add(new Student("133", "Tomek", "Kowalski", Gender.MALE));
        studentList.add(new Student("344", "Jarek", "Nowak", Gender.MALE));
        studentList.add(new Student("455", "Monika", "Nowak", Gender.FEMALE));
        studentList.add(new Student("345", "Beata", "Gagagag", Gender.FEMALE));
        studentList.add(new Student("667", "Anna", "Jajaja", Gender.FEMALE));
        studentList.add(new Student("765", "Tadeusz", "Jajjaaj", Gender.MALE));
        studentList.add(new Student("888", "Weronika", "Kakakak", Gender.FEMALE));
        studentList.add(new Student("667", "Jan", "Oajaja", Gender.MALE));

        System.out.println(studentList);

        for (Student elementyListy : studentList) {
            System.out.println(elementyListy);
        }

        for (Student elementyListy : studentList) {
            if (elementyListy.getGender() == Gender.FEMALE);
            System.out.println(elementyListy);
        }




    }

}
