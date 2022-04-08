package com.practice.DoitJava.chapter8_inheritance_and_polymorphism.Inheritance;

/**
 * 상속을 받은 하위 클래스가 호출될 때, 상위 클래스의 생성자가 먼저 호출된다.
 */
public class VIPCustomer extends Customer{
    private int agentID;
    double saleRatio;

    /**
     * < 부모를 부르는 예약어, super >
     * 하위 클래스를 호출하면 상위 클래스의 생성자가 자동으로 먼저 호출된다.
     * 이는 하위 클래스의 생성자안에 있는 super()라는 코드 때문인데,
     * 이 예약어는 따로 작성해주지 않아도 자동으로 호출된다.
     */
    public VIPCustomer(int customerID, String customerName, int agentID) {
        /* 디폴트 생성자 호출 : super() */
        //super();
        /* 파라미터가 있는 생성자 호출 : super( , ) */
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer() 생성자 호출");
    }

    public int getAgentID () {
        return agentID;
    }

    @Override
    public int calcPrice(int price) {
        System.out.println("자식 calcPrice 호출");
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }
}
