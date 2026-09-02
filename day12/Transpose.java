package day12;

public class Transpose {
	public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = a.length;
        int cols = a[0].length;
        System.out.println("Transpose");

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }


}
