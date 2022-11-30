package StreamSortDemo;

import StreaAPIDemo.DataBase;
import StreaAPIDemo.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Sortlistdemo {
    public static void main(String[] args) {
        List<Employee> Emp = DataBase.getEmployees();
        /*Collections.sort(Emp, new MyLogic());
        System.out.println(Emp);*/
        //Using Java 8
        Collections.sort( Emp,(o1, o2) ->  (int) (o1.getSalary()-o2.getSalary()));//Ascending Order
        Collections.sort( Emp,(o1, o2) ->  (int) (o2.getSalary()-o1.getSalary()));//Descending Order
        //System.out.println(Emp);
        //Using Stream
        Emp.stream().sorted((o1, o2) ->  (int) (o1.getSalary()-o2.getSalary())).forEach(System.out::println);//Ascending Order
        Emp.stream().sorted((o1, o2) ->  (int) (o2.getSalary()-o1.getSalary())).forEach(System.out::println);//Descending Order
        //Approach 2
        Emp.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
    }
}
/*class MyLogic implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary()-o2.getSalary());
    }*/



