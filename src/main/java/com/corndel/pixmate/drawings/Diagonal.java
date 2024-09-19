package com.corndel.pixmate.drawings;

public class Diagonal {

    public static void main(String[] args) {

        StringBuilder triangle = new StringBuilder();
        int row = 6;
        int col = 6;


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j == i) {
                    triangle.append("*");
                }
                else
                    triangle.append(" ");
            }
            triangle.append("\n");
        }

        System.out.println(triangle);

    }
}



