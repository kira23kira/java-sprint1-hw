import java.util.Scanner;
public class Converter {
    static double convertToKm(int steps) {
        double oneStep = 0.00075;
        double distance;
        distance = steps * oneStep;
        return distance;
    }
    static double convertStepsToKilocalories(int steps) {
        double kilokalories = 0.001;
        kilokalories = steps * kilokalories;
        return kilokalories;
    }
}
