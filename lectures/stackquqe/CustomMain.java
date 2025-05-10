package stackquqe;

public class CustomMain {
    public static void main(String[] args) throws StackException{
        // CustomStack stack = new CustomStack(5);
        DyanmicStack stack = new DyanmicStack(5); // this will enable to insert item without throwing any error it will dynamically increase their size;
        stack.push(6);
        stack.push(8);
        stack.push(5);
        stack.push(2);
        stack.push(7);
        stack.push(32);

      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
    }
}
