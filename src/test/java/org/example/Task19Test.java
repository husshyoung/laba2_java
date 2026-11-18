package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Task19Test {
    Task19 task;

    @Before
    public void setUp() {
        task = new Task19();
    }

    @Test
    public void testSolve() {
        int[] input = {5, 2, 5, 8, 2, 1};
        String expected = "Індекс: 3, Значення: 8\nІндекс: 5, Значення: 1";
        assertEquals(expected, task.solve(input));
    }
}