package java8.colecoes;

import exercises.varargs.A;

import java.util.ArrayList;

public class Removendo {

    public static void main(String[] args) {
        ArrayList<MyClass> list = new ArrayList<>();

        MyClass v1 = new MyClass("v1", "abc");
        MyClass v2 = new MyClass("v2", "abc");
        MyClass v3 = new MyClass("v3", "abc");

        list.add(v1);
        list.add(v2);
        list.add(v3);

        list.remove(v3);
        list.removeIf(m -> m.getId().equals("v2"));

        list.forEach(m -> System.out.println(m.getId()));

        MyClass[] list2 = list.toArray(new MyClass[0]);

        MyClass[] a1 = new MyClass[list.size()];
        MyClass[] a2 = list.toArray(a1);

        System.out.println(a1 == a2);


    }
}


class MyClass {

    String id;
    String nome;

    public MyClass(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return this.id;
    }
}