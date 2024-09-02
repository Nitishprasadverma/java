// Online Java Compiler
// Use this editor to write, compile and run your Java code online

package LinerSearch;

// import java.util.*;
 public class  SearchInRange{
public static void main(String[] args) {
    int[] arr = {18,34,45,67,89,0};
int target = 89;
System.out.println(LinerSearch(arr ,target,1,4));
}

static int LinerSearch(int[]  arr, int target, int start, int end){
    if(arr.length == 0){
        return -1;
    }

    for(int index = start; index <= end ;index++){
        int element = arr[index];
        if(element ==target ){
            return index;
        }
    }
    return -1;
}
    
}

