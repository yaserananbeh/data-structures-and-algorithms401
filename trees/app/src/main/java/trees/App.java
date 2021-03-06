/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

public class App {

    public static void main(String[] args) {

        Node<Integer> node4 = new Node(80);
        Node<Integer> node5 = new Node(95);
        Node<Integer> node6 = new Node(110);

        Node<Integer> node2 = new Node(90, node4, node5);
        Node<Integer> node3 = new Node(120, node6, null);

        Node<Integer> root = new Node(100, node2, node3);
        BinaryTree binaryTree = new BinaryTree();
        System.out.println("-----------------------------------");
        System.out.println("---------- Pre Order Result -------");
        System.out.println(binaryTree.preOrder(root));

        System.out.println("-----------------------------------");
        System.out.println("-------- In Order Result ----------");
        System.out.println(binaryTree.inOrder(root));

        System.out.println("-----------------------------------");
        System.out.println("-------- Post Order Result --------");
        System.out.println(binaryTree.postOrder(root));

        System.out.println("************************************");
        System.out.println("-------- Binary Search Tree --------");
        System.out.println("************************************");

        System.out.println("-----------------------------------");
        System.out.println("------------- Add method ----------");
        Integer valueToAdd=140;
        BinarySearchTree binarySearchTreeAdd = new BinarySearchTree(root);
        binarySearchTreeAdd.add(valueToAdd);
        System.out.println(binarySearchTreeAdd.inOrder(root));
        System.out.println("-----------------------------------");
        System.out.println("-------- Contains method --------");
        Integer valueToSearch = 100;
        BinarySearchTree binarySearchTreeContains = new BinarySearchTree(root);
        System.out.println("Is the tree contains " + valueToSearch + " ? the result is : " + binarySearchTreeContains.contains(valueToSearch));

        /***************************************************/
        System.out.println("***********************************");
        System.out.println("********* Tree max *************");
        System.out.println(binaryTree.treeMax(root));
        /***************************************************/
        System.out.println("***********************************");
        System.out.println("********* breadth first *************");
        System.out.println(binaryTree.breadthFirst(root));
    }
}
