dataType[] nameOfArr = new dataType[];
//      double[] myList = new double[10];
//      myList[9]
//        double lastItem = myList[myList.length-1];
//        1,6,null
//        double storeNum = myList[2] = myList[0] + myList[1];
//        double storeNum = myList(2) = myList(0) + myList(1); cause an error.
//
//        double[] myList = {1.9,7.2,9.7,3};
//        double arrLen = myList.length;
//        double lastItem = myList[myList.length-1]
//          System.out.println(myList[myList.length-1]);

        double [] myList = new double[10];
        myList[0] = 2.8;
        myList[1] = 6.2;
        myList[2] = 6.1;
        myList[3] = 8;

        System.out.println(myList[0]);



   for(int i = 0; i < myList.length; i++);{
//////            double printArr = myList[i];
////            System.out.println(myList[]);
////        }
//
////        int [] deckCards = new int [52];
//        int  [] deckCards;
////        System.out.println(deckCards[2]);
//        deckCards[0] = 1;
//        for(int i = 1; i < deckCards.length; i++){
//            deckCards[i] = i;
//            System.out.println(i);
//        }
           
           
             //2D Arrays
//        int [][] values = new int [0][0];
//        int nRows = values.length;
//        int nColumns = values.length;
//        for(int row = 0; row < nRows; row++){
//            for (int col = 0; col < nColumns; col++);{
//                int v = values[row][col];
//                System.out.println(v);
//            }
//        }
        //This is the same as the bottom
        int[] source = {1,2,3,4,5};
        int[]targetArr = new int [source.length];

        for(int i =0; i < source.length; i++){
            targetArr[i] = source[i];
            System.out.println(targetArr[i]);
        }




        int[] vals = {1,2,3,4,5};
        int[] copy = vals.clone();
        System.out.println(Arrays.toString(copy));


           
           
           
           
