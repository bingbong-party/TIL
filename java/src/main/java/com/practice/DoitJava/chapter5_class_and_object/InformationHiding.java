package com.practice.DoitJava.chapter5_class_and_object;

public class InformationHiding {
    /**
     * 멤버변수(특히 day)가 public일 경우 아무 값으로나 날짜 설정이 가능하다.
     * 예를 들어, 2월은 28일까지인데 29일이나 30일 등으로 입력될 경우에도 정상입력되는 것
     * 이러한 정보의 오류가 발생하는 것을 막기 위해 private을 사용하고, set메소드를 통해서만 값 입력이 가능하게 한다.
     * 그리고 set메소드에 29이상은 입력되지 않게끔 하는 로직을 구현한다.
     * => 이처럼 클래스 내부에서 사용할 변수나 메서드를 private으로 선언허고,
     *    외부에서 직접적으로 접근하지 못하게 막는 것을 정보 은닉(information hiding)이라고 한다.
     */
    /**
     * < 접근제어자의 종류 >
     * public : 외부 클래스 어디에서나 접근 가능
     * private : 동일한 클래스 내부에서만 접근 가능
     * (아무 것도 없는 경우) : default로, 동일한 패키지 내부에서만 접근 가능
     * protected : 동일한 패키지, 상속 관계의 클래스에서만 접근 가능
     *  */
    private int day;
    private int month;
    private int year;

    public void setDay(int day) {
        if(month == 2) {
            if(day < 1 && day > 28) {
                System.out.println("날짜 입력 오류입니다");
            } else {
                this.day = day;
            }
        }
    }
}
