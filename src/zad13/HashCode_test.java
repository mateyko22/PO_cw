package zad13;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class HashCode_test {
    public static void main(String[] args) throws FileNotFoundException {
        Map<Integer, HashSet<String>> mapa = new HashMap<>();
        Scanner in = new Scanner(new File("src\\zad13\\pablito.txt"));
        while (in.hasNext()) {
            String hlp = in.next();
            int hs = hlp.hashCode();
            if (!mapa.containsKey(hs)) {
                mapa.put(hs, new HashSet<>());
            }
            mapa.get(hs).add(hlp);
        }
        for (Map.Entry<Integer, HashSet<String>> entry: mapa.entrySet()){
            int k = entry.getKey();
            HashSet<String> v = entry.getValue();
            if (v.size() > 1){
                System.out.println(k + ": " + v);
            }
        }
    }
}
