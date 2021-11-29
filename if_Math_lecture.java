package com.perscholas.java_basics;

public class Main {

    public static void main(String[] args) {

        int count = 10;
        String msg = "Your count is: ";
        System.out.println(msg+count);
//        Math.floor();
//        Math.random();
//        Math.abs();
//        Math.ceil();
        double ran = Math.floor(Math.random() *10);
        System.out.println(ran);


          if(count == 20){
            System.out.println("Yes");
        }
        else{
            System.out.println("no");
        }

    }
}
