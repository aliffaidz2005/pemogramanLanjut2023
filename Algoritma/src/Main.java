import queue.QueueNode;
import stack.StackNode;

public class Main {
    public static void main(String[] args) {
        StackNode<String> result = new StackNode<>();
        result.push("Alif");
        result.push("Faidz");
        result.push("Apoy");

        result.displaystack();
        System.out.println(result.getSize());

        result.pop();
        result.pop();
        result.displaystack();
        result.peek();

    }
}
