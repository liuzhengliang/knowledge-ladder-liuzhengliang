package com.liuzhengliang.web.demo;

import java.util.Arrays;

/**
 * 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        String[] arr = {"dog", "cat", "pig", "bird"};
        int result = Arrays.binarySearch(arr, "dog");
        System.out.println(result);
    }
}
