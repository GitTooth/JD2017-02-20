package by.it.Zyryanov.jd01_04;


public class Runner {
    public static void main(String[] args) {

        double[][] m = {
        {2, 5, 4 , 1},
        {1, 3 , 2, 1},
        {2, 10, 9, 7},
        {3, 8, 9, 2},
        };

        double[] y = {20, 11, 40, 37};

        Util.findRoots(m, y, true);

        Util.detOfMatrix(m);
    }
}