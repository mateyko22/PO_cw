package egzamin.przykladowy;

import java.math.BigInteger;
import java.time.LocalDate;

public class ArrayUtil {
    public static void main(String[] args) {
        LocalDate[] t1 = {LocalDate.of(1999,12,7), LocalDate.of(1949, 12, 8), LocalDate.of(2000, 1, 1)};
        System.out.println(isSorted(t1));

        String[] t2 = {"a", "b", "z", "g"};
        System.out.println(isSorted(t2));

    }
    public static <T extends Comparable<? super T>> boolean isSorted(T[] tab)
    {
        for (int i=0; i<tab.length-1; i++){
            if (tab[i].compareTo(tab[i+1]) > 0)
                return false;
        }
        return true;
    }
}
