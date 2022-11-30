package mapvsflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapvsflatMapDemo {
    public static void main(String[] args) {
        List<Customer> list = EkartDatabase.getAll();
        //List<Customer>  convert List<String> -> Data Transformation
        //mapping : customer -> customer.getEmail()
        //customer -> customer.getEmail()  one to one mapping
        List<String> emails = list.stream().map(Customer::getEmail).collect(Collectors.toList());
        System.out.println(emails);
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        List <List<String>> phonenumbers = list.stream().map(Customer::getPhoneNumbers).collect(Collectors.toList());
        System.out.println(phonenumbers);
        //List<Customer>  convert List<String> -> Data Transformation
        //mapping : customer -> phone Numbers
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        List<String> phone = list.stream().flatMap(Customer-> Customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phone);
    }
}

