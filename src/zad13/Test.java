package zad13;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        ToDoList kolejka = new ToDoList();
        kolejka.dodaj(11,"jeden");
        kolejka.dodaj(2,"dwa");
        kolejka.dodaj(56,"trzy");
        kolejka.dodaj(3,"czt");
        System.out.println(kolejka.nastepne());
        System.out.println(kolejka.nastepne());
        System.out.println(kolejka);
    }

}
