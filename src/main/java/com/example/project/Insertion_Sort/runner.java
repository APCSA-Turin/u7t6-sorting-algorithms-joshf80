package com.example.project.Insertion_Sort;

import java.util.Arrays;

public class runner {

    public static void main(String[] args) {
        int[] arrA = {70,29,75,48,57,32,14,34,86,43,52,2,50,85,42,28,23,99,47,35,13,4,41,16,21,46,96,19,91,97,60,77,66,92,44,98,54,84,87,69,8,25,56,49,68,79,36,3,22,67};
        InsertionSort.selectionSort(arrA);
        System.out.println(Arrays.toString(arrA));
        System.out.println();
        int[] arrB = {70,29,75,48,57,32,14,34,86,43,52,2,50,85,42,28,23,99,47,35,13,4,41,16,21,46,96,19,91,97,60,77,66,92,44,98,54,84,87,69,8,25,56,49,68,79,36,3,22,67};
        InsertionSort.insertionSort(arrB);
        System.out.println(Arrays.toString(arrB));

    }
}