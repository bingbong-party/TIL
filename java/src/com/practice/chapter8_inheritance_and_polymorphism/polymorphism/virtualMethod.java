package com.practice.chapter8_inheritance_and_polymorphism.polymorphism;

import com.practice.chapter8_inheritance_and_polymorphism.Inheritance.Customer;
import com.practice.chapter8_inheritance_and_polymorphism.Inheritance.VIPCustomer;

/**
 * 변수 vc는 자식 인스턴스로 생성되었으나, 부모 클래스로 형변환 된다.
 * 그러나, 부모 자식 클래스에 동일하게 존재하는 메서드를 호출하면 자식 인스턴스의 메서드가 호출된다.
 * 이렇게 인스턴스의 메서드가 호출되는 기술을 '가상 메서드(virtual method)'라고 한다.
 */
public class virtualMethod {
    public static void main(String[] args) {
        Customer vc = new VIPCustomer(10021,"빙봉2", 12);
        vc.setBonusPoint(1000);
        System.out.println(vc.getCustomerName() + "님이 지불할 금액은 " + vc.calcPrice(10000) + "원입니다.");
    }
}
