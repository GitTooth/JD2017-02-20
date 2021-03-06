package by.it.prigozhanov.jd02_06;

import java.util.Date;

/**
 * Created by v-omf on 4/11/2017.
 *
 * @author v-omf
 */
public class Console {
    private static void printRes(Var var) {
        if (var!=null) {
            System.out.println(var);
        }

    }

    public static void main(String[] args) {
        Calculator.director.fullReport(false);
        Calculator.director.createHeaderReport("MATLAB V1.0");
        Date date1 = new Date();
        Calculator.director.createStartTimeReport(date1);
        printRes(Calculator.calculate("A=2"));
        printRes(Calculator.calculate("B=0"));
        printRes(Calculator.calculate("A/B"));
        printRes(Calculator.calculate("B=2"));
        printRes(Calculator.calculate("A/B"));
        printRes(Calculator.calculate("{1,2,3,4}/{1,2,3,4}"));
        printRes(Calculator.calculate("{1,2,3,4}/{1,2,3}"));
        Date date2 = new Date();
        Calculator.director.createEndTimeReport(date2);
        System.out.println(Calculator.director.getInfo());

    }
}
