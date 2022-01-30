package zad13;
import zad11.Pair;

import java.util.*;

public class Dict {
    public Dict()
    {
        dict = new TreeMap<>();
    }

    public void dodaj(Student student, String ocena)
    {
        dict.put(student, ocena);
    }

    public void dodaj(Student student)
    {
        dict.put(student, "---");
    }

    public void usun(int id)
    {
        Student temp;
        for (Map.Entry<Student, String> en: dict.entrySet()){
            Student k = en.getKey();
            if (k.getId() == id) {
                dict.remove(k);
                return;
            }
        }
    }

    public void zmien_ocene(int id, String ocena)
    {
        Student temp;
        for (Map.Entry<Student, String> en: dict.entrySet()){
            Student k = en.getKey();
            if (k.getId() == id) {
                dict.replace(k, ocena);
                return;
            }
        }
    }

    @Override
    public String toString() {
        String rt = "";
        for(Map.Entry<Student, String> en: dict.entrySet())
        {
            String k = en.getKey().getImie();
            String h = en.getKey().getNazwisko();
            String v = en.getValue();
            int i = en.getKey().getId();
            rt += (i + ". " + k + " " + h + ": " + v + "\n");

        }
        return rt;
    }

    private Map<Student, String> dict;
}
