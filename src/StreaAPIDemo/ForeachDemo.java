package StreaAPIDemo;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForeachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mukil");
        list.add("Shri");
        list.add("MukilShri");
        //Normal way of filter
        for(String s : list){
            if (s.startsWith("M")){
                System.out.println(s);
            }
        }
        //using Java 8
        list.stream().filter((t)-> t.startsWith("M")).forEach(t->System.out.println(t));
        //Normal way of Map
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        for (String s : map.values()
             ) {
            System.out.println(s);
        }
//        //Optimizing Java 8
        map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(k -> System.out.println(k));
    }
}
