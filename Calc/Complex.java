public class Complex {

    private final double re;
    private final double im;

    public Complex() {
        this.re = 0.0;
        this.im = 0.0;
    }

    public Complex(double re) {
        this.re = re;
        this.im = 0.0;
    }

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public Complex sum(Complex b){
        return new Complex(this.re + b.re,this.im + b.im);
    }

    public Complex diff(Complex b){
        return new Complex(this.re - b.re,this.im - b.im);
    }

    public Complex multiply(Complex b){
        double multiRe = this.re * b.re - this.im * b.im;
        double multiIm = this.re * b.im + this.im * b.re;
        return new Complex(multiRe,multiIm);
    }

    public Complex divide(Complex b){
        double divDenominator = b.re * b.re + b.im * b.im;
        double divRe =(this.re * b.re + this.im * b.im)/divDenominator;
        double divIm =(this.im * b.re - this.re * b.im)/divDenominator;
        return new Complex(divRe, divIm);
    }

    @Override
    public String toString() {
        if (this.im == 0) return this.re + "";
        if (this.re == 0) return this.im + "i";
        if (this.im < 0) return this.re + " - " + (-this.im) + "i";
        return this.re + " + " + this.im + "i";
    }

}
