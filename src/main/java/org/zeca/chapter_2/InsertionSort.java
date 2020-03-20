package org.zeca.chapter_2;

public class InsertionSort {

    private int[] array;

    public InsertionSort(int[] array) {
        this.array = array;
    }

    public int[] perform() {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }

        return array;
    }
}
