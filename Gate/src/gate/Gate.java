package gate;

public class Gate {

    public static void main(String[] args) {

        int x1[] = {0, 0, 1, 1};
        int x2[] = {0, 1, 0, 1};
        int y[] = {0, 1, 1, 0};
        double w3[] = {0.5, 0.4};
        double w4[] = {0.9, 0.1};
        double w5[] = {-1.2, 1.1};
        double th[] = {0.8, -0.1, 0.3};

        double out[] = new double[4];
        double y3, y4, y5, e, dth3, dth4, dth5, dw24, dw14, dw23, dw35, dw45;
        double dw13, dw4, dw5, dth, g5, g3, g4;
        double dw[][] = new double[2][2];

        int eph = 300;
        while (eph != 0) {
            for (int i = 0; i < 4; i++) {
                y3 = forword(x1[i], x2[i], w3, th[0]);
                y4 = forword(x1[i], x2[i], w4, th[1]);
                y5 = forword(y3, y4, w5, th[2]);
                out[i]=y5;
                e = y[i] - y5;
                g5 = dal(y5, e);
                g3 = dal(y3, g5 * w5[0]);
                g4 = dal(y4, g5 * w5[1]);
                dw[0][0] = back(x1[i], g3, 0.1);
                dw[0][1] = back(x2[i], g3, 0.1);
                dw[1][0] = back(x1[i], g4, 0.1);
                dw[1][1] = back(x2[i], g4, 0.1);
                dw35 = back(y3, g5, 0.1);
                dw45 = back(y4, g5, 0.1);

                dth5 = back(y5, -1, 0.1);
                dth3 = back(y3, -1, 0.1);
                dth4 = back(y4, -1, 0.1);

                w3[0] = w3[0] + dw[0][0];
                w3[1] = w3[1] + dw[0][1];
                w4[0] = w4[0] + dw[1][0];
                w4[1] = w4[1] + dw[1][1];
                w5[0] = w5[0] + dw35;
                w5[1] = w5[1] + dw45;

                th[0] = th[0] + dth3;
                th[1] = th[1] + dth4;
                th[2] = th[2] + dth5;

            }

            eph--;
//                   System.out.println("-------------------------------");

//        for (int i = 0; i < 2; i++) {
//            System.out.println(w3[i] + "      " + w4[i] + "         " + w5[i]);

//        }
                  
 
        }
         for (int i=0;i<out.length;i++){
                       System.out.println(out[i]);
                   }

    }

    private static double forword(double x1, double x2, double[] w, double th) {
        double res = 0;

        res = sig(x1 * w[0] + x2 * w[1] - th);

        return res;

    }

    private static double sig(double d) {

        return 1 / (1 + Math.exp(-d));

    }

    private static double back(double y, double e, double lr) {

        double res;
        res = y * e * lr;

        return res;

    }

    private static double dal(double y, double e) {

        return y * (1 - y) * e;
    }

}
