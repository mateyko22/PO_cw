package zadania10;

import java.time.LocalDate;
import java.util.Objects;

public class Osoba<T> implements Cloneable, Comparable<T>{
    private String nazwisko;
    private LocalDate dataUrodzenia;

    @Override
    public String toString() {
        return "Osoba{" +
                "nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                '}';
    }

    public boolean equals(Osoba o) {
        if (nazwisko.equals(o.nazwisko) && dataUrodzenia == o.dataUrodzenia)
            return true;
        else
            return false;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
