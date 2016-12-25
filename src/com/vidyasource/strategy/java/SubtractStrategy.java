package com.vidyasource.strategy.java;

public class SubtractStrategy implements Strategy {
    @Override
    public Integer apply(Integer a, Integer b) {
        return a - b;
    }
}
