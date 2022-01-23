package main;

public class Calc {

    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(int x, int y) {
        return x - y;
    }

    public double divide(float x, float y) {
        if(y == 0)
            throw new IllegalArgumentException("Cannot divide by zero");
        return x / y;
    }
}
