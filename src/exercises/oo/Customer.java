package exercises.oo;

import java.util.HashSet;

public class Customer {

    String name;
    int age;

    Customer(String name, int id) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Customer c1 = new Customer("J", 20);
        Customer c2 = new Customer("J", 20);

        HashSet<Customer> set = new HashSet<>();
        set.add(c1);
        set.add(c2);
        System.out.println(set.size());

    }
}
