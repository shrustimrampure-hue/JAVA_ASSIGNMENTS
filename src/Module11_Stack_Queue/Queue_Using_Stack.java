package Module11_Stack_Queue;

import java.util.Stack;
public class Queue_Using_Stack {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    public void push(int x) {
        input.push(x);
    }
    public int pop() {
        peek();
        return output.pop();
    }
    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty())
                output.push(input.pop());
        }
        return output.peek();
    }
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
    public static void main(String[] args) {
        Queue_Using_Stack q = new Queue_Using_Stack();
        q.push(1);
        q.push(2);
        System.out.println(q.peek());
        System.out.println(q.pop());
    }
}