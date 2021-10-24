package ru.gb.strelnikova;

import java.util.Arrays;
import java.util.Random;

public class HW3 {
    public static void main(String[] args) {
        replaceNumber();
        fillArray();
        changeTheNumber();
        fillInTheDiagonal();
        createAnArray(5, 3);
        findMaxMinValue();
        checkBalance();
    }

    public static void replaceNumber() {
        int[] nums = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < 10; i++) {
            if (nums[i] == 1) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void changeTheNumber() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = (arr[i]) * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillInTheDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                arr[i][arr.length - 1 - i] = 1;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] createAnArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void findMaxMinValue() {
        int[] b = new int[10];
        int max = 0;
        int min = 0;
        Random random = new Random();
        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextInt(100);
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] > max) {
                max = b[i];
            }
            if (b[i] < min) {
                min = b[i];
            }
        }
        System.out.printf("Максимальное значение массива : [%d]\n Минимальное значение массива : [%d] .", max, min);
    }

    public static void checkBalance() {
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        boolean balanceExist = false;
        int arrSum = 0;
        int rightSum = 0;
        for (int i = 0; i < arr.length; i++) {
            rightSum = rightSum + arr[i];
            if (rightSum == arrSum - rightSum) {
                balanceExist = true;
            }
        }
    }
}

