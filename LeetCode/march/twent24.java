package march;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class twent24 {
    public static void main(String[] args) {
        String formula = "K4(ON(SO3)2)2";
        System.out.println(countOfAtoms(formula));
    }

    static public String countOfAtoms(String formula) {
        Stack<Map<String, Integer>> atomStack = new Stack<>();
        HashMap<String, Integer> currentMap = new HashMap<>();
        int index = 0;
        int n = formula.length();
        while (index < formula.length()) {
            if (formula.charAt(index) == '(') {
                atomStack.push(currentMap);
                currentMap = new HashMap<>();
                index++;
            } else if (formula.charAt(index) == ')') {
                index++;
                int multiplierNum = 0;
                while (index < n && Character.isDigit(formula.charAt(index))) {
                    multiplierNum = multiplierNum * 10 + (formula.charAt(index) - '0');
                    index++;
                }

                multiplierNum = (multiplierNum == 0) ? 1 : multiplierNum;
                Map<String, Integer> prevMap = atomStack.pop();
                for (String key : currentMap.keySet()) {
                    currentMap.put(key, currentMap.get(key) * multiplierNum);
                }

                for (String key : prevMap.keySet()) {
                    currentMap.put(key, prevMap.getOrDefault(key, 0) + currentMap.getOrDefault(key, 0));
                }

            } else {
                int start = index;
                index++;

                while (index < n && Character.isLowerCase(formula.charAt(index))) {
                    index++;
                }
                String s = formula.substring(start, index);
                int count = 0;
                while (index < n && Character.isDigit(formula.charAt(index))) {
                    count = count * 10 + (formula.charAt(index) - '0');
                    index++;
                }
                count = (count == 0) ? 1 : count;

                currentMap.put(s, currentMap.getOrDefault(s, 0) + count);
            }
        }
        StringBuilder reslt = new StringBuilder();
        List<String> elems = new ArrayList<>(currentMap.keySet());
        Collections.sort(elems);

        for (String elem : elems) {
            reslt.append(elem);
            if (currentMap.get(elem) > 1) {
                reslt.append(currentMap.get(elem));
            }
        }
        return reslt.toString();
    }
}
