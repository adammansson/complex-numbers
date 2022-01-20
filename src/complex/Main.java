package complex;

public class Main {

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(-1, 2);

        ComplexPlane p = new ComplexPlane(11, 11);
        p.add(a);
        p.add(b);
        p.add(a.conj());
        p.add(a.multiply(b));

        p.draw();
    }
}
