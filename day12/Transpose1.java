package day12;

public class Transpose1 {
	public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Transpose");

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
