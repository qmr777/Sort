package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] aaa = {5, 9, 15, 82, 47, 611, 2, 1, 4, 3, 88};
        //insertSort(aaa);
        selectSort(aaa);
        //Insertsort1(aaa,aaa.length);
        System.out.println(Arrays.toString(aaa));

    }






    static void Insertsort1(int a[], int n) {
        int i, j, k;
        for (i = 1; i < n; i++) {
            for (j = i - 1; j >= 0; j--)
                if (a[j] < a[i])
                    break;

            if (j != i - 1) {
                int temp = a[i];
                for (k = i - 1; k > j; k--)
                    a[k + 1] = a[k];
                a[k + 1] = temp;
            }
        }
    }


    public static void selectSort(int[] a){
        //int start = 0;
        int step = 0;
        int min;
        int minStep = 0;
        while (step < a.length){

            min = a[step];
            minStep = step;
            for(int i = step;i<a.length;i++){
                if(min>a[i]){
                    minStep = i;
                    min = a[minStep];
                }
            }//for 找最小
            swap(a,minStep,step);
            step++;

        }
    }




    private static void insertSort(int[] a) {
        int step = 1;//[0,step]有序
        int temp;
        int i;
        while (step < a.length) {
            temp = a[step];
            for (i = step - 1; i >= 0; i--)
                if (a[i] <= temp)
                    break;
            moveElement(a, i + 1, step);
            a[i + 1] = temp;
            step++;
        }//while
    }

    private static void moveElement(int a[], int start, int end) {
        assert start >= 0 && start <= end && end > 0;
        System.arraycopy(a, start, a, start + 1, end - start);
    }

    private static void swap(int[] a, int i, int j){
        if(i != j) {
            a[i] = a[i] + a[j];
            a[j] = a[i] - a[j];
            a[i] = a[i] - a[j];
        }
    }
}
