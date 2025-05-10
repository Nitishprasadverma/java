package greedy;

public class lemonade {
    public static void main(String[] args) {
        int[] bills = { 5, 5, 5, 10, 20 };
        System.out.println(lemonadeChange(bills));
    }

    static public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5)
                five++;
            else if (bills[i] == 10) {
                if (five >= 1) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else {
                if (five >= 1 && ten >= 1) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
