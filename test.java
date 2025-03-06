import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(-2);
        list.add(3);
        list.add(5);
        list.add(0);

        ArrayList<Integer> asn = new ArrayList<>();
        asn = remove(list);

        for(int i : asn){
            System.out.print(asn.get(i) + " ");
        }


    }

static public ArrayList<Integer> remove(ArrayList<Integer> list){
ArrayList<Integer> ans  = new ArrayList<>();
    for(int i : list){
        if(i >0){
            ans.add(1);
        }else if(i < 0){
            ans.add(i * i);
        }else{
            break;
        }
    }
    return ans;
}

}