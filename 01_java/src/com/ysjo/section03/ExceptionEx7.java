package com.ysjo.section03;

public class ExceptionEx7 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);    //ArithmeticException발생
            System.out.println(4);      //실행되지 않고 catch로 넘어감
        } catch (ArithmeticException ae) {
            if(ae instanceof ArithmeticException) {
                ae.printStackTrace();       //생성된 ArithmeticException 인스턴스에 접근
                System.out.println("예외메시지 : " + ae.getMessage());
            }
            System.out.println("Arithmetic Exception 발생...");
        } catch (Exception e) {
            System.out.println("Exception 발생...");
        }

        System.out.println("6");
    }
}
