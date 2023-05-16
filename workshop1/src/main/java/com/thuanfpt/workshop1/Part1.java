package com.thuanfpt.workshop1;
import java.util.Scanner;
public class Part1{
     private static int[][] inputMatrix(int rows, int cols) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("m[%d][%d] = ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = inputMatrix(rows, cols);
        System.out.println("Matrix inputted:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%d ", value);
            }
            System.out.println();
        }
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }
        double avg = (double) sum / (rows * cols);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}