package egzamin.przykladowy;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public interface IntSequence {

    static List<Integer> of(Integer... numbers)
    {
        Stream<Integer> stream = Stream.of(numbers);
        Stream<Integer> streamInfinity = Stream.generate(() -> 1).limit(100);
        return Stream.concat(stream, streamInfinity).collect(Collectors.toList());
    }

    static List<Integer> squares(int number)
    {
        return Stream.iterate(number, x -> x + 1).map(x -> x * x).limit(100).collect(Collectors.toList());
    }
    }