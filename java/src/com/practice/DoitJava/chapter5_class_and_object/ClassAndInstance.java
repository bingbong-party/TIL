package com.practice.DoitJava.chapter5_class_and_object;

// 클래스에 main함수 포함해보기
public class ClassAndInstance {
    int studentId;
    String studentName;
    int grade;
    String address;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    /**
     * main함수는 JVM이 프로그램을 시작하기 위해 호출하는 함수이다.
     * 클래스 내부에 만들지만, 메서드는 아니다.
     */
    public static void main(String[] args) {
        /**
         * 예약어 new를 사용해 객체를 생성할 수 있다.
         * 이 때, '힙'메모리 공간을 할당받는다.
         * 지역변수 student는 '스택'에 할당되고, 이 student가 '힙'내부의 객체(CLassAndInstance)를 가리킨다
         * 즉, 힙 내부에 위치한 객체의 '주소'값을 변수 student가 저장하고 있다.
         */
        ClassAndInstance student = new ClassAndInstance();
        student.setStudentName("빙봉");

        System.out.println(student.getStudentName());
    }
}
/**
 * < 메모리 '힙'에 대하여 >
 * 힙(Heap)은 프로그램에서 사용하는 동적 메모리 공간을 말한다.
 * 일반적으로 프로그램은 힙, 스택, 메모리 이렇게 세 영역을 사용하는데, 객체가 생성될 때 사용하는 공간이 힙이다.
 * 힙은 동적으로 할당되며 사용이 끝나면 메모리를 해제해주어야 한다.
 * C나 C++언어는 프로그래머가 직접 메모리를 해제해야 하지만,
 * 자바에서는 가비지 컬렉터(garbage collector)가 자동으로 메모리를 해제해준다.
 */