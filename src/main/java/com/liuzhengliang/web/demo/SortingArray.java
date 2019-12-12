package com.liuzhengliang.web.demo;

import java.util.Arrays;

/**
 * 数组排序
 */
public class SortingArray {
    /**
     * 冒泡排序
     *
     * @param array
     */
    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int a = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = a;
                }
            }
        }
    }

    /**
     * 选择排序
     *
     * @param array
     */
    static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int lower = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[lower] > array[j]) {
                    lower = j;
                }
            }
            int temp = array[i];
            array[i] = array[lower];
            array[lower] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 9, 3, 7, 2, 6, 8};
//        bubbleSort(array);
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
