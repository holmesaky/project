package ai_and;

import java.math.BigDecimal;

import java.math.MathContext;
import java.math.RoundingMode;


public class AI_logic {

    public static void main(String[] args) {

        and();
        or();

    }

    public static void and() {
        int ya[] = new int[4];
        int epoch = 1;
        double alpha = 0.1;
        double theta = 0.2;
        double input;
        double wnew;
        double daltaw;
        int e;
        int x1[] = {0, 0, 1, 1};
        int x2[] = {0, 1, 0, 1};
        int yd[] = {0, 0, 0, 1};
        BigDecimal w1[] = new BigDecimal[2];
        double w[] = {0.3, -0.1};
        while (epoch < 6) {
            System.out.println("   X1   X2   Yd   W1   W2   Ya   E   w1   w2");
            for (int i = 0; i < x1.length; i++) {
                input = (x1[i] * w[0] + x2[i] * w[1]) - theta;
                ya[i] = step(input);
                e = error(yd[i], ya[i]);
                if (e != 0) {
                    w[0] = newweight(x1[i], e, alpha, w[0]);
                    w[1] = newweight(x2[i], e, alpha, w[1]);
                    w1[0] = new BigDecimal(w[0], new MathContext(1,
                            RoundingMode.HALF_UP));
                    w1[1] = new BigDecimal(w[1], new MathContext(2,
                            RoundingMode.HALF_UP));
                    w[0] = new Double("" + w1[0]);
                    w[1] = new Double("" + w1[1]);

                }
                System.out.println(epoch + "  " + x1[i] + "   " + x2[i] + "   " + yd[i] + "   " + w[0] + "   " + w[1] + "   " + ya[i] + "   " + e + "   " + w[0] + "  " + w[1]);
            }
            System.out.println("---------------------------------------------------");

            epoch++;
        }
    }

    private static int step(double input) {

        if (input >= 0) {
            return 1;
        }
        return 0;

    }

    private static int error(int yd, int ya) {
        return yd - ya;
    }

    private static double newweight(int x1, int e, double alpha, double w) {

        double result;
        double dalta = alpha * x1 * e;
        result = w + dalta;

        return result;
    }

    private static void or() {
        int ya[] = new int[4];
        int epoch = 1;
        double alpha = 0.1;
        double theta = 0.2;
        double input;
        double wnew;
        double daltaw;
        int e;
        int x1[] = {0, 0, 1, 1};
        int x2[] = {0, 1, 0, 1};
        int yd[] = {0, 1, 1, 1};
        BigDecimal w1[] = new BigDecimal[2];

        double w[] = {0.3, -0.1};
        while (epoch < 6) {

            System.out.println("   X1   X2   Yd   W1   W2   Ya   E   w1   w2");
            for (int i = 0; i < x1.length; i++) {
                input = (x1[i] * w[0] + x2[i] * w[1]) - theta;
                ya[i] = step(input);
                e = error(yd[i], ya[i]);
                if (e != 0) {
                    w[0] = newweight(x1[i], e, alpha, w[0]);
                    w[1] = newweight(x2[i], e, alpha, w[1]);
                    w1[0] = new BigDecimal(w[0], new MathContext(1,
                            RoundingMode.HALF_UP));
                    w1[1] = new BigDecimal(w[1], new MathContext(1,
                            RoundingMode.HALF_UP));
                    w[0] = new Double("" + w1[0]);
                    w[1] = new Double("" + w1[1]);

                }
                System.out.println(epoch + "  " + x1[i] + "   " + x2[i] + "   " + yd[i] + "   " + w[0] + "   " + w[1] + "   " + ya[i] + "   " + e + "   " + w[0] + "  " + w[1]);
            }
            System.out.println("---------------------------------------------------");

            epoch++;
        }

    }

}
