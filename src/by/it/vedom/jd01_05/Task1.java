package by.it.vedom.jd01_05;

import static java.lang.Math.*;
import static java.lang.Math.atan;
import static java.lang.Math.pow;

/**
 * Created by Владислав on 01.03.2017.
 */
public class Task1 {

   public static double optionA (double x) {
       double a = pow(sin(PI/2+1), 2);
       double b = x*pow(3*(pow(x, 2)), 1/4);
       double c = pow(tan((pow(x,3)-1)), 3); // tg^3*(x^3-1)
       double d = (1/atan(x/2)) - log10(17.56);

       x = (a + b -c) / d;

       return x;
   }

   public static double optionB (double x) {
       x = (pow(sin(PI/2+1), 2) + x*pow(3*(pow(x, 2)), 1/4) - pow(tan((pow(x,3)-1)), 3)) / ((1/atan(x/2)) - log10(17.56));
       return x;
   }

}
