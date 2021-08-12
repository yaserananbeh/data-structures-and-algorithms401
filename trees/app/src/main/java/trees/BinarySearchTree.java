package trees;

public class BinarySearchTree<T> extends BinaryTree {
    private Node root;
    private boolean isItExist=false;

    public BinarySearchTree(Node root) {
        this.root = root;
    }

    /*******************************************************/
    /********************* Add method *********************/
    public void add(T value){
        Node newNode=new Node(value);
        if((int) value < (int) root.getValue()){
            if(root.getLeftChild()!=null){
                root=root.getLeftChild();
                add(value);
            }
            else {
                root.setLeftChild(newNode);
            }
        }
        else if((int) value > (int) root.getValue()){
            if(root.getRightChild()!=null){
                root=root.getRightChild();
                add(value);
            }
            else {
                root.setRightChild(newNode);
            }
        }
    }
    /*******************************************************/
    /******************** Contain method *********************/
    public boolean contains(T value) {
        containsOrNot(value);
        return this.isItExist;
    }
    public void containsOrNot(T value){
        if (root == null) {
            this.isItExist=false;
            return;
        }
        if ((int)root.getValue() == (int)value) {
            this.isItExist=true;
            return;
        }
        if ((int) value < (int) root.getValue()) {
            if (root.getLeftChild() == null) {
                this.isItExist=false;
                return;
            }
            root = root.getLeftChild();
            contains(value);
        }
        if ((int) value > (int) root.getValue()) {
            if (root.getRightChild() == null) {
                this.isItExist=false;
                return;
            }
            root = root.getRightChild();
            contains(value);
        }
    }
    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                ", isItExist=" + isItExist +
                ", preOrderArray=" + preOrderArray +
                ", inOrderArray=" + inOrderArray +
                ", postOrderArray=" + postOrderArray +
                '}';
    }
}
