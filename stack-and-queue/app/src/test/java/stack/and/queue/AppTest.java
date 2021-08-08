/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    //NOTE the terminal will show you some exception called Empty stack these will raise because the test has an edge
    // cases that require raising these exceptions
    @Test void testPushOneNodeToStack() {
        System.out.println("test 1 SUCCESS");
        Stack <Integer>stack1=new Stack<>();
        stack1.push(1);
        assertEquals("top -> 1 -> null", stack1.toString());
    }
    @Test void testPushMultiNodeToStack() {
        System.out.println("test 2 SUCCESS");
        Stack <Integer>stack1=new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        assertEquals("top -> 3 -> 2 -> 1 -> null", stack1.toString());
    }
    @Test void testPopOfTheStack() {
        System.out.println("test 3 SUCCESS");
        Stack <Integer>stack1=new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.pop();

        assertEquals("top -> 2 -> 1 -> null", stack1.toString());
    }
    @Test void testPopUntilEmptyStack() {
        System.out.println("test 4 SUCCESS");
        Stack <Integer>stack1=new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.pop();
        stack1.pop();
        stack1.pop();
        assertEquals("NULL", stack1.toString());
    }
    @Test void testPeekNextItem() {
        System.out.println("test 5 SUCCESS");
        Stack <Integer>stack1=new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.pop();
        assertEquals(3, stack1.peek());
    }
    @Test void testInstantiateEmptyStack() {
        System.out.println("test 6 SUCCESS");
        Stack <Integer>stack1=new Stack<>();

        assertEquals("NULL", stack1.toString());
    }
    @Test void testExeptionPeekOrPopEmptyStack() {
        System.out.println("test 7 SUCCESS");
        Stack <Integer>stack1=new Stack<>();
        stack1.peek();
        stack1.pop();

        assertEquals("NULL", stack1.toString());
    }
    @Test void testEnqueueOneNodeToQueue() {
        System.out.println("test 8 SUCCESS");
        Queue <Integer>queue1=new Queue<>();
        queue1.enqueue(1);
        assertEquals("front -> 1 <- rear", queue1.toString());
    }
    @Test void testEnqueueMultiNodeToQueue() {
        System.out.println("test 9 SUCCESS");
        Queue <Integer>queue1=new Queue<>();
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        assertEquals("front -> 1 -> 2 -> 3 <- rear", queue1.toString());
    }
    @Test void testDequeueFromQueue() {
        System.out.println("test 10 SUCCESS");
        Queue <Integer>queue1=new Queue<>();
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        assertEquals(1, queue1.dequeue());
    }
    @Test void testPeekQueue() {
        System.out.println("test 11 SUCCESS");
        Queue <String>queue1=new Queue<>();
        queue1.enqueue("yaser");
        queue1.enqueue("love");
        queue1.enqueue("molokhia");
        assertEquals("yaser", queue1.peek());
    }

    @Test void testDequeueToEmptyQueue() {
        System.out.println("test 12 SUCCESS");
        Queue <Boolean>queue1=new Queue<>();
        queue1.enqueue(true);
        queue1.enqueue(false);
        queue1.enqueue(true);
        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();
        assertEquals("NULL", queue1.toString());
    }
    @Test void testInstantiateEmptyQueue () {
        System.out.println("test 13 SUCCESS");
        Queue <Boolean>queue1=new Queue<>();

        assertEquals("NULL", queue1.toString());
    }
    @Test void testExeptionPeekOrDequeueEmptyQueue() {
        System.out.println("test 14 SUCCESS");
        Queue <Integer>queue=new Queue<>();
        queue.peek();
        queue.dequeue();

        assertEquals("NULL", queue.toString());
    }
    @Test void testPseudoQueue() {
        System.out.println("test 15 SUCCESS");
        PseudoQueue <Integer>pseudoQueue=new PseudoQueue();
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(2);
        pseudoQueue.enqueue(3);
        pseudoQueue.enqueue(4);
        pseudoQueue.dequeue();

        assertEquals("PseudoQueue{stack1=[], stack2=[4, 3, 2]}", pseudoQueue.toString());
    }
    @Test void testPseudoQueueWithEmptyQueue() {
        System.out.println("test 16 SUCCESS");
        PseudoQueue <Integer>pseudoQueue=new PseudoQueue();
//        pseudoQueue.enqueue(1);
//        pseudoQueue.enqueue(2);
//        pseudoQueue.enqueue(3);
//        pseudoQueue.enqueue(4);
        pseudoQueue.dequeue();

        assertEquals("PseudoQueue{stack1=[], stack2=[]}", pseudoQueue.toString());
    }
    @Test void testPseudoDequeueTheDequeue() {
        System.out.println("test 17 SUCCESS");
        PseudoQueue <Integer>pseudoQueue=new PseudoQueue();
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(2);
        pseudoQueue.enqueue(3);
        pseudoQueue.enqueue(4);

        assertEquals(1, pseudoQueue.dequeue());
    }

}
