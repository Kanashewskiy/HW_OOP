public interface Calculable {
    Calculable sum(Complex arg);
    Calculable diff(Complex arg);
    Calculable multi(Complex arg);
    Calculable div(Complex arg);
    Complex getResult();
}
