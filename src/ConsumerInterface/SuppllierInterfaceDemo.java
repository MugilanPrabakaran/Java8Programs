package ConsumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SuppllierInterfaceDemo {
    public static void main(String[] args) {
         Supplier<String> s = () ->  "Hi Mugilan";
       // System.out.println(s.get());
        List<String> list = Arrays.asList("a","b");
        System.out.println(list.stream().findAny().orElseGet(s));

    }
}
