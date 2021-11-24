package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // System.out.println("This one will be with");
        /*System.out.print("I'm By myself");*/
        //System.out.print("ME ON THE SAME LINE");


        //String is an object
        //  String firstName = "Dre";
         // System.out.println(firstName.concat("is here"));

        //Data Types
        int age = 27;
//        System.out.println(firstName +" "+ age);
//        boolean isWorking = true;
//        double balance = 24344554d;
//        byte byteNum = 23;
//        float totalBill = 232.43f;
//        char letter = 'f';
//        System.out.println(balance);

//
//        int x = 64;
//        int y = 200;
//
//        int result = x-y;
//
//        System.out.println(result);

//        double radius;
//        double area;

            // Assign a value to the radius
        // A literal is a programming term is what we type is what we get
//            radius = 20;
//
//            // use are to store and print everything out
//            area = radius*radius * 3.14159;
////            double cal_cos = Math.cos();
//            System.out.println("\tDre's \ncode is \"messy\"....");
//
//            System.out.println(area);

//
//            //Always need a new Scanner
//        Scanner userInput = new Scanner(System.in);
//        System.out.println("Enter a Number: ");
//        // Getting the input from user and storing that value
//        double val = userInput.nextDouble();
//        System.out.println(val);
//
        int y = 50;
        int x = 10;
        int result = y/x;
        int resultTwo = y%x;

//        int result;

        //1 +1 = 2
        //3
//        y++;

//        result = y*=x;


        //System.out.println(x>y || y>x);
        //System.out.println("div: "+ result);
        //System.out.println("mod: "+ resultTwo);

        boolean isEven = (y % 2) == 0;
        String resultsTo;
        if(age <= 65 || age >= 8 ){
            resultsTo =" no discount for you";
        }else{
            resultsTo =" you get a discount";
        }
        resultsTo = age > 65 ?  resultsTo =" no discount for you": " you get a discount";
        System.out.println(resultsTo);

        //Casting
        byte b = 50;
        b = (byte) (b*2);
        System.out.println(b);

    }
}

