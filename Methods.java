package com.perscholas.java_basics;


import java.time.LocalDateTime;
import java.util.List;

public class Main {

    //Main method. A block of code. Static
    public static void main(String[] args) {


    }
    //A parameter is what in the ();

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

    // The Datatype makes it unique.
    private String password(String password){
        return "Only invoked within the class definition";
    }

    private String password(){
        return "Only invoked within the class definition";
    }


    //Changed double to int. Why? Method Overloading. using a same method multiple times.
    private String password(String password, double numberOfChar, boolean isPasswordCorrect ){
        return "Only invoked within the class definition";
    }

    //Knows which one to call based on parameter within the parameters. unique
    private String password(double numberOfChar, boolean isPasswordCorrect ){
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
