package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Task29Test {
    Task29 task;

    @Before
    public void setUp() {
        task = new Task29();
    }

    @Test
    public void testSolve() {
        int[] input = {3, 7, 4, 3, 8, 7, 5};
        int[] expected = {3, 7};
        assertArrayEquals(expected, task.solve(input));
    }
}