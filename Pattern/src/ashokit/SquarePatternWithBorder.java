package ashokit;
public class SquarePatternWithBorder {
    public static void main(String[] args) {
        int m = 5; 

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == m - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}