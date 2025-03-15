import java.util.HashMap;
import java.util.Map;

public class fruits {
    public static void main(String[] args) {

    }


    // better solution
    static int totalNumbers(int n, int[] arr, int K) {

        int i = 0;
        int j = 0;
        int max_len = 0;

        Map<Integer, Integer> m = new HashMap<>();

        while (i < n) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);

            while (m.size() > K) {
                m.put(arr[i], m.get(arr[i]) - 1);
                if (m.get(arr[i]) == 0)
                    m.remove(arr[i]);
                i++;
            }
            if (m.size() <= K) {
                max_len = Math.max(max_len, j - i + 1);
            }
            j++;
        }
        return max_len;
    }

    //Optimal one
    static int totalNumbersOptimal(int n, int[] arr, int K) {

        int i = 0;
        int j = 0;
        int max_len = 0;

        Map<Integer, Integer> m = new HashMap<>();

        while (i < n) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);


            if(m.size() > K){
                m.put(arr[i], m.get(arr[i]) - 1);
                
                if (m.get(arr[i]) == 0){
                    m.remove(arr[i]);
                }
                i++;
                   
            }
           
            if (m.size() <= K) {
                max_len = Math.max(max_len, j - i + 1);
            }
            j++;
        }
        return max_len;
    }

}
