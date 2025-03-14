package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        if (arr != null && arr.length != 0) {
            for (int j = 0; j < arr.length; j++) {

                int min = Integer.MAX_VALUE;
                int minIndex = j;

                for (int i = j; i < arr.length; i++) {
                    if (arr[i] <= min) {
                        min = arr[i];
                        minIndex = i;
                    }
                }

                if (minIndex != j) {
                    int temp = arr[j];
                    arr[j] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }
        }
    }

}