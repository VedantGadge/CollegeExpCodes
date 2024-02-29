import java.util.*;
public class Exp2_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();
        int[][] pattern = new int[rows][];
        for (int i = 0; i < rows; i++) {
            pattern[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                pattern[i][j] = j + 1;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
    }
}