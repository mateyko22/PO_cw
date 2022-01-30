package zadania7.pl.imiajd.petkiewicz;

public class Student extends Osoba{
    private String kierunek;
    private int rok;

    public Student(String nazwisko, int wiek, String kierunek, int rok)
    {
        this.nazwisko = nazwisko;
        this.kierunek = kierunek;
        this.rok = rok;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "nazwisko: " + nazwisko + ", wiek: " + wiek + ", kierunek: " + kierunek + ", rok: " + rok;
    }

    public int getRok() {
        return rok;
    }

    public String getKierunek() {
        return kierunek;
    }
}
