package com.company;

public class Doubly_LL {
    //protected variables
    protected DLL_node head;
    protected DLL_node tail;
    protected int size_of_list;

    Doubly_LL(){
        head = null;
        tail = null;
        size_of_list = 0;
    }

    //function to check if list is empty
    public boolean is_empty(){
        return head == null;
    }

    //insert function that inserts at the beginning of the list
    public boolean insert(int data_to_insert){
        //create a new node
        DLL_node to_insert = new DLL_node();
        to_insert.set_data(data_to_insert);

        //insert into the head of the list
        //special case if head is null
        if (head == null){
            head = to_insert;
        }

        else{
            head.set_prev(to_insert);
            to_insert.set_next(head);
            head = to_insert;
        }
        size_of_list++;
        return true;
    }

    //display function for the entire list
    public void display() {
        System.out.print("\nThe doubly linked list = ");
        if (head == null) {
            System.out.print("empty\n");
            return;
        }

        display_rec(head);
    }

    public void display_rec(DLL_node current){
        //base case
        if (current == null){
            return;
        }

        System.out.print(current.data);
        System.out.print(", ");
        display_rec(current.next);
    }

    //removes a given data
    public boolean remove(int to_remove){
        return remove_rec(head, to_remove);
    }

    private boolean remove_rec(DLL_node head, int to_remove){
        //base case
        if (head.data == to_remove) {
            head.prev.next = head.next;
            head.next.prev = head.prev;
            return true;
        }

        return remove_rec(head.next, to_remove);
    }

    //recursive remove_all
    public void remove_all(){
        remove_all_rec(head);
    }

    private void remove_all_rec(DLL_node head){
        if (head == null){
            return;
        }
        remove_all_rec(head.next);
        head = null;
    }
}

