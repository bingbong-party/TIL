package com.practice.DoitJava.chapter6_class_and_object2;

class BirthDay {
    int day;
    int month;
    int year;

    public void setYear(int year) {
        this.year = year;
    }

    public void printThis() {
        System.out.println(this);
    }
}

public class ThisExample {
    public static void main(String[] args) {
        BirthDay bDay = new BirthDay();
        bDay.setYear(2022);
        System.out.println(bDay);
        bDay.printThis();
    }
}

/**
 * < 하나의 파일에 클래스가 여러개 존재하는 경우 >
 * 자바 파일에는 여러개의 클래스가 존재하는 것이 가능하다.
 * 이 때, public 클래스는 단 한 개이다.
 * 또한, 이 public 클래스와 자바 파일명은 동일해야 한다.
 */