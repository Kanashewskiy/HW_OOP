public class LogCalc implements Calculable{

    private final Calculable oldCalc;
    private final Logg logg;

    public LogCalc(Calculable oldCalc, Logg logg) {
        this.oldCalc = oldCalc;
        this.logg = logg;
    }

    @Override
    public Calculable sum(Complex arg) {
        Complex firstArg = oldCalc.getResult();
        logg.log(String.format("Значение калькулятора %s. Начало вызова метода sum с параметром %s", firstArg, arg));
        Calculable result = oldCalc.sum(arg);
        logg.log("Вызов метода sum произошел.");
        return result;
    }

    @Override
    public Calculable multi(Complex arg) {
        Complex firstArg = oldCalc.getResult();
        logg.log(String.format("Значение калькулятора %s. Начало вызова метода multi с параметром %s", firstArg, arg));
        Calculable result = oldCalc.multi(arg);
        logg.log("Вызов метода multi произошел.");
        return result;
    }

    @Override
    public Calculable div(Complex arg) {
        Complex firstArg = oldCalc.getResult();
        logg.log(String.format("Значение калькулятора %s. Начало вызова метода div с параметром %s", firstArg, arg));
        Calculable result = oldCalc.div(arg);
        logg.log("Вызов метода div произошел.");
        return result;
    }

    @Override
    public Calculable diff(Complex arg) {
        Complex firstArg = oldCalc.getResult();
        logg.log(String.format("Значение калькулятора %s. Начало вызова метода minus с параметром %s", firstArg, arg));
        Calculable result = oldCalc.diff(arg);
        logg.log("Вызов метода minus произошел.");
        return result;
    }

    @Override
    public Complex getResult() {
        Complex result = oldCalc.getResult();
        logg.log(String.format("Получение результата %s", result));
        return result;
    }
}
