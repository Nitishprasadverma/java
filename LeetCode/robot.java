public class robot {
    public static void main(String[] args) {
        String moves = "UD";
        System.out.println(judgeCircle(moves));
    }

    static boolean judgeCircle(String moves) {
        int x =0, y =0;
        for(char move : moves.toCharArray()){
            if(move == 'U')   y++;
            else if(move == 'D') y--;
            else if(move == 'L') x++;
            else x--;
        }
        return x == 0 & y == 0; 
    }

}
