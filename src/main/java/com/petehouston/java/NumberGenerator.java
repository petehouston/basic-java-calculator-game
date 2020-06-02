package com.petehouston.java;

import java.util.Random;

public class NumberGenerator {
    private final Random random;
    private final int min;
    private final int max;

    public NumberGenerator(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }

    public int yield() {
        return min + random.nextInt(max - min + 1);
    }
}
