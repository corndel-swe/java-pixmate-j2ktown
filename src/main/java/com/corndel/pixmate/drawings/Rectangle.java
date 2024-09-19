package com.corndel.pixmate.drawings;

public class Rectangle {
    public static void main(String[] args) {

        // class to make string mutable
        StringBuilder rectangle = new StringBuilder();

        int width = 5; // columns
        int height = 10; //row

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width ; j++) {
                rectangle.append("*");
            }
            rectangle.append("\n");
        }
        System.out.println(rectangle);
    }
}
