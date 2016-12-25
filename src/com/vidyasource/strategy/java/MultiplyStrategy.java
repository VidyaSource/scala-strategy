package com.vidyasource.strategy.java;

public class MultiplyStrategy implements Strategy {
    @Override
    public Integer apply(Integer a, Integer b) {
        return a * b;
    }
}
