package com.practice.chapter6_class_and_object2;

public class SingletonPattern {
    // 인스턴스를 private 으로 선언하여 외부로부터의 접근을 막는다.
    private static SingletonPattern instance = new SingletonPattern();
    // 접근제어자가 private 이므로 외부 클래스에서 마음대로 인스턴스를 생성할 수 없다.
    private SingletonPattern() { }

    /*
    반드시 static 으로 선언해주어야 한다.
    getInstance() 메서드는 인스턴스 생성과 상관없이 호출할 수 있어야 하기 때문이다.
     */
    public static SingletonPattern getInstance() {
        if (instance==null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
}

