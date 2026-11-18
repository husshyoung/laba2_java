package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Task24Test {
    Task24 task;

    @Before
    public void setUp() {
        task = new Task24();
    }

    @Test
    public void testSolve() {
        assertEquals(75, task.solve(15, 3, true));
    }
}