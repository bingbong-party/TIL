package com.practice;

import com.practice.DoitJava.chapter6_class_and_object2.SingletonPattern;
import com.practice.DoitJava.chapter6_class_and_object2.Static;
import com.practice.DoitJava.chapter8_inheritance_and_polymorphism.Inheritance.Customer;
import com.practice.DoitJava.chapter8_inheritance_and_polymorphism.Inheritance.VIPCustomer;
import org.junit.Test;

public class MainTest {
//    @Test
    public void staticTest() {
        Static student1 = new Static();
        student1.setStudentName("빙봉");
        System.out.println(student1.serialNum);

        Static student2 = new Static();
        student2.setStudentName("쟌쟌");
        /**
         * static변수는 인스턴스가 생성되지 않아도 사용할 수 있기 때문에
         * 보통은 Static.serialNum과 같이 클래스 이름과 함께 사용한다.
         */
        System.out.println(Static.serialNum);
    }

//    @Test
    public void singletonPatternTest() {
        SingletonPattern singleton1 = SingletonPattern.getInstance();
        SingletonPattern singleton2 = SingletonPattern.getInstance();
        System.out.println(singleton1==singleton2);
    }

//    @Test
    public void inheritanceTest() {
        VIPCustomer customerKim = new VIPCustomer(10020, "빙봉", 11);
        customerKim.setBonusPoint(10000);
        System.out.println(customerKim.showCustomerInfo());
    }

    @Test
    public void polymorphismTest() {
        Customer vc = new VIPCustomer(10021,"빙봉2", 12);
        vc.setBonusPoint(1000);
        System.out.println(vc.getCustomerName() + "님이 지불할 금액은 " + vc.calcPrice(10000) + "원입니다.");
    }
}