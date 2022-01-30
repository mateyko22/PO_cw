package zad13;

public class Dict_test {
    public static void main(String[] args) {
        Dict sl = new Dict();
        Student marek = new Student("Marek", "Sawicki");
        Student jola = new Student("Michał", "Aaabb");
        Student ania = new Student("Ania", "Gyyh");
        Student tomek = new Student("Tomek", "Zoow");
        Student michal = new Student("Michał", "Beeq");
        Student peter = new Student("Peter", "Parket");
        sl.dodaj(marek,"bdb");
        sl.dodaj(jola,"db+");
        sl.dodaj(ania,"ndst");
        sl.dodaj(tomek,"dst");
        sl.dodaj(michal,"db-");
        sl.dodaj(peter,"bdb-");
        sl.zmien_ocene(3, "bdb");
        sl.usun(2);
        System.out.println(sl);
    }
}
