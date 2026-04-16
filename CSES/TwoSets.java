// package CSES;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoSets {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        // long sum  = (long)n * ( n + 1) / 2;

        // if(sum % 2 != 0){
        //     System.out.println("NO");
        //     return ;
        // }

        // System.out.println("YES");

        // long target = sum / 2;

        // List<Integer> set1 = new ArrayList<>();
        // List<Integer> set2 = new ArrayList<>();

        // for(int i  =n; i >= 1; i-- ){
        //     if(i <= target){
        //         set1.add(i);
        //         target -= i;
        //     }else{
        //         set2.add(i);
        //     }
        // }

        // //Print set1

        // System.out.println(set1.size());
        // for(int x:set1) System.out.println(x + " ");

        // System.out.println(set2.size());
        //for(int x:set2) System.out.println(x + " ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long sum = (long)n * (n + 1) / 2;

        if (sum % 2 != 0) {
            System.out.println("NO");
            return;
        }

        StringBuilder set1 = new StringBuilder();
        StringBuilder set2 = new StringBuilder();

        long target = sum / 2;
        int count1 = 0, count2 = 0;

        for (int i = n; i >= 1; i--) {
            if (i <= target) {
                set1.append(i).append(" ");
                target -= i;
                count1++;
            } else {
                set2.append(i).append(" ");
                count2++;
            }
        }

        StringBuilder out = new StringBuilder();
        out.append("YES\n");
        out.append(count1).append("\n").append(set1).append("\n");
        out.append(count2).append("\n").append(set2);

        System.out.print(out.toString());
    }
}
