package zad11;

public class PairUtil {
    public static <T> Pair swap(Pair<T> elem)
    {
        return new Pair<>(elem.getSecond(), elem.getFirst());
    }
}
