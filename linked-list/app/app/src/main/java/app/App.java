/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package app;

public class App {

    public static void main(String[] args) {
        LinkedList list1=new LinkedList();
        list1.insert(50);
        list1.insert(100);
        list1.insert(150);
        list1.insert(200);
        System.out.println("-------------------------------");
        int value=200;
        System.out.println("Does the linked list include ("+value+") : "+list1.includes(value));
        System.out.println("-------------------------------");

        Node head= list1.head;
        if (head==null){
            System.out.println("------------------------------");
            System.out.println("The linked list is Empty!");
            System.out.println("-------------------------------");
        }else {
            System.out.println("-------------------------------");
            System.out.println("the linked list elements :");
            Node current = head;
            while (current != null) {
                System.out.println(current.value);
                current = current.next;
            }
            System.out.println("-------------------------------");

        }
        System.out.println("-------------------------------");
        System.out.println(list1.toString());
        System.out.println("-------------------------------");
        System.out.println("--------code challenge 06----------");
        System.out.println("-------------------------------");
        LinkedList list2=new LinkedList();
        list2.append(20);
        list2.append(40);
        list2.append(80);
        list2.append(100);
        System.out.println(list2.toString());
        System.out.println("-------------------------------");
        System.out.println("insertBefore");
        list2.insertBefore(40,50);
        System.out.println(list2);
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println("insertAfter");

        list2.insertAfter(50,1000);
        System.out.println(list2);
        System.out.println("-------------------------------");

    }
}