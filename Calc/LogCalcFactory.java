public class LogCalcFactory  implements ICalculableFactory{

    private final Logg logger;

    public LogCalcFactory(Logg logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(Complex firstArg) {
        return new LogCalc(new Calculator(firstArg), this.logger);
    }
}
