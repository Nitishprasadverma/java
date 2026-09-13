package Annotation;
import java.util.*;;

public class Log {
    public  static  void printLogValues(List<Integer>... logNumberList){

        Object [] objectsList = logNumberList;

        List<String> stringValuesList = new ArrayList<>();
        stringValuesList.add("Hello");
        objectsList[0] = stringValuesList;
    }
}
