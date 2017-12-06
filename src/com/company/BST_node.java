//******************************
//Name: Adrian Bernat
//Date: 12/06/17
//File Name: BST_node.java
//Purpose:
//This file contains the declaration of the BST_node class. This stores the data, height of the
//node (for AVL), and references to the left and right children of the node.
//********************************************************************************************
package com.company;

public class BST_node {
    //fields
    protected int data;
    protected int height;
    protected BST_node left_child;
    protected BST_node right_child;

    //members
    BST_node(){
        data = 0;
        height = 0;
        left_child = null;
        right_child = null;
    }

    BST_node(int to_insert){
        data = to_insert;
        height = 1;
        left_child = null;
        right_child = null;
    }

    //set and get functions for protected data
    public int get_data(){
        return data;
    }

    public int get_height(){
        return height;
    }

    public BST_node get_left() {
        return left_child;
    }

    public BST_node get_right() {
        return right_child;
    }

    public void set_data(int to_set){
        data = to_set;
    }

    public void set_height(int to_set){
        height = to_set;
    }

    public void set_left(BST_node to_set){
        left_child = to_set;
    }

    public void set_right(BST_node to_set){
        right_child = to_set;
    }
}
