package org.dynamic_arrays;

public class DynamicArrays {

    int capacity = 10;
    Object[] array;
    int size;
    // default constructor
    public DynamicArrays(){
        this.array = new Object[capacity];
    }
    public DynamicArrays(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    public void add(Object data){
        if (size >=capacity){

        }
    }
    public void delete(Object data){

    }
    public void insert(int index, Object data){

    }
    public int search(Object data){
        return -1;
    }
    public Object get(int index){
        return 0;
    }
    private void grow(){

    }
    private void shrink(){

    }
    public boolean isEmpty(){
        return size == 0;
    }
    public String toString(){
        return null;
    }
}
