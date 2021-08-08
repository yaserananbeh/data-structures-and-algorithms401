/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

public class App {

    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("-------------- Stack --------------");
        System.out.println("-----------------------------------");
        Stack <String>stack1=new Stack<>();
        stack1.push("e1");
        stack1.push("e2");
        stack1.push("e3");
        System.out.println("The stack before Any pop : "+stack1);

        System.out.println("Peek : "+stack1.peek());

        System.out.println("Is the Stack Empty : "+stack1.isEmpty());

        System.out.println("Popped node : "+stack1.pop());

        System.out.println("The stack after the pop : "+stack1);

        System.out.println("-----------------------------------");
        System.out.println("-------------- Queue --------------");
        System.out.println("-----------------------------------");
        Queue <Integer>queue1=new Queue<>();
        queue1.enqueue(100);
        queue1.enqueue(200);
        queue1.enqueue(300);
        queue1.enqueue(400);
        System.out.println("The queue before Any pop : "+queue1);

        System.out.println("Peek : "+queue1.peek());

        System.out.println("Is the Stack Empty : "+queue1.isEmpty());

        System.out.println("Dequeued node : "+queue1.dequeue());

        System.out.println("The queue after pop : "+queue1);
        System.out.println("-----------------------------------");
        System.out.println("-------------- Psedo Queue --------------");
        System.out.println("-----------------------------------");
        PseudoQueue <Integer>pseudoQueue=new PseudoQueue();
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(2);
        pseudoQueue.enqueue(3);
        pseudoQueue.enqueue(4);
        pseudoQueue.dequeue();
        System.out.println(pseudoQueue);


    }
}
