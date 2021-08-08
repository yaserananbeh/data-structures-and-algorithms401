package stack.and.queue;


import java.util.Stack;

public class PseudoQueue<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;

    public PseudoQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }
    public void enqueue(T value) {
        stack1.push(value);
    }
    public T dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return null;
        }
        if (stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        } else {
            return stack2.pop();
        }
    }

    @Override
    public String toString() {
        return "PseudoQueue{" +
                "stack1=" + stack1 +
                ", stack2=" + stack2 +
                '}';
    }
}
