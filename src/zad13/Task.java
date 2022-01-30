package zad13;

public class Task implements Comparable<Task>{
    public Task(int priorytet, String opis) {
        this.priorytet = priorytet;
        this.opis = opis;
    }

    @Override
    public int compareTo(Task o) {
        if (priorytet < o.priorytet)
            return -1;
        else if (priorytet == o.priorytet)
            return 0;
        else
            return 1;
    }

    public int getPriorytet() {
        return priorytet;
    }

    public String getOpis() {
        return opis;
    }

    public void setPriorytet(int priorytet) {
        this.priorytet = priorytet;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "Task{" +
                "priorytet=" + priorytet +
                ", opis='" + opis + '\'' +
                '}';
    }

    public int priorytet;
    public String opis;
}
