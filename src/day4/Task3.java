package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        int k, j, i = 0;

        for (i = 0; i < 50; i++) {
            for (j = 0; j < 50; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
