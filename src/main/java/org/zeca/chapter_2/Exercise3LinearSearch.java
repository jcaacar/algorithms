package org.zeca.chapter_2;

/**
 * Exercise 2.1.3 pag. 16
 */
public class Exercise3LinearSearch {

    private int[] array;

    public Exercise3LinearSearch(int[] array) {
        this.array = array;
    }

    public int perform(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        }

        return Integer.MIN_VALUE;
    }
}