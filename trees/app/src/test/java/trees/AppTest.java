/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void instantiateTree() {
        System.out.println("test 1 pass");
        BinaryTree binaryTree = new BinaryTree();
        assertEquals("BinaryTree{preOrderArray=[], inOrderArray=[], postOrderArray=[]}", binaryTree.toString());
    }

    @Test
    void instantiateSingleRootNode() {
        System.out.println("test 2 pass");
        Node<Integer> root = new Node(100);
        BinarySearchTree binarySearchTree = new BinarySearchTree(root);
        assertEquals("BinarySearchTree{root=Node{value=100, leftChild=null, rightChild=null}, isItExist=false, " +
                "preOrderArray=[], inOrderArray=[], postOrderArray=[]}", binarySearchTree.toString());
    }

    @Test
    void addLeftRightChildToNode() {
        System.out.println("test 3 pass");
        Node<Integer> leftChild = new Node<>(5);
        Node<Integer> rightChild = new Node<>(10);
        Node<Integer> root = new Node(100, leftChild, rightChild);
        assertEquals("Node{value=100, leftChild=Node{value=5, leftChild=null, rightChild=null}, " +
                "rightChild=Node{value=10, leftChild=null, rightChild=null}}", root.toString());
    }
    @Test
    void testPreOrderTraversal() {
        System.out.println("test 4 pass");
        Node<Integer> node4 = new Node(80);
        Node<Integer> node5 = new Node(95);
        Node<Integer> node6 = new Node(110);

        Node<Integer> node2 = new Node(90, node4, node5);
        Node<Integer> node3 = new Node(120, node6, null);

        Node<Integer> root = new Node(100, node2, node3);
        BinaryTree binaryTree = new BinaryTree();
        assertEquals("[100, 90, 80, 95, 120, 110]", binaryTree.preOrder(root).toString());
    }
    @Test
    void testInOrderTraversal() {
        System.out.println("test 5 pass");
        Node<Integer> node4 = new Node(80);
        Node<Integer> node5 = new Node(95);
        Node<Integer> node6 = new Node(110);

        Node<Integer> node2 = new Node(90, node4, node5);
        Node<Integer> node3 = new Node(120, node6, null);

        Node<Integer> root = new Node(100, node2, node3);
        BinaryTree binaryTree = new BinaryTree();
        assertEquals("[80, 90, 95, 100, 110, 120]", binaryTree.inOrder(root).toString());
    }
    @Test
    void testPostOrderTraversal() {
        System.out.println("test 6 pass");
        Node<Integer> node4 = new Node(80);
        Node<Integer> node5 = new Node(95);
        Node<Integer> node6 = new Node(110);

        Node<Integer> node2 = new Node(90, node4, node5);
        Node<Integer> node3 = new Node(120, node6, null);

        Node<Integer> root = new Node(100, node2, node3);
        BinaryTree binaryTree = new BinaryTree();
        assertEquals("[80, 95, 90, 110, 120, 100]", binaryTree.postOrder(root).toString());
    }
    @Test
    void testAddNodeToTree() {
        System.out.println("test 7 pass");
        Node<Integer> node4 = new Node(80);
        Node<Integer> node5 = new Node(95);
        Node<Integer> node6 = new Node(110);

        Node<Integer> node2 = new Node(90, node4, node5);
        Node<Integer> node3 = new Node(120, node6, null);

        Node<Integer> root = new Node(100, node2, node3);
        Integer valueToAdd=140;
        BinarySearchTree binarySearchTreeAdd = new BinarySearchTree(root);
        binarySearchTreeAdd.add(valueToAdd);
        assertEquals("[80, 90, 95, 100, 110, 120, 140]",binarySearchTreeAdd.inOrder(root).toString());
    }
    @Test
    void testTreeMax() {
        System.out.println("test 8 pass");
        Node<Integer> node4 = new Node(80);
        Node<Integer> node5 = new Node(95);
        Node<Integer> node6 = new Node(110);

        Node<Integer> node2 = new Node(90, node4, node5);
        Node<Integer> node3 = new Node(120, node6, null);

        Node<Integer> root = new Node(100, node2, node3);
        BinaryTree binaryTree=new BinaryTree();

        assertEquals(120,binaryTree.treeMax(root));
    }
    @Test
    void testBreadthFirstTraverse() {
        System.out.println("test 9 pass");
        Node<Integer> node4 = new Node(80);
        Node<Integer> node5 = new Node(95);
        Node<Integer> node6 = new Node(110);

        Node<Integer> node2 = new Node(90, node4, node5);
        Node<Integer> node3 = new Node(120, node6, null);

        Node<Integer> root = new Node(100, node2, node3);
        BinaryTree binaryTree=new BinaryTree();

        assertEquals("[100, 90, 120, 80, 95, 110]",binaryTree.breadthFirst(root).toString());
    }
}
