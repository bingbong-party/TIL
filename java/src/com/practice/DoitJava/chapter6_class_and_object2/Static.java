package com.practice.DoitJava.chapter6_class_and_object2;

/**
 * < static 변수 >
 * static 변수란 '정적 변수'라고도 한다.
 * 다른 멤버 변수처럼 클래스 내부에 선언한다.
 * 그러나 다른 멤버 변수처럼 인스턴스가 생성될 때마다 새로 생성되는 변수가 아니다.
 * static 변수는 프로그램이 메모리에 올라갔을 때 딱 한 번 메모리 공간이 할당된다.
 * 그리고 그 값은 모든 인스턴스가 공유한다.
 * 또한, static 변수는 인스턴스 생성과는 별개이므로 인스턴스보다 먼서 생성된다.
 * 따라서 클래스 이름으로 참조하여 사용할 수 있다.
 */

public class Static {
    public static int serialNum = 1000;
    public int studentID;
    public String studentName;
    public int grade;
    public String address;

    // 학생 인스턴스가 생성될 때마다 serialNum, 즉 studentID를 1씩 증가
    public Static() {
        serialNum++;
        studentID = serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
