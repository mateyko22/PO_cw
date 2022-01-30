package zadania7.pl.imiajd.petkiewicz;


public class TestNazwanyPunkt
{
    public static void main(String[] args)
    {
        NazwanyPunkt a = new NazwanyPunkt(3, 5, "port");
        a.show();

        Punkt b = new Punkt(3, 5);
        b.show();

        Punkt c = new NazwanyPunkt(3, 6, "tawerna");
        c.show();

        // a = b;                 --- powoduje błąd kompilacji  (dlaczego ?)
        // a = (NazwanyPunkt) b;     --- powoduje błąd wykonania   (dlaczego ?)

        // a = c;                 --- powoduje błąd kompilacji  (dlaczego ?)
        a = (NazwanyPunkt) c;
        a.show();


//        Adres a1 = new Adres("Stacha Konwy", 31, "Myszyniec", 17430);
//        Adres a2 = new Adres("Jana Janowicza", 3, 25, "Olsztyn", 26-420);
//        a1.pokaz();
//        System.out.println(a2.przed(a1));
    }
}