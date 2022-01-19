package complex;

public class ComplexNumber {
    public double re;
    public double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public ComplexNumber conj() {
        return new ComplexNumber(re, -im);
    }

    public ComplexNumber add(ComplexNumber z) {
        return new ComplexNumber(re += z.re, im += z.im);
    }

    public ComplexNumber remove(ComplexNumber z) {
        return new ComplexNumber(re -= z.re, im -= z.im);
    }

    public ComplexNumber multiply(ComplexNumber z) {
        double newRe = (re * z.re) - (im * z.im);
        double newIm = (re * z.im) + (im * z.re);

        return new ComplexNumber(newRe, newIm);
    }

    public ComplexNumber reciprocal() {
        double newRe = re / (multiply(conj()).re);
        double newIm = -im / (multiply(conj()).re);

        return new ComplexNumber(newRe, newIm);
    }

    public ComplexNumber divide(ComplexNumber z) {
        return multiply(z.reciprocal());
    }

    public void printCartesian() {
        String msg = re + ", " + im + "*i";
        System.out.println("Cartesian: (" + msg + ")");
    }
}
