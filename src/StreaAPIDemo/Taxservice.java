package StreaAPIDemo;

import java.util.List;
import java.util.stream.Collectors;

public class Taxservice {
    public static List<Employee> evaluteTax(String input) {
//        if (input.equalsIgnoreCase("tax")) {
//            return DataBase.getEmployees().stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList());
//        } else {
//            return DataBase.getEmployees().stream().filter(emp -> emp.getSalary() <= 500000).collect(Collectors.toList());
//        }
        //Optimizing code
        return (input.equalsIgnoreCase("tax"))
                ? DataBase.getEmployees().stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList())
                : DataBase.getEmployees().stream().filter(emp -> emp.getSalary() <= 500000).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(evaluteTax("tax"));
    }
}

