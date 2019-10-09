package com.company;

class BubbleSort {

    // First way to sort
    public static <T extends Comparable> T[] sort(T a[]) {

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i; j < a.length - 1; j++) {
                if (a[i].compareTo(a[j]) < 0){
                    T temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a;
    }
    
    // Second way to sort
    public static <T extends Comparable> T[] sortInSecondWay(T a[]) {

        for (int i = a.length - 1; i >= 1; i--) {
            for (int j = 0; j <= i; j++) {
                if (a[i].compareTo(a[j]) > 0){
                    T temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a;
    }
}
