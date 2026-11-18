package org.example;

import java.util.*;

public class Task9 {
    public int[] solve(int[] a) {
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for (int num : a) {
            if (num % 2 == 0) evens.add(num);
            else odds.add(num);
        }

        Collections.sort(evens);
        Collections.sort(odds, Collections.reverseOrder());

        int[] b = new int[a.length];
        int idx = 0;
        for (int num : evens) b[idx++] = num;
        for (int num : odds) b[idx++] = num;

        return b;
    }
}