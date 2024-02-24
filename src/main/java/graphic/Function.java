package graphic;

public class Function implements IFunction {

    @Override
    public double func(double x) {
        return Math.pow((x - 500) / 10, 2) + (x - 500) + 100;
    }
}
