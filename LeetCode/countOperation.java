public class countOperation {
    public static void main(String[] args) {
        // System.out.println(countOperations(10, 10));
        System.out.println(countOperationsWithoutRec(2, 3));
    }

    static int countOperations(int num1, int num2) {
        // int count = 0;
        if (num1 == 0 || num2 == 0) {
            return 0;
        }

        if (num1 > num2) {
            return 1 + countOperations(num1 - num2, num2);
        } else {
            return 1 + countOperations(num1, num2 - num1);
        }
    }

    static int countOperationsWithoutRec(int num1, int num2) {
        int count = 0;

        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 = num1 - num2;

            } else {
                num2 = num2 - num1;

            }
            count++;
        }

        return count;

    }
}
