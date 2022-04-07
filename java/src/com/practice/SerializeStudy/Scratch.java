package com.practice.SerializeStudy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class Scratch {
    public static void main(String[] args) {
        String byteString = serialize();
        System.out.println("직렬화 : " + byteString);

        byte[] serializedMember = Base64.getDecoder().decode(byteString);
        deserialize(serializedMember);
    }

    // 직렬화
    private static String serialize() {
        Member member = new Member("bingbong", "aa@aa.com", 26);
        byte[] serializeMember;
        String serializeMemberStr = "";
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            try (ObjectOutputStream oos = new ObjectOutputStream(bos)) {
                oos.writeObject(member);
                serializeMember = bos.toByteArray();
                serializeMemberStr = Base64.getEncoder().encodeToString(serializeMember);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return serializeMemberStr;
    }

    // 역직렬화
    private static void deserialize(byte[] serializedMember) {
        try (ByteArrayInputStream bis = new ByteArrayInputStream(serializedMember)) {
            try (ObjectInputStream ois = new ObjectInputStream(bis)) {
                Object o = ois.readObject();
                Member o1 = (Member) o;
                System.out.println("역직렬화 : " + o1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
