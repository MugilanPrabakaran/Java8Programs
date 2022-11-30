package Optional;


import mapvsflatmap.Customer;
import mapvsflatmap.EkartDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalDemo {
    List<Customer>cust = EkartDatabase.getAll();

    public static void main(String[] args) throws Exception {
        Customer customer=new Customer(101, "john", null, Arrays.asList("397937955", "21654725"));

        Optional<Object> op = Optional.empty();
        //System.out.println(op);

        Optional<String> optionalmail = Optional.of(customer.getEmail());
        System.out.println(optionalmail);

        Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
        /*emailOptional2.ifPresent(System.out::println);*/
         System.out.println(emailOptional2.orElseThrow(()-> new Exception("no amail")));

    }
}
