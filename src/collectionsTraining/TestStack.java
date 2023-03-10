package collectionsTraining;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(4);
        stack.push(555);
        stack.push(-22);


        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
