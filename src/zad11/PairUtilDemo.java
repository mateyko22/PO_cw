package zad11;

public class PairUtilDemo {
    public static void main(String[] args) {
        Pair<String> para = new Pair<>("abc","efg");
        para = PairUtil.swap(para);
        System.out.println(para.getFirst());
        System.out.println(para.getSecond());
    }
}
