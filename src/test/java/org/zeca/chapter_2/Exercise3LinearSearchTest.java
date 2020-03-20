package org.zeca.chapter_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Exercise3LinearSearchTest
 */
public class Exercise3LinearSearchTest {

    @Test
    public void searchEmpty() {

        var find = 10;
        var array = new int[] {};

        var expected = Integer.MIN_VALUE;

        var search = new Exercise3LinearSearch(array);
        var value = search.perform(find);

        assertEquals(expected, value);
    }

    @Test
    public void searchWithOneItem() {

        var find = 10;
        var array = new int[] { 10 };

        var expected = 0;

        var search = new Exercise3LinearSearch(array);
        var value = search.perform(find);

        assertEquals(expected, value);
    }

    @Test
    public void searchWithManyItem() {

        var find = 50;
        var array = new int[] { 10, 20, 30, 40, 50 };

        var expected = 4;

        var search = new Exercise3LinearSearch(array);
        var value = search.perform(find);

        assertEquals(expected, value);
    }

    @Test
    public void searchWithoutItemExist() {

        var find = 100;
        var array = new int[] { 10, 20, 30, 40, 50 };

        var expected = Integer.MIN_VALUE;

        var search = new Exercise3LinearSearch(array);
        var value = search.perform(find);

        assertEquals(expected, value);
    }

    @Test
    public void searchNegativeValue() {

        var find = -15;
        var array = new int[] { 0, 20, -15, 40, -33 };

        var expected = 2;

        var search = new Exercise3LinearSearch(array);
        var value = search.perform(find);

        assertEquals(expected, value);
    }
}