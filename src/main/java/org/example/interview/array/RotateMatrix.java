package org.example.interview.array;

import java.sql.Blob;

public class RotateMatrix {
    /*
    面试题 01.07. 旋转矩阵
    给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
    不占用额外内存空间能否做到？
    示例 1:
    给定 matrix =
    [
      [1,2,3],
      [4,5,6],
      [7,8,9]
    ],
    原地旋转输入矩阵，使其变为:
    [
      [7,4,1],
      [8,5,2],
      [9,6,3]
    ]

    示例 2:
    给定 matrix =
    [
      [ 5, 1, 9,11],
      [ 2, 4, 8,10],
      [13, 3, 6, 7],
      [15,14,12,16]
    ],
    原地旋转输入矩阵，使其变为:
    [
      [15,13, 2, 5],
      [14, 3, 4, 1],
      [12, 6, 8, 9],
      [16, 7,10,11]
    ]
    */
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int tmp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                tmp = matrix[i][j];  // 左上[i][j]
                matrix[i][j] = matrix[n-1-j][i]; // 左下[n-1-j][i]
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j]; // 右下[n-1-i][n-1-j]
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i]; // 右上[j][n-1-i]
                matrix[j][n-1-i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1 - i; j++) {  // ij
                System.out.print(i + "" + j + " ");
                System.out.print(j + "" + (n - 1 - i) + " ");
                System.out.print((n - 1 - i) + "" + (n - 1 - j) + " ");
                System.out.print((n - 1 - j) + "" + i + " ");
                System.out.println();
            }
        }
    }
}
