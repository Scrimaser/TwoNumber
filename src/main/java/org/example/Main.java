package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4,5, 3, 6, 6, 9, 11};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(arr, 26)));
    }
}