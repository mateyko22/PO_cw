package zad12;
import java.util.Collections;
import java.util.*;
import java.util.Stack;

public class LinkedList_test {
    public static void main(String[] args) {
        LinkedList<String> workers = new LinkedList<>();
        workers.add("Adam");
        workers.add("Pawel");
        workers.add("Artur");
        workers.add("Michał");
        workers.add("Janusz");
        workers.add("Grażyna");
        workers.add("Danuta");
        workers.add("Jadzia");
        workers.add("Adolf");
//        System.out.println(workers);
//        redukuj(workers,3);
//        System.out.println(workers);
//        odwroc(workers);
//        System.out.println(workers);
        System.out.println("Ala ma kota. Jej kot lubi myszy. Myszy lubi kot jej.");
        odwroc_napis("Ala ma kota. Jej kot lubi myszy. Myszy lubi kot jej.");
        System.out.println();
        grek(199);
        print(workers);

    }

    public static <T>void redukuj(LinkedList<T> pracownicy, int n)
    {
        Iterator<T> iter = pracownicy.iterator();
        int count = 0;
        while (iter.hasNext())
        {
            count++;
            iter.next();
            if (count == n)
            {
                iter.remove();
                count =0;
            }
        }
    }

    public static <T> void odwroc(LinkedList<T> lista)
    {
        Collections.reverse(lista);
    }

    public static void odwroc_napis(String zdanie)
    {
        Stack<String> stos = new Stack<>();
        String[] tab = zdanie.split("\\p{Punct}");
        for (String e: tab)
        {
            boolean helper = true;
            String[] tab2 = e.split(" ");
            for (String f: tab2)
            {
                stos.push(f.trim());
            }
            while (!stos.empty())
            {
                String help = stos.pop().toLowerCase();
                if (stos.size() == 0)
                {
                    System.out.print(help + ". ");
                    continue;
                }
                if (!helper)
                    System.out.print(help + " ");
                else{
                    System.out.print(help.substring(0,1).toUpperCase() + help.substring(1) + " ");
                    helper = false;
                }

            }
        }

    }

    public static void rok(int n)
    {
        Stack<Integer> stos = new Stack<>();
        while(n!=0)
        {
            int help = n%10;
            n/=10;
            stos.push(help);
        }

        while (!stos.empty())
            System.out.print(stos.pop() + " ");
    }
    public static void grek(int n)
    {
        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes, true);
        for (int i=2; i<Math.sqrt(n); i++)
        {
            if (primes[i])
            {
                for (int j=i*i; j<n+1; j+=i)
                {
                    primes[j] = false;
                }
            }
        }
        for (int i=2; i<n+1; i++)
            if (primes[i])
                System.out.print(i + " ");
    }

    public static <E, T extends Iterable<E>> void print(T obj)
    {
//        Iterator<E> iter = obj.iterator();
//        while (iter.hasNext())
//
//            System.out.print(iter.next() + ", ");
//        }
        for (E elem: obj)
        {
            System.out.print(elem + ", ");
        }
    }
}

