package by.it.zeynalov.jd01_09_matlab;

public class VarV extends Var {
    @Override
    public void fromString(String value) {

    }

    @Override
    public Var add(Var var) {
        System.out.println("Поймали сложение вектора с чем-то");
        return null;
    }
}
