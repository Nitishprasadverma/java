import java.util.*;
public class matchingRule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(List.of("phone","blue","pixel"));
        items.add(List.of("computer", "silver", "phone"));
        items.add(List.of("phone", "gold", "iphone"));
       
       System.out.println(countMatches(items, "color" ,"silver"));
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int i = 0;
        int count = 0; 
        ruleKey.toLowerCase();
        ruleValue.toLowerCase();
        if(ruleKey == "color"){
            i = 1;
        }
        if(ruleKey == "name"){
            i = 2;
        }
        System.out.println(items.size());
      for(int item = 0; item<items.size(); item++){
        if(items.get(item).get(i) == "ruleValue"){
            count++;
        }
      }
      return count;
    }
}
