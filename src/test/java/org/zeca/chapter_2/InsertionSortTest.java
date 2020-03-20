package org.zeca.chapter_2;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * InsertionSortTest
 */
public class InsertionSortTest {

    @Test
    public void sortEmpty() {

        int[] array = new int[] {};
        int[] expectedArray = new int[] {};

        var sort = new InsertionSort(array);
        var sorted = sort.perform();

        assertArrayEquals(expectedArray, sorted);
    }

    @Test
    public void sortWithOneItem() {

        int[] array = new int[] { 1 };
        int[] expectedArray = new int[] { 1 };

        var sort = new InsertionSort(array);
        var sorted = sort.perform();

        assertArrayEquals(expectedArray, sorted);
    }

    @Test
    public void sortWithManyItems() {

        int[] array = new int[] { 10, 5, 3, 1, 20 };
        int[] expectedArray = new int[] { 1, 3, 5, 10, 20 };

        var sort = new InsertionSort(array);
        var sorted = sort.perform();

        assertArrayEquals(expectedArray, sorted);
    }

    @Test
    public void sortAlreadyOrdered() {

        int[] array = new int[] { 10, 12, 22, 30, 50, 55, 99 };
        int[] expectedArray = new int[] { 10, 12, 22, 30, 50, 55, 99 };

        var sort = new InsertionSort(array);
        var sorted = sort.perform();

        assertArrayEquals(expectedArray, sorted);
    }

    @Test
    public void sortInverseOrdered() {

        int[] array = new int[] { 99, 55, 50, 30, 22, 12, 10 };
        int[] expectedArray = new int[] { 10, 12, 22, 30, 50, 55, 99 };

        var sort = new InsertionSort(array);
        var sorted = sort.perform();

        assertArrayEquals(expectedArray, sorted);
    }

    @Test
    public void sortWithRepeatedNumbers() {

        int[] array = new int[] { 31, 15, 10, 9, 2, 55, 10 };
        int[] expectedArray = new int[] { 2, 9, 10, 10, 15, 31, 55 };

        var sort = new InsertionSort(array);
        var sorted = sort.perform();

        assertArrayEquals(expectedArray, sorted);
    }

    @Test
    public void sortWithNegativeNumbers() {

        int[] array = new int[] { -10, 0, 22, -5, -30 };
        int[] expectedArray = new int[] { -30, -10, -5, 0, 22 };

        var sort = new InsertionSort(array);
        var sorted = sort.perform();

        assertArrayEquals(expectedArray, sorted);
    }

}