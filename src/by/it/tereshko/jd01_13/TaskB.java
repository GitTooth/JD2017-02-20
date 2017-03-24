package by.it.tereshko.jd01_13;

public class TaskB {
    public static void main(String[] args) {
        try {
            level1();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void level1() throws NumberFormatException, ArithmeticException {
        System.out.println("Beginning procedure level1");
        level2();
        String s = "123";
        if (Math.random() < 0.5)
            s = "qwerty";
        System.out.println(Double.parseDouble(s));
        System.out.println("Ending procedure level1");
    }

    private static void level2() throws ArithmeticException {
        System.out.println("Beginning procedure level2");
//        double root = Math.sqrt(-1+(int)(Math.random()*3);
        if (Math.random() < 0.5)
            throw new ArithmeticException("Exception generation");
        level3();
        System.out.println("Ending procedure level2");

    }

    private static void level3() {
        System.out.println("Beginning procedure level3");
        try {
            int i = 3 / (int) (Math.random() * 3);
        } catch (ArithmeticException e) {
            System.out.println("MathException: " + e.getMessage());
        }
        System.out.println("Ending procedure level3");
    }

//    private static void level3() throws Exception {
//        System.out.println("Beginning procedure level3");
//        Thread.sleep(100);
//        int i = 3 / (int) (Math.random() * 4);
//        System.out.println("Ending procedure level3");
//    }
}
