public class MaxDiffCanGetByChanInt {
    public int maxDiff(int num) {
        String str1 = Integer.toString(num);
        String str2 = Integer.toString(num);

        int idx= -1;

        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) != '9'){
                idx = i;
                break;
            }
        }
        if(idx != -1){
             str1 = str1.replace(str1.charAt(idx) ,'9');
            }
              int idx2 = 0;
        for(int i = 0; i < str2.length(); i++ ){
            if(str2.charAt(0) != '1'){
                idx2 = i;
                break;
            }else if  ( str2.charAt(i) != 0 && str2.charAt(i) != str2.charAt(0)){
                idx2 = i;
                break;
            }
        }
       if(idx2 == 0)
          str2 = str2.replace(str2.charAt(idx2), '1');
        else str2 = str2.replace(str2.charAt(idx2), '0');


        return Integer.parseInt(str1) - Integer.parseInt(str2);
    }
}
