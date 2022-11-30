package ConsumerInterface;

import java.util.Arrays;
import java.util.List;

//Normal Method
/*public class PredicateDemo implements Predicate<Integer> {

    @Override
    public boolean test(Integer t) {
        if (t%2 == 0) {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        PredicateDemo pd = new PredicateDemo();
        System.out.println(pd.test(10));
    }*/
public class PredicateDemo{
    public static void main(String[] args) {
//        Predicate<Integer> p = t -> t % 2 == 0;
//        System.out.println(p.test(5));
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        //Here using filter method
//        list.stream().filter(p).forEach( (t) -> System.out.println("print Even: "+ t));
        list.stream().filter(t->t%2==0).forEach( (t) -> System.out.println("print Even: "+ t));

    }
}
