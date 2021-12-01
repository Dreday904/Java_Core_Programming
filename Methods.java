package com.perscholas.java_basics;


import java.time.LocalDateTime;
import java.util.List;

public class Main {

    //Main method. A block of code. Invoke is the same as calling it.
    public static void main(String[] args) {

        password();
        password("passwrord12345");
        password("password12345", 5, false );




    }

    //A parameter is what in the ();

    // Access Specifier is the public.
    //Return type is the void. Can use any datatype. has to return
    //same datatype
    //
    public static String sayMyName(String name){
        return name;
    }

    public static String getLocalTime(){
        return "invoked by ny of the customer of the class";


    }

    // The Datatype makes it unique.
    private String password(String password, int num){
        return "Only invoked within the class definition";
    }
    //invalid method. same number of parameter of the same type. Unless you change the order.
    private  String password(int num, String userName){
        return "Only invoked within the class definition";
    }


    private static void password(String passwrord12345) {
    }


    //Changed double to int. Why? Method Overloading. using a same method multiple times.
    private static String password(String password, double numberOfChar, boolean isPasswordCorrect ){
        return "Only invoked within the class definition";
    }

    //Knows which one to call based on parameter within the parameters. unique
    private String password(double numberOfChar, boolean isPasswordCorrect ){
        return "Only invoked within the class definition";
    }

    private static String password(){
        return "Only invoked within the class definition";
    }




    protected String userName(){
        return "method can be invoked from within the class or from " +
                "within any subclass of the class.";
    }

    String myName(){
        return "(default) means that the method can be invoked from within the " +
                "class or by any other class within the same package that contains this class.\n" +
                ;
    }


}
