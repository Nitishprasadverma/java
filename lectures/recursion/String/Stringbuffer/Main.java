package lectures.recursion.String.Stringbuffer;
// import java.util.Random;
import java.util.Arrays;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        //contructor1
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());//initial capacity bydefault is 16

        //constructor2

        StringBuffer sb2 = new StringBuffer("nitish Prasad Verma");

        //constructor
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity());

        sb.append("weMakesDevOps");
        sb.append("is awesome");

        // sb.insert(2, "Niti");
        // System.out.println(sb);

        sb.replace(1, 5, "kushwaha");

        // System.out.println(sb);

        sb.delete(1, 5);
        // System.out.println(sb);

        //sb.reverse();

        String str = sb.toString();
        System.out.println(str);
//Random string
        int n = 20;
        String name = RandomString.generate(n);
        System.out.println(name);

        String sentence = "hi h ks an hajaj ndks";

        System.out.println(sentence.replace("\\s", ""));
//split
        String arr = "Nitish ,Pankaj,Abhimanyu";
        String[] names = arr.split(",");
        System.out.println(Arrays.toString(names));

        //Rounding off

        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.39));

    }
}
