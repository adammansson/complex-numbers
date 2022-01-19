package complex;

public class ComplexPlane {
    public int rows;
    public int cols;
    public ComplexNumber[][] coords;


    public ComplexPlane(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        this.coords = new ComplexNumber[rows][cols];
    }

    public void add(ComplexNumber z) {
        coords[(int) Math.round(z.im) + rows / 2 ][(int) Math.round(z.re) + cols / 2] = z;
    }

    public void draw() {
        for (int r = coords.length - 1; r >= 0; r--) {
            for (int c = 0; c < coords[r].length; c++) {
                if (coords[r][c] == null) {
                    if (rows / 2 == r || cols / 2 == c) {
                        System.out.print(" - ");
                    } else {
                        System.out.print("   ");
                    }

                } else {
                    System.out.print(" x ");
                }
            }
            System.out.print("\n");
        }
    }
}
