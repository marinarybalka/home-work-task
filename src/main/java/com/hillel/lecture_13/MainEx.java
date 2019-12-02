package com.hillel.lecture_13;

public class MainEx {

    public static void main(String[] args) {
        System.out.println("Start application");

        try {
//            int result = 10 / 0;
            String result = null;
            System.out.println("result " + result.toUpperCase());
//        } catch (NullPointerException e) {
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("Exception");
//            System.err.println(e.getMessage());
//          StackTraceElement[] stackTrace = e.getStackTrace();
//          for (StackTraceElement stackTraceElement: stackTrace) {
//              System.err.println(stackTraceElement.getClassName());
//              System.err.println(stackTraceElement.getLineNumber());
//          }
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException");
        }

        System.out.println("Stop application");

    }
}
