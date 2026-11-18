package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task29 {
    public int[] solve(int[] a) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();

        for (int num : a) {
            if (!seen.add(num)) duplicates.add(num);
        }

        int[] b = new int[duplicates.size()];
        int idx = 0;
        for (int num : duplicates) b[idx++] = num;

        return b;
    }
}
