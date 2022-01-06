package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng");
        int row = sc.nextInt();

        System.out.println("Nhập số cột");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhập phần tử hàng %d, cột %d: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("In mảng");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Bạn muốn tính tổng của cột số bao nhiêu? ");
        int cot = sc.nextInt();
         int sumCot = 0;

         for (int i = 0; i < arr.length; i++) {
             sumCot += arr[i][cot];
         }
        System.out.println(sumCot);
    }
}
