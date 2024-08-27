package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/*
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int row = console.nextInt();
        multiArray = new int[row][];

        for (int col = 0; col < row; col++) {
            multiArray[col] = new int[console.nextInt()];
        }
    }
}
