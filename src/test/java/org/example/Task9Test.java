package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Task9Test {
    Task9 task;

    @Before
    public void setUp() {
        task = new Task9();
    }

    @Test
    public void testSolve() {
        int[] input = {4, 7, 2, 9, 1, 8, 3};
        int[] expected = {2, 4, 8, 9, 7, 3, 1};
        assertArrayEquals(expected, task.solve(input));
    }
}