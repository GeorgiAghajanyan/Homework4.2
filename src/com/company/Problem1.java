package com.company;

import java.util.Random;

public class Problem1 {
    public static void main(String[] args) {

        Random random = new Random();

        int[][] matrix = new int[10][15];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(89) + 10;

            }

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println();
        }
        int minimumvalue = 100;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minimumvalue) {
                    minimumvalue = matrix[i][j];
                }

            }

        }
        System.out.println();
        System.out.println(minimumvalue);

    }
}