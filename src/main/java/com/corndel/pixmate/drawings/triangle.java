package com.corndel.pixmate.drawings;

public class triangle {
    public static void main(String[] args) {

        StringBuilder triangle = new StringBuilder();

        int row = 5;


        for (int i = 0; i < row; i++){
            for (int j = 0; j <= i; j++){
                triangle.append("*");
            }
            triangle.append("\n");
        }

        System.out.println(triangle);
    }
}
