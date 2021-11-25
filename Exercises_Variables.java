package com.company;


public class Main {

    public static <SALES_TAX> void main(String[] args) {

            // 1.Write a program that declares 2 integer variables,
            // assigns an integer to each, and adds them together.
            // Assign the sum to a variable. Print out the result.

            int x = 5;
            int y = 10;

            int results = x + y;
            System.out.println(results);



             // 2.Write a program that declares 2 double variables,
             // assigns a number to each, and adds them together.
             // Assign the sum to a variable. Print out the result.

             double radius;
             double area;

             double result;

             radius = 20;
             area = 20;

             result = radius + area;

             System.out.println(result);



           /*3.Write a program that declares an integer variable and a double variable,
                assigns numbers to each, and adds them together.
                Assign the sum to a variable. Print out the result.
                What variable type must the sum be?*/


               int x = 5;
               double radius = 5.0;

               double area = x + radius;
               System.out.println(area);

               //The variable sum must be an integer.


           /*4. Write a program that declares 2 integer variables,
                assigns an integer to each, and divides the larger number by the smaller number.
                Assign the result to a variable. Print out the result.
                Now change the larger number to a decimal. What happens?
                What corrections are needed? */

                 int x = 5;
                 int y = 10.5;

                 int = y / x;
                 System.out.println(z);

                 //When changing to decimal, an error
                 //"java: incompatible types: possible lossy conversion from double to int", appears.
                 //We would need to change to a double.



            // 5. Write a program that declares 2 double variables,
                 //assigns a number to each, and divides the larger by the smaller.
                 //Assign the result to a variable. Print out the result.
                 //Now, cast the result to an integer. Print out the result again.

                   double radius = 3.0;
                   double area = 5.0;

                    //This is casting
                   int x = (int) (area / radius);
                   System.out.println(x);



           // 6.   Write a program that declares 2 integer variables, x, and y,
                // and assign 5 to x and 6 to y.
                // Declare a variable q and assign y/x to it and print q.
                // Now, cast y to a double and assign to q. Print q again.

                   //This is another way to cast an int to a double
                     int x = 5;
                     int y = 6;
                     int q = y/x;

                     double d=y;
                     System.out.println(q);




           // 7.     Write a program that declares a named constant and uses it in a calculation.
                   //Print the result.

                     final double PI = 3.14159;
                     final int SIZE = 32;
                     final double RADIUS = SIZE*PI;

                     System.out.println(RADIUS);



           // 8.     Write a program where you create 3 variables that represent products at a cafe. 
                    // The products could be beverages like coffee, cappuccino, espresso, green tea, etc. 
                    // Assign prices to each product. Create 2 more variables called subtotal and totalSale and complete an “order” for 3 items of the first product, 
                    // 4 items of the second product, and 2 items of the third product. 
                    // Add them all together to calculate the subtotal. 
                    // Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. 
                    // Be sure to format the results to 2 decimal places.

                       int coffee = 2;
                       int greenTea = 3;
                       int water = 1;

                       int subtotal;
                       double totalSale;

                       subtotal = coffee * 3 + greenTea * 4 + water * 2;

                       final double SALES_TAX = 0.06;
                       totalSale = subtotal + SALES_TAX;
                       System.out.println(totalSale);


    }
}
