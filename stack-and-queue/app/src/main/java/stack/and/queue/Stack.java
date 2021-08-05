package stack.and.queue;

public class Stack<T> {

    public Node <T> top;
    public void push(T value){
        Node <T> newNode = new Node<>(value);
        newNode.next=top;
        top=newNode;
    }
    public T pop(){
        if (top==null) try {
            throw new Exception("Empty Stack");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        Node <T> poppedNode=top;
        top=top.next;
        poppedNode.next=null;
        return poppedNode.value;
    }
    public T peek(){
        if (top==null) try {
            throw new Exception("Empty Stack");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return top.value;
    }
    public boolean isEmpty(){
        return top == null;
    }

    @Override
    public String toString() {
        String lastString="";
        if (top==null) return "NULL";
        lastString+="top -> ";
        Node <T>current=top;
        while (current.next!=null){
            lastString+=current.value+" -> ";
            current=current.next;
        }
        lastString+=current.value+" -> null";
        return lastString;
    }
}
