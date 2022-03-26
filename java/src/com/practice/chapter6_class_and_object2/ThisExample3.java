package com.practice.chapter6_class_and_object2;

// 자신의 주소를 반환하는 this
class AdressPerson {
    String name;
    int age;

    AdressPerson () {
        this("이름 없음", 1);
    }

    AdressPerson (String name, int age) {
        this.name = name;
        this.age = age;
    }

    AdressPerson returnItSelf() {
        return this;
    }
}

public class ThisExample3 {
    public static void main(String[] args) {
        AdressPerson person1 = new AdressPerson();
        System.out.println(person1.name);
        System.out.println(person1.age);

        AdressPerson person2 = person1.returnItSelf();
        System.out.println(person1);
        System.out.println(person2);
    }
}
