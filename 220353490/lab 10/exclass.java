import java.util.Scanner;

class MatrixValidator {
    public static boolean isSquareMatrix(int[][] matrix) throws Exception {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows != cols) {
            throw new Exception("Invalid matrix: not a square matrix");
        }
        return true;
    }
}

class validateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and number of columns");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int Mat[][] = new int[rows][cols];
        MatrixValidator validator = new MatrixValidator(); 
        try {
            validator.isSquareMatrix(Mat);
        } catch(Exception e) {
               System.out.println(e.getMessage());
        } 
        // finally {
        //     System.out.println("Matrix validated");
        // }
        int c[][]=new int[rows][cols];
        for ( int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                Mat[i][j]=sc.nextInt();}
            }

        for ( int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                c[i][j]=0;
                for(int k=0;k<3;k++){
                c[i][j]+=Mat[i][k]*Mat[k][j];
            }
        }
    }
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j <3; j++) {
            System.out.print(c[i][j]+" ");
        }
        System.out.println();
    }

    }

}