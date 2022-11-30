package ConsumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CusDemo  {
/*Traditional Java way to use this method
    @Override
    public void accept(Integer t) {
        System.out.println("print : "+ t);
    }

    public static void main(String[] args) {
        CusDemo c = new CusDemo();
        c.accept(10);
    }*/
    //JAVA 8
public static void main(String[] args) {
    Consumer c = (t) -> System.out.println("Print : "+ t);
    c.accept(10);
 List<Integer> list = Arrays.asList(1,2,3,4,5);
 list.stream().forEach( (t) -> System.out.println("print : "+ t));
}
}
