package com.corndel.pixmate.drawings;

public class Tsandwich {
    public static void main(String[] args) {

        int rows = 6;
        int rowsVal = rows/2;

        StringBuilder triangle = new StringBuilder();

        for (int i = 0; i < rowsVal-1; i++){
            for (int j = 0; j <= i; j++){
                triangle.append("*");
            }
            triangle.append("\n");
        }

        for (int i = rowsVal; i > 0; i--) { // i sets the number of rows. j sets number of columns ( number of columns reduced each time as j gets closer to i)
            for (int j = 0; j < i; j++) {
                triangle.append("*");
            }
            triangle.append("\n");
        }

        System.out.println(triangle);
    }
}
