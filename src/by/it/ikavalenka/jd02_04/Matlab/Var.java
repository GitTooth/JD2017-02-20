package by.it.ikavalenka.jd02_04.Matlab;


public abstract class Var implements IAddable, ISubtractable, IMultiplicable, IDividable {

    @Override
    public Var add(Var value) throws ErrorException {
        try {
            throw new ErrorException("Addition is impossible.");
        } catch (ErrorException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Var sub(Var value) throws ErrorException {
        try {
            throw new ErrorException("Subtraction is impossible.");
        } catch (ErrorException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Var multi(Var value) throws ErrorException {
        try {
            throw new ErrorException("Multiplication is impossible.");
        } catch (ErrorException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Var divide(Var value) throws ErrorException {
        try {
            throw new ErrorException("Division is impossible.");
        } catch (ErrorException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


    public String getType (){
        return null;
    }

}
