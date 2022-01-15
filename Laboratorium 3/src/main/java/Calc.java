public class Calc {

    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        if(y == 0)
            throw new IllegalArgumentException();
        return x / y;
    }

    public boolean isPrime(int x) {
        int m = 0;
        m = x / 2;
        if(x == 0 || x == 1) {
            return false;
        } else {
            for(int i = 2; i <= m; i++) {
                if(x % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
