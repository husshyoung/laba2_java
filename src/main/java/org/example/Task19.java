package org.example;

import java.util.HashMap;
import java.util.Map;

public class Task19 {
    public String solve(int[] a) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : a) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (counts.get(a[i]) == 1) {
                result.append("Індекс: ").append(i)
                        .append(", Значення: ").append(a[i]).append("\n");
            }
        }
        return result.toString().trim();
    }
}
