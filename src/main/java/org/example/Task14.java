package org.example;

import java.util.HashSet;
import java.util.Set;

public class Task14 {
    public boolean solve(int[] a) {
        Set<Integer> set = new HashSet<>();
        for (int num : a) {
            if (!set.add(num)) return false;
        }
        return true;
    }
}