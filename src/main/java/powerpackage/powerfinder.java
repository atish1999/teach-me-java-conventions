package powerpackage;

public class powerfinder {
    public static int OF(int number, int power) {
        int result = 1;
        for (int multiply = 0; multiply < power; multiply++) {
            result = getProduct(number, result);
        }
        return result;
    }

    private static int getProduct(int number, int result) {
        return result * number;
    }
}
