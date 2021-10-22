package ru.gb.strelnikova;

import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
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
}
