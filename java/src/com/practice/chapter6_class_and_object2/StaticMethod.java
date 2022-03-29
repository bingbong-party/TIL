package com.practice.chapter6_class_and_object2;

/**
 * 일반 멤버 변수를 위한 메서드가 존재하듯 static 변수를 위한 메서드가 존재한다
 * 이를 static 메서드 혹은 클래스 메서드라고 칭한다.
 * static 변수를 직접 참조하지 못하도록 private 으로 선언하고 이를 위한 get() set() 메서드를 생성하자.
 *
 */
public class StaticMethod {
    private static int serialNum = 1000;
    public int studentID;
    public String studentName;

    public StaticMethod() {
        serialNum++;
        studentID = serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }
}
