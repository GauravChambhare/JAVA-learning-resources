package org.linked_lists;
// this is the node class
public class Node {
    
    private int data;
    private Node next;

    // defining the constructor for this class
    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public void setData(int data){
        this.data = data;
    }
    
    public int getData(){
        return this.data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }


    //create a function to find length of linked list and print the linked list\
    public int getLength(Node headNode){
        // Time Complexity: O(n), for scanning the list of size n. Space Complexity: O(1), for creating a
        // temporary variable.
        int length = 0;
        Node curretNode = headNode;
        while(curretNode != null){
            System.out.print(curretNode.getData() + " -> ");
            length++;
            curretNode = curretNode.getNext();
        }
        System.out.println("null");
        return length;
    }

    public static void main(String[] args) {
        Node n = new Node(1);
        System.out.println(n.getData());
        int len = n.getLength(n);
        System.out.println(len);
    }
}
