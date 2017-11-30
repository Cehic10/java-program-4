//******************************
//Name: Adrian Bernat
//Date: 11/28/17
//File Name: DLL_node.java
//Purpose:
//This file contains the declaration and implementation of the Doubly linked list's node class, which extends the Order class
//****************************************************************
package com.company;

public class DLL_node extends Order {
    //protected variables
    protected DLL_node next;
    protected DLL_node prev;

    //constructor
    DLL_node(){
        next = null;
        prev = null;
    }

    public DLL_node get_next(){
        return next;
    }

    public DLL_node get_prev() {
        return prev;
    }

    public void set_next(DLL_node to_set){
        next = to_set;
    }

    public void set_prev(DLL_node to_set){
        prev = to_set;
    }


}
