package egzamin.przykladowy;
import java.io.File;

public class Z3 {
    public static String[] fil(String dir, String r)
    {
        File f = new File(dir);
        return f.list((d, name) -> !name.endsWith(r));
    }
}
