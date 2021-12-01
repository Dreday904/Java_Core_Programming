package com.perscholas.java_basics;


import java.time.LocalDateTime;
import java.util.List;

public class Main {

    //Main method. A block of code. Static
    public static void main(String[] args) {


    }
    // Access Specifier is the public.
    //Return type is the void. Can use any datatype. has to return
    //same datatype
    //
    public String sayMyName(String name){
        return name;
    }

    public String getLocalTime(){
        return "invoked by ny of the customer of the class";
    }

    private String password(){
        return "Only invoked within the class definition";
    }
    protected String userName(){
        return "method can be invoked from within the class or from " +
                "within any subclass of the class.";
    }
    
    
    String myName(){
        return "(default) means that the method can be invoked from within the " +
                "class or by any other class within the same package that contains this class.";
}
