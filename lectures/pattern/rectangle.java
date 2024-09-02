import java.util.*;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        pattern13(a);
        sc.close();
    }

    static void pattern1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern2(int n) {
        for (int row = 1; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern3(int n) {
        for (int row = n; row > 0; row--) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern4(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }

    }

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            // int totalPattern = row;
            // if(totalPattern > n){
            // totalPattern = 2 * n - row;
            // }
            // else{
            // totalPattern = row;
            // }
            // System.out.println(totalPattern);
            int totalPattern = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalPattern; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    static void pattern6(int n) {

        for (int row = 1; row <= n; row++) {

            int space = n - row;
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern7(int n) {

        for (int row = n; row > 0; row--) {

            int space = n - row;
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern8(int n) {
        for (int r = 0; r < n; r++) {
            int space = n - r;
            for (int s = 0; s < space; s++) {

                System.out.print(" ");
            }

            for (int c = 0; c < 2 * r + 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int r = n; r >= 0; r--) {
            int space = n - r;
            for (int s = 0; s < space; s++) {

                System.out.print(" ");
            }

            for (int c = 0; c < 2 * r + 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int r = 0; r <= n; r++) {

            int space = n - r;
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }

            for (int c = 0; c < r; c++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int r = n; r > 0; r--) {

            int space = n - r;
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }

            for (int c = 0; c < r; c++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int column = row > n ? row - n : n - (row - 1);
            int space = row > n ? 2 * n - row : row - 1;

            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < column; col++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern13(int n) {
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col < n * 2; col++) {

                if ((row == 4) || (row + col == 5) || (col - row == 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    static void pattern14(int n) {

    }

    static void pattern15(int n) {

    }

    static void pattern16(int n) {

    }

    static void pattern17(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int column = row > n ? 2 * n - row : row;
            int space = n - column;
            // int space = n - column;

            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }

            for (int col = column; col >= 1; col--) {
                System.out.print(col);

            }
            for (int col = 2; col <= column; col++) {
                System.out.print(col);

            }
            System.out.println();
        }
    }

    static void pattern18(int n) {

    }

    static void pattern19(int n) {

    }

    static void pattern20(int n) {

    }

    static void pattern21(int n) {

    }

    static void pattern22(int n) {

    }

    static void pattern23(int n) {

    }

    static void pattern24(int n) {

    }

    static void pattern25(int n) {

    }

    static void pattern26(int n) {

    }

    static void pattern27(int n) {

    }

    static void pattern28(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int column = row > n ? 2 * n - row : row;
            int space = row > n ? row - n : n - row;
            // int space = n - column;

            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < column; col++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern29(int n) {

    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {

            int space = n - row;
            for (int s = 0; s < space; s++) {

                System.out.print(" ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern31(int n) {

    }

    static void pattern32(int n) {

    }

    static void pattern33(int n) {

    }

    static void pattern34(int n) {

    }

    static void pattern35(int n) {

    }

}
