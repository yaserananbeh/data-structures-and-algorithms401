package app;

public class LinkedList {
    Node head;


    public void insert(int value){
        Node newNode=new Node(value);
        if (head==null){
            head=newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
        }
    }
    public boolean includes(int value){
        boolean isItExixt=false;
        if(head==null) return isItExixt;

        Node current=head;
        while (current.next!=null){
            if(current.value==value){
                isItExixt=true;
            }
            current=current.next;
        }
        return isItExixt;
    }
    public String toString(){
        String newString="";
        if(head==null){
            newString="";
            return newString;
        }

        Node current=head;
        while (current!=null){
            newString+="{"+current.value+"}->";
            current=current.next;
        }
        newString+="NULL";
        return newString;
    }
}
