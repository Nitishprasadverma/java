public class MaxmimumDiffRemap {
     public int minMaxDifference(int num) {
        String str1 = Integer.toString(num);
        String str2 = Integer.toString(num);



//Finding the first index where 9 is not ther
        int idx = 0;
        for(int i  = 0; i < str1.length(); i++){
             if(str1.charAt(i) != '9'){
                idx = i;
                break;
             }
        } 

//replacing the digit which is not 9 at the given index to make it maximum;
        if(idx < str1.length()){
          str1 =  str1.replace(str1.charAt(idx), '9');
        }

      //replacing the digit with 0 to make it minimum
     str2 = str2.replace(str2.charAt(0), '0');
     return Integer.parseInt(str1) - Integer.parseInt(str2);

    }
}
