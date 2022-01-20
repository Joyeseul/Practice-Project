package com.ysjo.section03;

import java.io.*;

public class ExceptionEx15 {
    public static void main(String[] args) {
        /* 입력값을 제목으로 갖는 파일을 생성한다. */
        File f = createFile("새파일");        //파일명으로 ""를 넘김
        System.out.println( f.getName() + " 파일이 성공적으로 생성되었습니다.");
    }

    static File createFile(String fileName) {
        try {
            if(fileName == null || fileName.equals("")) {
                System.out.println("파일명 부적절...");
                throw new Exception("파일이름이 유효하지 않습니다.");
            }
        } catch (Exception e) {
            /* fileName이 부적절한 경우, 파일이름을 '제목없음.txt'로 한다. */
            fileName = "제목없음.txt";
        } finally {
            File f = new File(fileName);    //File클래스의 객체 생성
            createNewFile(f);               //생성된 객체를 이용해 파일 생성
            return f;
        }
    }

    static void createNewFile(File f) {
        try {
            f.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
