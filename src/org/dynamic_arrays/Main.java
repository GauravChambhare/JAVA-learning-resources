package org.dynamic_arrays;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.insert(0,"G");
        System.out.println("Dynamic Array: "+ dynamicArray);
        System.out.println("Capacity before size=capacity: "+ dynamicArray.capacity);

        dynamicArray.add("E");
        System.out.println("Dynamic Array: "+ dynamicArray);
        System.out.println("Capacity after size>=capacity: "+ dynamicArray.capacity);

        dynamicArray.delete("G");
        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        System.out.println("Dynamic Array: "+ dynamicArray);

        System.out.println("Size: "+ dynamicArray.size);
        System.out.println("Capacity: "+ dynamicArray.capacity);
        System.out.printf("Is dynamic array Empty: " + dynamicArray.isEmpty());

    }
}
