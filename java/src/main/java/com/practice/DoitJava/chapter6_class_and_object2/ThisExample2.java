package com.practice.DoitJava.chapter6_class_and_object2;


// < 생성자에서 또 다른 생성자를 호출하는 경우에서 쓰이는 this >
class Person {
    String name;
    int age;

    Person () {
        this("이름 없음", 1);
    }

    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ThisExample2 {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.name);
        System.out.println(person1.age);
    }
}