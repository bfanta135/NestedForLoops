package com.company;

public class Main {
   /* static final int MAX <= 10;*/
    ;
    public static void main(String[] args) {
	// write your code here
        /*int row, column;

        for (row = 1; row <= MAX; row++) {
            for (column= 1; column <= MAX; column++) {
                System.out.print(row + column + "\t");
            }
            System.out.println(); //Takes us to the next line
*/
             for (int line = 1; line <= 9; line++) {
                for (int j = 1; j <= line; j++) {
                    System.out.print(line);
                }
                System.out.println();
        }
    }
}
