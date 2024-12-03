public class AddSpace {
    public static void main(String[] args) {
        
    }

    static String addSpaces(String s, int[] spaces) {
            //"LeetcodeHelpsMeLearn"  spaces = [8,13,15]
        int i = 0,j = 0;
        StringBuilder sb = new StringBuilder();
        while(i < s.length() && j < spaces.length){

            //checking is is there space is to be added 
            if(i < spaces[j]){
                sb.append(s.charAt(i));
                i++; //increment of i to move to the next charater

            }else{
                //space is added after the all char is added till spaces range   is specified 
                sb.append(" ");
                j++; // space is moving to next space 
            }
        }


        // adding left string words .i.e. after spaces[2] = 13 ,will left remaining string which is Learn bcz while condition will be false wehen  j = 3 out of spaces array length
        sb.append(s.substring(i));
        return sb.toString();
    }
}
