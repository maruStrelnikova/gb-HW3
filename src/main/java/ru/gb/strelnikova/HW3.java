package ru.gb.strelnikova;

import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
        replaceNumber();
        fillArray ();
        changeTheNumber();
    }

    public static void replaceNumber() {
        int[] nums = {  1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < 10; i++) {
            if (nums[i] == 1) {
                nums [i] = 0;
            } else {
                nums [i] = 1;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void fillArray () {
        int [] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr [i] = i + 1; }
        System.out.print(Arrays.toString(arr));
    }

    public static void changeTheNumber() {
        int [] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if ( arr [i] < 6) {
               arr[i] = (arr [i]) * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

