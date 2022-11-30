package ParallelStream;

import MapReduce.Employee;
import MapReduce.EmployeeDatabase;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        //Initializing the time
        long start = 0;
        long end = 0;
        //Normal Stream
        start = System.currentTimeMillis();
        IntStream.range(1,100).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Normal Stream timing : "+(end-start));

        System.out.println("==========================================");
        //Parallel Stream
        start = System.currentTimeMillis();
        IntStream.range(1,100).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Normal Stream timing : "+(end-start));
        //Find Thread name and time
        IntStream.range(1,10).forEach(x->{
            System.out.println("Thread : "+Thread.currentThread().getName()+" : "+x);
        });
        IntStream.range(1,10).parallel().forEach(x->{
            System.out.println("Thread : "+Thread.currentThread().getName()+" : "+x);
        });
        List<Employee> employees = EmployeeDatabase.getEmployees();

        //normal
        start=System.currentTimeMillis();
        double salaryWithStream = employees.stream()
                .map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end=System.currentTimeMillis();

        System.out.println("Normal stream execution time : "+(end-start)+" : Avg salary : "+salaryWithStream);
        //Parallel Stream
        start=System.currentTimeMillis();
        double salaryWithParallelStream = employees.parallelStream()
                .map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();

        end=System.currentTimeMillis();

        System.out.println("Parallel stream execution time : "+(end-start)+" : Avg salary : "+salaryWithParallelStream);

    }
}


