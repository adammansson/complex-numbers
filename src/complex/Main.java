package complex;

public class Main {

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(2, 2);
        ComplexNumber c = new ComplexNumber(-1, 2);

        ComplexPlane p = new ComplexPlane(7, 7);
        p.add(a);

    }
}
