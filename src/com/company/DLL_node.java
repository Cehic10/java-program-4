package com.company;

public class DLL_node {
    //protected variables
    protected int data;
    protected DLL_node next;
    protected DLL_node prev;

    //constructor
    DLL_node(){
        data = 0;
        next = null;
        prev = null;
    }

    DLL_node(int d) {
       data = d;
       next = null;
       prev = null;
    }

    public int get_data() {
       return data;
    }

    public DLL_node get_next(){
        return next;
    }

    public DLL_node get_prev() {
        return prev;
    }

    public void set_data(int to_set){
        data = to_set;
    }

    public void set_next(DLL_node to_set){
        next = to_set;
    }

    public void set_prev(DLL_node to_set){
        prev = to_set;
    }


}
