package Matrix;

public class Main {
    public static void main(String[] args) {
        Matrix a = new Matrix(2, 3);
        Matrix b = new Matrix(3, 2);
        Matrix e = new Matrix(2, 3);
        
    
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

        e.set(0, 0, 1);
        e.set(0, 1, 2);
        e.set(0, 2, 3);
        e.set(1, 0, 4);
        e.set(1, 1, 5);
        e.set(1, 2, 6);
    
        // test matrix addition
        a.print();
        b.print();
        Matrix c = a.add(e);
        System.out.println("a + e = ");
        c.print();
    
        // test matrix multiplication
        Matrix d = a.multiply(b);
        System.out.println("a * b = ");
        d.print();
    }
}
