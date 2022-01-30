package zadania7.pl.imiajd.petkiewicz;

public class Adres implements Comparable<Adres>{
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private int kod_pocztowy;

    public Adres(String ulica, int numer_domu, String miasto, int kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public Adres(String ulica, int numer_domu, int numer_mieszkania, String miasto, int kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void pokaz()
    {
        System.out.println(kod_pocztowy + ", " + miasto);
        System.out.println("ul. " + ulica + " " + numer_domu + " / " + numer_mieszkania);
    }

    @Override
    public int compareTo(Adres o) {
        if (kod_pocztowy > o.kod_pocztowy)
            return -1;
        else if (o.kod_pocztowy > kod_pocztowy)
            return 1;
        else
            return 0;

    }

    public boolean przed(Adres inny)
    {
        if (this.compareTo(inny) == 1)
            return false;
        else
            return true;
    }

}

