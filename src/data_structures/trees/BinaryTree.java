package data_structures.trees;


class Node{
    int data;
    Node leftNode;
    Node rightNode;

    Node(int data){
        this.data = data;
        leftNode = null;
        rightNode = null;
    }
}
public class BinaryTree {

    Node root;


    //inserting elements in the binary tree
    public Node insertNode(Node current, int data){

        if(current == null){
            return new Node(data);
        }

        if(data < current.data){
            current.leftNode = insertNode(current.leftNode, data);
        }else if(data > current.data){
            current.rightNode = insertNode(current.rightNode, data);
        } else {
            return current;
        }

        return current;
    }

    public void add(int data){
        root = insertNode(root, data);
    }

    public void printPreOrder(Node root){
        if(root == null){
            return;
        }

        System.out.println(root.data);
        printPreOrder(root.leftNode);
        printPreOrder(root.rightNode);
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(5);
        bt.add(6);
        bt.add(4);
        bt.add(9);

        bt.printPreOrder(bt.root);
    }

}



