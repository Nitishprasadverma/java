import java.util.ArrayList;
import java.util.List;

public class cellrange {
    public static void main(String[] args) {
        System.out.println(cellsInRange("A1:Z7"));
    }

    static List<String> cellsInRange(String s){
        //split the input into String array to get start and end cell
        String[] parts = s.split(":");

        String startCell = parts[0];
        String endCell = parts[1];

        //for input A1:F1
        char startColumn = startCell.charAt(0);//A
        char startRow = startCell.charAt(1);//1
        char endColumn = endCell.charAt(0);//f
        char endRow = endCell.charAt(1);//1

        List<String> ans = new ArrayList<>();


        //outer loop for columns eg:A1:F1 col = 'A','B','C','D','E','F'
        for(char col = startColumn; col <= endColumn; col++){

            //inner loop control the rows: always row = '1' since both startRow and endRow are '1'
            for(char row = startRow; row <= endRow; row++){
                ans.add("" + col + row);
            }
        }
return ans;
    }
}
