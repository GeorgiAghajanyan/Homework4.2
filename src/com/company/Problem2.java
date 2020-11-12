package com.company;

import java.util.Random;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        System.out.println("please input the row number");
        int rownumber = scanner.nextInt() - 1;
        int sum = 0;

            for (int j = 0; j < 15; j++) {
                sum = sum + matrix[rownumber][j];

            }
        System.out.println(sum);
        }

    }
