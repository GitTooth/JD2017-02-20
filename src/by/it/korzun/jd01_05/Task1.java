package by.it.korzun.jd01_05;

import static java.lang.Math.*;

class Task1 {
    static double run(){
        double y;
        double x = 234.1;
        double frstRes = pow(sin(PI/2) + 1, 2);
        double scndRes = x * pow((3 + pow(x, 2)), 1/4);
        double thrdRes = pow(tan(pow(x, 3) - 1), 3);
        double frthRes = 1/tan(x/2);
        double fvthRes = log(17.56);
        y = (frstRes + scndRes - thrdRes)/(frthRes - fvthRes);

        //в одну строку
        y = (pow(sin(PI/2) + 1, 2) + x * pow((3 + pow(x, 2)), 1/4) - pow(tan(pow(x, 3) - 1), 3))/(1/tan(x/2) - log(17.56));
        return y;
    }
}
