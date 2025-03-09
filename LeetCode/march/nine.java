package march;

// import java.util.Arrays;

public class nine {
    public static void main(String[] args) {
        int[] colors = {0,1,0,0,1,0,1};
        int k  = 6;
        System.out.println(numberOfAlternatingGroups(colors, k));
    }

// brute force approach
public int numberOfAlternatingGroupsBrute(int[] colors, int k){
    int n  = colors.length;
    int N = n + (k - 1);
    int [] copied = new int[N];
    //copying the existing array into new array
    System.arraycopy(colors, 0, copied, 0, n);
     
    // handling the circular case by coping front needed element of colors into copied
    for(int i = 0; i < k - 1; i++){
        copied[n + i] = colors[i];

    }

    int reslt = 0;

    for(int i = 0; i < n; i++){
        boolean isAlternating = true;

        for(int j = i ;j < i +k -1; j++){
            if(copied[j] == copied[j + 1]){
                isAlternating = false;
                break;
            }
        }
        if(isAlternating){
            reslt++;
        }
    }
    return reslt;
}

    //using sliding window
    static public int numberOfAlternatingGroups(int[] colors, int k) {
       

        int n  = colors.length;
        int N = n + (k - 1);
        int [] copied = new int[N];
        //copying the existing array into new array
        System.arraycopy(colors, 0, copied, 0, n);
         
        // handling the circular case by coping front needed element of colors into copied
        for(int i = 0; i < k - 1; i++){
            copied[n + i] = colors[i];
        }
        int i = 0, j =1;
        int reslt  = 0;
        while (j < N) {
            //check if colors is not alternating
            if(copied[j] == copied[j - 1]){
                i = j;
                j++;
                continue;
            }
            if(j -i + 1 == k){
                reslt++;
                i++;
            }
            j++;
        }
        return reslt;
    }

}
