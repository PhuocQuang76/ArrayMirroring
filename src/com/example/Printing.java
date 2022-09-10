package com.example;

public class Printing {
    public Printing(){

    }

    public static void print(int[][] array){
        for(int i = 0; i < array.length; i++){
            int j = 0;

            for(boolean var3 = false; j < array[i].length; ++j){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] assignNumber(int[][] array, int max){
        for(int i = 0; i < array.length; ++i) {
            int j = 0;

            for(boolean var4 = false; j < array[i].length; ++j) {
                int value = (int)(Math.random() * (double)max + 1.0D);
                array[i][j] = value;
            }
        }
        return array;
    }
}
