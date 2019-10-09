package com.company;

class InsertionSort {

    // Sorts effectively
    public static <T extends Comparable> T[] sortEffective(T a[]) {

        for (int i = 0; i < a.length - 1; i++) {
            int indexOfChanger = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].compareTo(a[j]) < 0 && a[j].compareTo(a[indexOfChanger]) > 0) {
                    indexOfChanger = j;
                }
            }

            if (indexOfChanger != i) {
                T temp = a[i];
                a[i] = a[indexOfChanger];
                a[indexOfChanger] = temp;
            }
        }
        return a;
    }

    // Sorts in a simple way
    public static <T extends Comparable> T[] sortSimple(T a[]) {

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].compareTo(a[j]) < 0) {
                    T temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
