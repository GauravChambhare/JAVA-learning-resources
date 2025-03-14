package org.linked_lists;
import org.linked_lists.Node;

public class linked_lists {
    
    public linked_lists(){
        int length = 0;
    }

    Node head;
    private int length=0; //length of linked list

    //return first node in linked list
    public synchronized Node getHead(){
        return head;
    }
    //insert a node at the begining of the list
    public synchronized void insertAtBegining(Node node){

        node.setNext(head); // set next pointer of new node as current head node
        head = node; // set head pointer to point to new node
        length++;

    }
    //insert a node at the end of the list
    public synchronized void insertAtEnd(Node node){

        if(head==null){ // linked list is empty
            head = node;
        }

        Node currentNode = head;
        while(currentNode.getNext()!=null){
            currentNode = currentNode.getNext();
        }
        //now we have reached last node
        // setting next of new node as null
        node.setNext(null);
        // set next of currentNode(which is last node) as node(new node)
        currentNode.setNext(node);
        length++;
    }
    //insert data in linked list at given index position
    public synchronized void insertInMiddle(int data , int position){

        //first check the position 
        if(position < 0){
            position = 0;
        }
        if(position > length){//i.e it exceeds even current length of linked list then set it as legnth 
            position = length;
        }
        //if list is empty 
        if(head==null){
            head = new Node(data);
        }
        //if position==0 then we have to insert the node at the begining 
        if(position==0){
            Node temp = new Node(data);
            temp.setNext(head);
            head = temp;
        }
        else { //when position is >0  then we will need to go to proper point and then add the node there.
            Node temp = head;//we are creating thos temp so that we can traverse the linked list
            for(int i=1; i<position; i++){
                temp = temp.getNext();
            }
            Node newNode = new Node(data);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);

        }
        length++;

    }
    
}
