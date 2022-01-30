package zadania7.pl.imiajd.petkiewicz;

import java.util.Date;

public class Osoba {
    public String nazwisko;
    public int wiek;

    public Osoba()
    {
        nazwisko = "";
    }
    public Osoba(String nazwisko, int wiek)
    {
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    @Override
    public String toString()
    {
        return "nazwisko: " + nazwisko + ", wiek: " + wiek;
    }

    public int getWiek() {
        return wiek;
    }

    public String getNazwisko() {
        return nazwisko;
    }
}
