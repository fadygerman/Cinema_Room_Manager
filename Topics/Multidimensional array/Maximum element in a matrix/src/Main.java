import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] towDArr = new int[row][column];
        int max = 0;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                towDArr[i][j] = sc.nextInt();
                if (j == 0 && i == 0) {
                    max = towDArr[i][j];

                }
                if (towDArr[i][j] > max) {
                    max = towDArr[i][j];
                    maxRow = i;
                    maxCol = j;
                }

            }

        }
        System.out.println(maxRow + " " + maxCol);
    }
}
