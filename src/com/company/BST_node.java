package com.company;


public class BST_node {
    //fields
    protected int data;
    protected BST_node left_child;
    protected BST_node right_child;
    protected boolean is_black;

    //members
    public BST_node(){
        data = 0;
        left_child = null;
        right_child = null;
        is_black = true;
    }

    public BST_node(int to_insert){
        data = to_insert;
        left_child = null;
        right_child = null;
        is_black = true;
    }

    //set and get functions
    public int get_data(){
        return data;
    }

    public BST_node get_left(){
        return left_child;
    }

    public BST_node get_right() {
        return right_child;
    }

    public boolean get_color() {
        return is_black;
    }

    public void set_data(int to_set){
        data = to_set;
    }

    public void set_left(BST_node to_set){
        left_child = to_set;
    }

    public void set_right(BST_node to_set){
        right_child = to_set;
    }

    public void set_color(boolean black){
        is_black = black;
    }
}
