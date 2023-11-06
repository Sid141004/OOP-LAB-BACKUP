import java.util.Random;

class Matrix {
    private int[][] data;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = rand.nextInt(100); // Fill the matrix with random values (0-99)
            }
        }
    }

    public int getMaxValue() {
        int max = data[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (data[i][j] > max) {
                    max = data[i][j];
                }
            }
        }
        return max;
    }

    public void displayMatrix() {
        synchronized (this) {
            System.out.println("Matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(data[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

    public void displayTranspose() {
        synchronized (this) {
            System.out.println("Transpose of the Matrix:");
            for (int j = 0; j < cols; j++) {
                for (int i = 0; i < rows; i++) {
                    System.out.print(data[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

    public void displayPrincipalDiagonal() {
        synchronized (this) {
            System.out.println("Principal Diagonal Elements:");
            for (int i = 0; i < Math.min(rows, cols); i++) {
                System.out.print(data[i][i] + "\t");
            }
            System.out.println();
        }
    }

    public void displayNonDiagonalElements() {
        synchronized (this) {
            System.out.println("Non-Diagonal Elements:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i != j) {
                        System.out.print(data[i][j] + "\t");
                    }
                }
                System.out.println();
            }
        }
    }
}

public class Matrix_Operations {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(4, 4);

        Thread t1 = new Thread(() -> matrix.displayMatrix());
        Thread t2 = new Thread(() -> matrix.displayTranspose());
        Thread t3 = new Thread(() -> System.out.println("Maximum value in the Matrix: " + matrix.getMaxValue()));
        Thread t4 = new Thread(() -> matrix.displayPrincipalDiagonal());
        Thread t5 = new Thread(() -> matrix.displayNonDiagonalElements());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
