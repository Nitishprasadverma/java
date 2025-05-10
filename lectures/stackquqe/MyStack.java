package stackquqe;

import java.util.*;

public class MyStack {
    private Queue<Integer> first;
    private Queue<Integer> second;

    public MyStack() {
        first = new LinkedList<>();
        second = new LinkedList<>();
    }

    public void push(int x) {
        first.add(x);
    }

    public int pop() {
        int removed = -1;

        // move all element except the last one

        while (first.size() > 1) {

            second.add(first.remove());
        }

        // last remaining element is removed
       
            removed = first.remove();
        

        

       // reset back to first
        first = second;
        // completely reseting the second queue to the zero
        second = new LinkedList<>();

        return removed;

    }

    public int top() {
        int top = -1;

        // move all element except the last one

        while (first.size() > 1) {

            second.add(first.remove());
        }

        // last remaining element
        
            top = first.peek();
            second.add(first.peek());
        

       // reset back to first
       first = second;
       // completely reseting the second queue to the zero
       second = new LinkedList<>();

       

        return top;
    }

    public boolean empty() {
        return first.isEmpty();
    }

}
