package org.stacks;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        /*Methods available forStack data structure in JAVA are
        * peek()
        * push()
        * pop()
        * empty()
        * search()
        * */

        stack.push("Skyrim");
        stack.push("TW3");
        stack.push("Hogwarts Legacy");
        stack.push("RDR2");
        stack.push("GTAV");
        System.out.println(stack.empty());
        System.out.println(stack.isEmpty());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.search("RDR2")); // if exists it returns the position of the object
        System.out.println(stack.search("RDR@")); // if it doesn't exist it returns -1
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.empty());
        System.out.println(stack.isEmpty());


//        for(int i = 0; i < 1000000000; i++ ){
//            stack.push("Mario");
//        }
//        if you run above code after un commenting it you will get below error
//        Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
    }
}
