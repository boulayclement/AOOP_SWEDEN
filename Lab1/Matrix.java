package matrix;

public class Matrix {
    private final int rows;
    private final int cols;
    private final double[][] elements;

    public Matrix(int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;
        elements = new double[rows][cols];
    }

    public double get(int r, int c)
    {
        return elements[r][c];
    }

    public void set(int r, int c, double value)
    {
        elements[r][c] = value;
    }

    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions to be added.");
        }

        Matrix result = new Matrix(this.rows, this.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                result.set(i, j, this.get(i, j) + other.get(i, j));
            }
        }
        return result;
    }

    public Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("The number of columns in the first matrix must be equal to the number of rows in the second matrix to be multiplied.");
        }
        Matrix result = new Matrix(this.rows, other.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                double sum = 0;
                for (int k = 0; k < this.cols; k++) {
                    sum += this.get(i, k) * other.get(k, j);
                }
                result.set(i, j, sum);
            }
        }
        return result;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix a = new Matrix(2, 3);
        Matrix b = new Matrix(3, 2);

        // set values for matrix a
        a.set(0, 0, 1);
        a.set(0, 1, 2);
        a.set(0, 2, 3);
        a.set(1, 0, 4);
        a.set(1, 1, 5);
        a.set(1, 2, 6);

        // set values for matrix b
        b.set(0, 0, 7);
        b.set(0, 1, 8);
        b.set(1, 0, 9);
        b.set(1, 1, 10);
        b.set(2, 0, 11);
        b.set(2, 1, 12);

        // test matrix addition
        Matrix c = a.add(b);
        System.out.println("a + b = ");
        c.print();

        // test matrix multiplication
        Matrix d = a.multiply(b);
        System.out.println("a * b = ");
        d.print();
    }
}

// Matrix a = new Matrix(2, 3);
// Matrix b = new Matrix(2, 3);

// // set the elements of the matrices
// a.set(0, 0, 1);
// a.set(0, 1, 2);
// a.set(0, 2, 3);
// a.set(1, 0, 4);
// a.set(1, 1, 5);
// a.set(1, 2, 6);

// b.set(0, 0, 7);
// b.set(0, 1, 8);
// b.set(0, 2, 9);
// b.set(1, 0, 10);
// b.set(1, 1, 11);
// b.set(1, 2, 12);

// // test the add method
// Matrix c = a.add(b);
// assert c.get(0, 0) == 8;
// assert c.get(0, 1) == 10;
// assert c.get(0, 2) == 12;
// assert c.get(1, 0) == 14;
// assert c.get(1, 1) == 16;
// assert c.get(1, 2) == 18;

// // create two matrices with compatible dimensions
// Matrix d = new Matrix(3, 2);
// Matrix e = new Matrix(2, 3);

// // set the elements of the matrices
// d.set(0, 0, 1);
// d.set(0, 1, 2);
// d.set(1, 0, 3);
// d.set(1, 1, 4);
// d.set(2, 0, 5);
// d.set(2, 1, 6);

// e.set(0, 0, 7);
// e.set(0, 1, 8);
// e.set(0, 2, 9);
// e.set(1, 0, 10);
// e.set(1, 1, 11);
// e.set(1, 2, 12);

// // test the multiply method
// Matrix f = d.multiply(e);
// assert f.get(0, 0) == 27;
// assert f.get(0, 1) == 32;
// assert f.get(0, 2) == 37;
// assert f.get(1, 0) == 57;
// assert f.get(1, 1) == 68;
// assert f.get(1, 2) == 79;
// assert f.get(2, 0) == 87;
// assert f.get(2, 1) == 104;
// assert f.get(2, 2) == 121;