package com.company;
import java.util.Comparator;

import static java.lang.Integer.compare;

public class RedBlackTree {
    //fields
    protected BST_node root;

    //members
    RedBlackTree(){
        root = null;
    }

    protected boolean insert(int data){
        BST_node node_to_add = new BST_node(data);
        if (root == null){
            root = node_to_add;
            return true;
        }

        BST_node n = root;
        while (true){
            int comparison = compare(data, n.get_data());
            if (comparison == 0){
                n.set_data(data);
                return true;
            }

            else if (comparison < 0){
                if (n.get_left() == null){
                    n.set_left(node_to_add);
                    adjustAfterInsertion((BST_node) n.get_left());
                    break;
                }
                n = n.getLeft();
            }

            else{
                if (n.get_right() == null){
                    n.set_right(node_to_add);
                    adjustAfterInsertion((BST_node) n.get_right());
                    break;
                }
                n = n.get_right();
            }
        }
        return true;
    }

    private void adjustAfterInsertion(BST_node n){
        //step 1: Make te node red
        n.set_color(false);
        //step 2: Correct any double reds
        if (n != null && n != root && parentOf(n));

    }
    //display
    //retrieve
    //retrieve_all (display_all)?
    //remove_all

}
