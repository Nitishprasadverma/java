import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // int[] arr = new int[n];

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = in.nextInt();
        // }

        // System.out.println(arr[4]);

        // System.out.println(Arrays.toString(arr)); //shortest method to print the
        // arrays elements.

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        String[] str = new String[4];
        for(int i = 0; i < str.length; i++){
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));
        in.close();

    }
}
