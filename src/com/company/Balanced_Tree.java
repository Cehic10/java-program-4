//******************************
//Name: Adrian Bernat
//Date: 12/06/17
//File Name: Balanced_Tree.java
//Purpose:
//This file contains the declaration and implementation of the balanced BST class. This implements an
//AVL tree, managing the insert, display, retrieval, and remove_all functions to manage the BST.
//********************************************************************************************
package com.company;

public class Balanced_Tree {
    //fields
    BST_node root;

    //members
    //function that retrieves the height of the node
    private int get_height(BST_node n) {
        if (n == null)
            return 0;

        return n.get_height();
    }

    //function to define the greater data
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    //function to get the balance of a node
    private int get_balance(BST_node n){
        if (n == null){
            return 0;
        }

        return get_height(n.get_left()) - get_height(n.get_right());
    }

    //function to perform right rotation
    private BST_node right_rotate(BST_node y) {
        BST_node x = y.get_left();
        BST_node T2 = x.get_right();

        //rotate
        x.set_right(y);
        y.set_left(T2);

        //update the height
        y.height = max(get_height(y.get_left()), get_height(y.get_right())) + 1;
        x.height = max(get_height(x.get_left()), get_height(x.get_right())) + 1;

        //return the new root
        return x;
    }

    //same as above, but for a left rotation
    private BST_node left_rotate(BST_node x) {
        BST_node y = x.get_right();
        BST_node T2 = y.get_left();

        //rotate
        y.set_left(x);
        x.set_right(T2);

        //update the height
        x.height = max(get_height(x.get_left()), get_height(x.get_right())) + 1;
        y.height = max(get_height(y.get_left()), get_height(y.get_right())) + 1;

        //return the new root
        return y;
    }

    //wrapper function for insertion using recursion
    public boolean insert(int data){
        root = insert(root, data);
        return true;
    }

    //function to perform insertion and balancing of tree
    private BST_node insert(BST_node node, int data) {

        //normal BST insertion
        if (node == null)
            return (new BST_node(data));

        if (data < node.get_data())
            node.set_left(insert(node.get_left(), data));
        else if (data > node.get_data())
            node.set_right(insert(node.get_right(), data));
        else //this ensures that there are no duplicate nodes
            return node;

        //update height
        node.height = 1 + max(get_height(node.get_left()),
                get_height(node.get_right()));

        //call the balance function to check if the tree is unbalanced
        int balance = get_balance(node);

        // If this node becomes unbalanced, then there are 4 cases to deal with

        // Left Left Case
        if (balance > 1 && data < node.get_left().get_data())
            return right_rotate(node);

        // Right Right Case
        if (balance < -1 && data > node.get_right().get_data())
            return left_rotate(node);

        // Left Right Case
        if (balance > 1 && data > node.get_left().get_data()) {
            node.set_left(left_rotate(node.get_left()));
            return right_rotate(node);
        }

        // Right Left Case
        if (balance < -1 && data < node.get_right().get_data()) {
            node.set_right(right_rotate(node.get_right()));
            return left_rotate(node);
        }

        //return the node reference
        return node;
    }

    //display tree function
    public void display_all(){
        display_all(root);
        System.out.print("\n");
    }

    private void display_all(BST_node root){
        if (root == null)
            return;
        display_all(root.get_left());
        System.out.print(root.get_data() + " ");
        display_all(root.get_right());
    }

    //retrieve function that returns whether the given data exists
    public boolean retrieve(int to_retrieve){
        return retrieve(root, to_retrieve);
    }

    private boolean retrieve(BST_node root, int to_retrieve){
        if (root == null)
            return false;
        else{
            if (root.get_data() == to_retrieve)
                return true;
            else if (root.get_data() > to_retrieve)
                return retrieve(root.get_left(), to_retrieve);
            else
                return retrieve(root.get_right(), to_retrieve);
        }
    }


    //function that clears the BST. Since we have GC
    //we only need to set the root to null
    public void remove_all() {
        root = null;
    }


}
