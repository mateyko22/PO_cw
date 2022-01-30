package zad13;
import java.util.PriorityQueue;

public class ToDoList {
    public ToDoList()
    {
        toDoList = new PriorityQueue<>();
    }

    public void dodaj(int priorytet, String opis){
        toDoList.add(new Task(priorytet, opis));
    }

    public Task nastepne()
    {
        return toDoList.poll();
    }

    public void zakoncz(){
        toDoList.clear();
    }

    @Override
    public String toString() {
        return "toDoList=" + toDoList +
                '}';
    }

    private PriorityQueue<Task> toDoList;
}
