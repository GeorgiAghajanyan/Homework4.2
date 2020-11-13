package com.company;

import java.util.Random;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[5][5];
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
        System.out.println("———————- MENU —————- \n" + "For rotating 90 click 1*\n" +
                "For rotating 180 click 2*\n" +
                "For rotating 270 click 3*\n" +
                "For Exit click 4\n" + "————————————————");
        int inputnumer = scanner.nextInt();
        if (inputnumer == 1) {

            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < matrix.length; j++) {

                    System.out.print(matrix[matrix.length - j - 1][i] + ",");
                }
                System.out.println();
            }
        } else if (inputnumer == 2) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {

                    System.out.print(matrix[matrix.length - 1 - i][matrix[i].length - 1 - j] + ",");
                }
                System.out.println();
            }
        } else if (inputnumer == 3) {
            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < matrix.length; j++) {

                    System.out.print(matrix[j][matrix[j].length - 1 - i] + ",");
                }
                System.out.println();
            }

        } else if (inputnumer == 4) {
            System.out.println("input number is not correct");


        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + ",");
                }
                System.out.println();
            }
        }
    }
}
