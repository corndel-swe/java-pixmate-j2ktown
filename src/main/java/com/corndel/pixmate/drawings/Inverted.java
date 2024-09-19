package com.corndel.pixmate.drawings;

public class Inverted {
    public static void main(String[] args) {

        StringBuilder triangle = new StringBuilder();
        int row = 6;


        for (int i = row; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                triangle.append("*");
            }
            triangle.append("\n");
        }

        System.out.println(triangle);

        }
    }

