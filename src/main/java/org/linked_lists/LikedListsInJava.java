package org.linked_lists;
import java.util.Collections;
import java.util.LinkedList;

/*
Step 1: Create and Populate the Linked List
    Create an empty LinkedList<Integer>.
Add the numbers {10, 20, 30, 40, 50} in order.
    Step 2: Perform Operations
    Add 5 at the beginning.
    Add 60 at the end.
    Insert 25 at index 3.
    Remove the first element.
    Remove the last element.
    Remove the element at index 2.
    Retrieve and print the third element.
    Check if 30 exists in the list.
    Reverse the linked list.
    Print the linked list after each operation.
*/

public class LikedListsInJava {
    public static void main(String[] args) {
        
        LinkedList<Integer> llist = new LinkedList<>();
        // adding element to linked list
        llist.add(10);
        llist.add(20);
        llist.add(30);
        llist.add(40);
        llist.add(50);
        System.out.println("Printing the linked list - " + llist);
        llist.addFirst(5);
        llist.addLast(60);
        llist.add(3,25);
        llist.removeFirst();
        llist.removeLast();
        llist.remove(2);
        System.out.println("Third element: - " + llist.get(2));
        System.out.println(llist.contains(30));
        System.out.println("Printing the linked list - " + llist);
        reverseList(llist);
        System.out.println("After reversing the linked list -  " + llist);
        Collections.reverse(llist);
        System.out.println("Reversing the linked list using inbuilt reverse method from collections class - " + llist);
    }

    public static void reverseList(LinkedList<Integer> list){

        for(int i=0, j = list.size()-1; i<j; i++, j--){
            Integer temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
    
}
