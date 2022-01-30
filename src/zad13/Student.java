package zad13;
import java.lang.Comparable;

public class Student implements Comparable<Student>{
    public Student(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        id = nextId++;
    }

    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", imie: "+ imie + ", nazwisko: " + nazwisko;
    }

    @Override
    public int compareTo(Student o) {
        return getNazwisko().compareTo(o.getNazwisko());
    }

    private String imie;
    private String nazwisko;
    public final int id;
    static int nextId;
}
