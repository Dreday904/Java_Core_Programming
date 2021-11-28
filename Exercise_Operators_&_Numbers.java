               1.

                        int a = 1, b = 8, c = 33, d = 78, e = 787, f = 33987;

                        String result = Integer.toBinaryString(a);

                        String result2 = Integer.toBinaryString(b);

                        String result3 = Integer.toBinaryString(c);

                        String result4 = Integer.toBinaryString(d);

                        String result5 = Integer.toBinaryString(e);

                        String result6 = Integer.toBinaryString(f);

                        //These are the integers in binary notation.
                        System.out.println(result+" "+result2+" "+result3+" "+result4+" "+result5+" "+result6);


                 2.

                    String a = "0010", b = "1001", c = "00110100", d = "01110010", e = "001000011111", f = "0010110001100111";

                    int decimalNumber = Integer.parseInt(a,2);

                    int decimalNumber2 = Integer.parseInt(b,2);

                    int decimalNumber3 = Integer.parseInt(c,2);

                    int decimalNumber4 = Integer.parseInt(d,2);

                    int decimalNumber5 = Integer.parseInt(e,2);

                    int decimalNumber6 = Integer.parseInt(f,2);

                    System.out.println(decimalNumber+" "+decimalNumber2+" "+decimalNumber3+" "+decimalNumber4+" "+decimalNumber5+" "+decimalNumber6);

                 3.

                      int x;
                      x = 2;

                      x = (x << 1);

                      String Binary = "100";
                      String Binary2 = "9";
                      String Binary3 = "17";
                      String Binary4 = "88";

                      int decimal = Integer.parseInt(Binary,2);
                      int decimal2 = Integer.parseInt(Binary2,2);
                      int decimal3 = Integer.parseInt(Binary3,2);
                      int decimal4 = Integer.parseInt(Binary4,2);


                      //I'm thinking that the results would be 10
                      System.out.println("The result of x << 1 is: "+Integer.toBinaryString(x));
                      System.out.println("The Binary result of x is: "+Integer.toBinaryString(Integer.parseInt(Binary)));
                      System.out.println("The decimal result of x is: "+Integer.parseInt(String.valueOf(decimal),2));

                      System.out.println("The binary result of decimal 9 is: "+Integer.toBinaryString(Integer.parseInt(Binary2)));
                      System.out.println("The decimal result of binary 9 is: "+Integer.parseInt(String.valueOf(decimal2)));

                      System.out.println("The binary result of decimal 17 is: "+Integer.toBinaryString(Integer.parseInt(Binary3)));
                      System.out.println("The decimal result of binary 17 is: "+Integer.parseInt(String.valueOf(decimal3)));

                      System.out.println("The binary result of decimal 88 is: "+Integer.toBinaryString(Integer.parseInt(Binary4)));
                      System.out.println("The decimal result of binary 88 is: "+Integer.parseInt(String.valueOf(decimal4)));


                    // 4.

                        int x;
                        x = 150;
                        x = (x >> 2);

                        String result = Integer.toBinaryString(x);
                        int decimal = Integer.parseInt(result,2);
                        System.out.println("The Binary is: "+result);
                        System.out.println("The Value is: "+decimal);


                        int y;
                        y = 225;
                        y = (y >> 2);

                        String result2 = Integer.toBinaryString(y);
                        int decimal2 = Integer.parseInt(result2,2);
                        System.out.println("The Binary is: "+result2);
                        System.out.println("The Value is: "+decimal2);



                        int z;
                        z = 1555;
                        z = (z >> 2);

                        String result3 = Integer.toBinaryString(z);
                        int decimal3 = Integer.parseInt(result3,2);
                        System.out.println("The Binary is: "+result3);
                        System.out.println("The value is: "+decimal3);


                        int a;
                        a = 32456;
                        a = (a >> 2);

                        String result4 = Integer.toBinaryString(a);
                        int decimal4 = Integer.parseInt(result4,2);
                        System.out.println("The Binary is: "+result4);
                        System.out.println("The Value is: "+decimal4);



                     5.

                          int x = 7;
                          int y = 17;
                          int z;

                          z = (x & y);
                          System.out.println(z);

                          z = (x | y);
                          System.out.println(z);


                     6.
                          int i;
                          i = 6;
                          System.out.println("Before : "+i);
                          System.out.println("After: "+(++i));

                     7.

                            Way 1.
                            int i;
                            i = 0;
                            System.out.println(i++);
                            System.out.println(i);
                            System.out.println(++i);
                            System.out.println(++i);

                            Way 2.
                            int i = 0;
                            i = i++ + 1 + i++;
                            i++;
                            i++;
                            i++;
                            System.out.println(i);

                            Way 3.
                              int i = 1;
                              i = i++;
                              i = ++i; //2
                              i = ++i; //3
                              i = ++i; //4
                              i = ++i; //5
                              i = ++i; //6
                              i = ++i; //7
                              i = ++i; //8
                              System.out.println(i);

                        8.

                             int x = 5;
                             int y = 8;
                             int sum = (x++ + y);

                             //++x = (5+1=6) + (y = 8) = 14
                             //x++ = (5) + (y = 8) = 13
                             System.out.println(sum);

