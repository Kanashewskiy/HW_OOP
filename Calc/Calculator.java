public class Calculator  implements Calculable{

    private Complex resultCalc;

    public Calculator(Complex firstArg){
        this.resultCalc = firstArg;
    }

    @Override
    public Calculable sum(Complex arg) {
        this.resultCalc = this.resultCalc.sum(arg);
        return this;
    }

    @Override
    public Calculable diff(Complex arg) {
        this.resultCalc = this.resultCalc.diff(arg);
        return this;
    }

    @Override
    public Calculable multi(Complex arg) {
        this.resultCalc = this.resultCalc.multiply(arg);
        return this;
    }

    @Override
    public Calculable div(Complex arg) {
        this.resultCalc = this.resultCalc.divide(arg);
        return this;
    }

    @Override
    public Complex getResult() {
        return resultCalc;
    }

}
