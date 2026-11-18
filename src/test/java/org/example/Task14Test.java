package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Task14Test {
    Task14 task;

    @Before
    public void setUp() {
        task = new Task14();
    }

    @Test
    public void testSolve() {
        int[] arrayIsSet = {1, 2, 3, 4, 5};
        int[] arrayIsNotSet = {1, 2, 3, 4, 1};
        assertTrue(task.solve(arrayIsSet));
        assertFalse(task.solve(arrayIsNotSet));
    }
}