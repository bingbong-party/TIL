package com.practice;

import com.practice.chapter6_class_and_object2.Static;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
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
}