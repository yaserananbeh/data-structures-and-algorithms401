/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test void instantiateEmptyLinkedList() {
        System.out.println("First Test SUCCESS");
        Node expected=null;
        LinkedList list =new LinkedList();
        assertEquals(expected,list.head);
        String expected1="";
        assertEquals(expected1,list.toString());
    }
    @Test void insertIntoLinkedList() {
        System.out.println("Second Test SUCCESS");
        LinkedList list=new LinkedList();
        list.insert(3);
        list.insert(33);
        list.insert(333);
        list.insert(3333);
        String expected="{3333}->{333}->{33}->{3}->NULL";
        String actual=list.toString();
        assertEquals(expected,actual);
    }
    @Test void HeadAlwaysFirst() {
        System.out.println("Third Test SUCCESS");
        LinkedList list=new LinkedList();
        list.insert(3);
        list.insert(33);
        list.insert(333);
        list.insert(3333);
        //the head value should be equal to 3333
        int expected=3333;
        assertEquals(expected,list.head.value);
    }
    @Test void insertMultipleNode() {
        System.out.println("Fourth Test SUCCESS");
        LinkedList list=new LinkedList();
        list.insert(5);
        list.insert(55);
        list.insert(555);
        String expected="{555}->{55}->{5}->NULL";
        String actual=list.toString();
        assertEquals(expected,actual);
    }
    @Test void testincludesFunction() {
        System.out.println("Fifth Test SUCCESS");
        LinkedList list=new LinkedList();
        list.insert(5);
        list.insert(55);
        list.insert(555);
        boolean expected=true;
        boolean actual=list.includes(55);
        assertEquals(expected,actual);
        boolean expected1=false;
        boolean actual1=list.includes(60);
        assertEquals(expected1,actual1);
    }
    @Test void testToString() {
        System.out.println("sixth Test SUCCESS");
        LinkedList list=new LinkedList();
        list.insert(5);
        list.insert(55);
        String expected="{55}->{5}->NULL";
        assertEquals(expected,list.toString());
    }
    @Test void testAppendOneElement() {
        System.out.println("seventh Test SUCCESS");
        LinkedList list=new LinkedList();
        list.append(5);
        String expected="{5}->NULL";
        assertEquals(expected,list.toString());
    }
    @Test void testAppendManyElements() {
        System.out.println("8th Test SUCCESS");
        LinkedList list=new LinkedList();
        list.append(5);
        list.append(10);
        list.append(15);
        String expected="{5}->{10}->{15}->NULL";
        assertEquals(expected,list.toString());
    }
    @Test void testBeforeMiddle() {
        System.out.println("9th Test SUCCESS");
        LinkedList list=new LinkedList();
        list.append(5);
        list.append(10);
        list.append(15);
        list.insertBefore(10,1000);
        String expected="{5}->{1000}->{10}->{15}->NULL";
        assertEquals(expected,list.toString());
    }
    @Test void testBeforeFirst() {
        System.out.println("10th Test SUCCESS");
        LinkedList list=new LinkedList();
        list.append(5);
        list.append(10);
        list.append(15);
        list.insertBefore(5,1000);
        String expected="{1000}->{5}->{10}->{15}->NULL";
        assertEquals(expected,list.toString());
    }
    @Test void testAfterMiddle() {
        System.out.println("11th Test SUCCESS");
        LinkedList list=new LinkedList();
        list.append(5);
        list.append(10);
        list.append(15);
        list.insertAfter(10,1000);
        String expected="{5}->{10}->{1000}->{15}->NULL";
        assertEquals(expected,list.toString());
    }
    @Test void testAfterLast() {
        System.out.println("11th Test SUCCESS");
        LinkedList list=new LinkedList();
        list.append(5);
        list.append(10);
        list.append(15);
        list.insertAfter(15,1000);
        String expected="{5}->{10}->{15}->{1000}->NULL";
        assertEquals(expected,list.toString());
    }

}