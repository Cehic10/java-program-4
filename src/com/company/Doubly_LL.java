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
    public boolean insert(Order data_to_insert){
        //create a new node
        DLL_node to_insert = new DLL_node();
        to_insert.copy(data_to_insert);

        //insert into the head of the list
        //special case if head is null
        if (is_empty()){
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
        if (is_empty()) {
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

        current.display();
        System.out.println("\n");
        display_rec(current.next);
    }

    //removes a given data
    public boolean remove(String to_remove){
        head = remove(head, to_remove);
        return true;
    }

    private DLL_node remove(DLL_node head, String to_remove){
        //base case
        if (head == null){
            return head;
        }

        if (head.name_of_orderer == to_remove){
            //delete the node
            if (head == tail)
            {
               tail = head.get_prev();
               size_of_list--;
               return null;
            }
            else {
                head = head.get_next();
                size_of_list--;
                return head;
            }
        }

        //regular case
        head.set_next(remove(head.get_next(), to_remove));
        return head;
    }


    public void remove_all(){
        head = null;
        tail = null;
    }
}

