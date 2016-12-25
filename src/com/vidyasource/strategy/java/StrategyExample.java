package com.vidyasource.strategy.java;

class StrategyExample {
    public static void main(String[] args) {
        Strategy addStrategy = new AddStrategy();
        Strategy subtractStrategy = new SubtractStrategy();
        Strategy multiplyStrategy = new MultiplyStrategy();

        System.out.println("Add:      " + execute(addStrategy, 3, 4));
        System.out.println("Subtract: " + execute(subtractStrategy, 3, 4));
        System.out.println("Multiply: " + execute(multiplyStrategy, 3, 4));
    }

    private static int execute(Strategy strategy, int x, int y) {
        return strategy.apply(x, y);
    }
}

