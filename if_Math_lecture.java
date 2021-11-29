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
        
       
         int age = 17;

//        if age < 21
        if(age >= 21){
            System.out.println("You can enter");
        }
        else{
            System.out.println("You can't enter");
        } 
        
        
        
        
        
        String str = new String();
        String str="hello";
        String str2=" to all    ";
        str.length();
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        str + str2
        System.out.println(str.concat(str2));

        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str2.trim());

        
        
        
         Scanner userInput = new Scanner(System.in);
        System.out.println("What's your first name? ");
        String firstName = userInput.nextLine();
        System.out.println("What's your last name?");
        String lastName = userInput.nextLine();
        System.out.println("How old are you?");
        int age = userInput.nextInt();

        
        
        
          String str = "Java";

        String start = str.substring(0,8);
        System.out.println(start);


        from index is what area it's from
        System.out.println(str.indexOf(1));
        System.out.println(str.charAt(3));


        if(str.toUpperCase(Locale.ROOT)== ("JAVA")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        
        
        
        int num = 30;

        if(num % 2 == 0 && num > 25){
            System.out.println("Even and greater than 25");
        }else if(num % 2 == 0 && num < 15){
            System.out.println("Even and less than 15");
        }else {
            System.out.println("Error...");
        }
        
        
        
        
        
         int score = 86;

        if(score >= 90){
            System.out.println("A");
        } else if(score >= 85 && score <= 89) {
            System.out.println("B+");
        }else if (score >= 80 && score < 85) {
            System.out.println("B");
        }else if (score <= 70){
            System.out.println("C");
        }
        

    }
}
