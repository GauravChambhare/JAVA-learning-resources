package org.dynamic_arrays;

public class DynamicArray {

    int size; // size is the last index position of our array.
    int capacity = 10;
    Object[] array;
//  Default constructor
    public DynamicArray(){
        this.array = new Object[capacity];
    }
//  Custom Constructor
    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
//    Methods for this class
//    Add, Insert, Delete, isEmpty, search, grow, shrink, toString, get
    public void add(Object data){
        if( size >= capacity){
            grow();
        }
        array[size] = data;
        size++;
    }
    public void insert(int index, Object data){
        if( size >= capacity){
            grow();
        }
        for(int i = size; i > index; i--){
            array[i] = array[i-1];
        }
        array[index] = data;
        size++;
    }
    public void delete(Object data){
//in delete method we will receive a data which we will need to find in the array and then delete.
        // first find the index position where passed data is present
        for(int i=0; i<size;i++){
            if(array[i] == data){
                // once we find the data then we will start shifting element to left starting from
                //array[i] position
                for(int j=0; j < (size - 1); j++){
                    array[i+j] = array[i+j+1];
                }
                array[size - 1] = null;
                size--;
            }
            break;
        }
        if(size < (int) (capacity/3)){
            shrink();
        }
    }
    public int search(Object data){
        for(int i = 0; i< size; i++){
            if(array[i] == data){
                return i;
            }
        }
        return -1;
    }
    public void grow(){
        int newCapacity = capacity*2;
        Object[] newArray = new Object[newCapacity];
        // Now for loop to copy elements from old to new array
        for (int i = 0; i<size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    public void shrink(){
        // we shrink when size becomes / 3 of capacity as stated in delete function
        // then we decrease the capacity to half the original
        int newCapacity = capacity/2;
        Object[] newArray = new Object[newCapacity];
        // Now for loop to copy elements from old to new array
        for (int i = 0; i<size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public String toString(){
        String string = "";
    for(int i=0; i < capacity; i++){
            string += array[i] + ", ";
        }
        if( string != ""){
            string = "[" + string.substring(0, string.length() - 2) +"]";
        }
        return string;
    }
    public Object get(int index){
        return array[index];
    }
}

