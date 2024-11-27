public class intToRoman12 {

    public static void main(String[] args) {
        System.out.println(intToRoman(3749));
    }

    static String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanChar = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();

        int idx = 0;
        while(num > 0 ){
            if(num >= values[idx]){
                sb.append(romanChar[idx]);
                num -= values[idx];
            }else{
                idx++;
            }
        }
        return sb.toString();
    }
}