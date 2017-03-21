package by.it.radivonik.jd01_02;

/**
 * Created by Radivonik on 28.02.2017.
 */
public class TaskA {
    public static int getMax(int array []) {
        Integer res = 0;
        for (Integer i: array) {
            if ( res.toString().length() < i.toString().length() ||
                 res.toString().length() == i.toString().length() && res < i ) {
                res = i;
            }
        }
        return res;
    }

    public static int getMin(int array []) {
        Integer res = Integer.MAX_VALUE;
        for (Integer i: array) {
            if ( res.toString().length() > i.toString().length() ||
                 res.toString().length() == i.toString().length() && res > i ) {
                res = i;
            }
        }
        return res;
    }

    public static double mean(int array[]) {
        double res = 0;
        for (int i: array) {
            res += i;
        }
        res = res / array.length;
        return res;
    }

    public static boolean uniqueDigits(Integer value) {
        char ch[] = value.toString().toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j])
                    return false;
            }
        }
        return true;
    }
}
