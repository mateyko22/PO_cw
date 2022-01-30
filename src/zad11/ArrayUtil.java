package zad11;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.time.LocalDate;
import java.util.Iterator;

public class ArrayUtil {
    public static void main(String[] args) {
        ArrayList<Integer> t1 = new ArrayList<>();
        t1.add(2);
        t1.add(3);
        t1.add(4);
        t1.add(5);
        t1.add(8);
        ArrayList<Integer> t2 = new ArrayList<>();
        t2.add(48);
        t2.add(74);
        t2.add(1);
        t2.add(2);
        t2.add(8);

        ArrayList<LocalDate> t3 = new ArrayList<>();
        t3.add(LocalDate.of(1979, 8, 31));
        t3.add(LocalDate.of(1999, 12, 7));
        t3.add(LocalDate.of(2000, 2, 25));
        t3.add(LocalDate.of(1989, 11, 8));
        System.out.println(isSorted(t3));
        selectionSort(t3);
        System.out.println(isSorted(t3));
    }

    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> tab1)
    {
        Iterator<T> iter = tab1.iterator();
        T el = iter.next();
        while(iter.hasNext())
        {
            T el2 = iter.next();
            if (el.compareTo(el2) > 0)
                return false;
            el = el2;
        }
        return true;
    }


    public static <T extends Comparable<? super T>> int binSearch(ArrayList<T> tab1, T obj)
    {
        if (Collections.binarySearch(tab1, obj) < 0)
            return -1;
        return Collections.binarySearch(tab1, obj);
    }

    public static <T extends Comparable<? super T>> void selectionSort(ArrayList<T> tab1)
    {
        int min_index;
        for (int i=0; i<tab1.size(); i++)
        {
            min_index = i;
            for (int j=i+1; j<tab1.size(); j++)
            {
                if (tab1.get(j).compareTo(tab1.get(min_index)) < 0)
                    min_index = j;

            }
            T temp = tab1.get(min_index);
            tab1.set(min_index, tab1.get(i));
            tab1.set(i, temp);
        }

    }
}
