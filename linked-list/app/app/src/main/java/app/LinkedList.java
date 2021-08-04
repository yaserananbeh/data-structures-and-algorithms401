package app;

import java.util.ArrayList;

public class LinkedList {
    Node head;


    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public boolean includes(int value) {
        boolean isItExixt = false;
        if (head == null) return isItExixt;

        Node current = head;
        while (current.next != null) {
            if (current.value == value) {
                isItExixt = true;
            }
            current = current.next;
        }
        return isItExixt;
    }

    public String toString() {
        String newString = "";
        if (head == null) {
            newString = "";
            return newString;
        }

        Node current = head;
        while (current != null) {
            newString += "{" + current.value + "}->";
            current = current.next;
        }
        newString += "NULL";
        return newString;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insertBefore(int value, int newValue) {
        Node newNode = new Node(newValue);

        if (head == null) {
            head = newNode;
        } else if (head.value == value) {
            Node theRightNode = head;
            head = newNode;
            newNode.next = theRightNode;
        } else {
            Node current = head;
            while (current.next != null) {
                if (current.next.value == value) {
                    Node theRightNode = current.next;
                    current.next = newNode;
                    newNode.next = theRightNode;

                }
                current = current.next;
            }
        }
    }

    public void insertAfter(int value, int newValue) {
        Node newNode = new Node(newValue);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current != null) {
                if (current.value == value) {
                    Node theRightNode = current.next;
                    current.next = newNode;
                    newNode.next = theRightNode;
                }
                current = current.next;
            }
        }
    }

    public String getKthFromEnd(int k) {
        int size = 0;
        ArrayList<Integer> valuesList = new ArrayList<>();
        if (head == null) {
            return "The Linked list Empty";
        } else {
            Node current = head;
            while (current != null) {
                valuesList.add(current.value);
                current = current.next;
                size++;
            }
            if (k < 0 || k > size) {
                return "Exception";
            }
            return "The value that located at index " + k + "  from the tail in this linked list " + valuesList + " " +
                    "IS: " + valuesList.get((size - 1) - k);
        }
    }

    public Node zipLists(LinkedList list1, LinkedList list2) {
        if (list1.head == null) {
            return list2.head;
        } else if (list2.head == null) {
            return list1.head;
        } else {
            Node current1=list1.head;
            Node current2=list2.head;
            Node list1Next,list2Next;

            while (current1 != null && current2 != null) {

                list1Next=current1.next;
                list2Next=current2.next;

                current2.next=list1Next;
                current1.next=current2;

                current1=list1Next;
                current2=list2Next;
            }
            return list1.head;
        }
    }


    public LinkedList reverse(LinkedList list) {
        if(list.head==null) return null;
        int count=0;
        Node current=list.head;
        while (current!=null){
            count+=1;
            current=current.next;
        }
        int newArr[]=new int[count];
        current=list.head;
        for (int i = 0; i < count; i++) {
            newArr[i]=current.value;
            current=current.next;
        }
        LinkedList newLinkedList=new LinkedList();
        for (int i = newArr.length-1; i >=0; i--) {
            newLinkedList.append(newArr[i]);
        }
        return newLinkedList;
    }
}
