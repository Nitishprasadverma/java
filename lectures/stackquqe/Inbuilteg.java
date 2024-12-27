package lectures.stackquqe;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
// import java.util.Stack;

public class Inbuilteg {
    public static void main(String[] args) {
      // Stack<Integer> stack = new Stack<>();
    //   stack.push(23); 
    //   stack.push(45);
    //   stack.push(78);
    //   stack.push(90);
    //   stack.push(12);

      
    //   System.out.println(stack.pop());
    //   System.out.println(stack.pop());
    //   System.out.println(stack.pop());
    //   System.out.println(stack.pop());
    //   System.out.println(stack.pop());
     
Queue<Integer> queue = new LinkedList<>();
queue.add(12);
queue.add(5);
queue.add(6);
queue.add(78);
queue.add(54);
System.out.println(queue.remove());
System.out.println(queue.remove());
System.out.println(queue.remove());
System.out.println(queue.remove());


Deque<Integer> deque = new ArrayDeque<>();
deque.add(4);
deque.addFirst(43);
deque.removeFirst();
    }
}
