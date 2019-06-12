package Zad3;

public class Student {

    private String index;
    private String name;
    private String surname;
    private Gender gender;

    public Student(String index, String name, String surname, Gender gebder) {
        this.index = index;
        this.name = name;
        this.surname = surname;
        this.gender = gebder;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    // metodę toString dodajemy Alt+Insert
    @Override
    public String toString() {
        return "Student{" +
                "index='" + index + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gebder=" + gender +
                '}';
    }
}
