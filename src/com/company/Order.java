package com.company;

public class Order {
    //data fields
    protected Food[] contents_of_order;
    protected String restaurant_name;
    protected String name_of_orderer;
    protected final int number_of_entries = 10;
    protected int num_inserted;

    //members
    Order(){
        contents_of_order = new Food[number_of_entries];
        restaurant_name = null;
        name_of_orderer = null;
        num_inserted = 0;
    }

    public boolean insert(Food item){
        if (num_inserted < number_of_entries) {
            contents_of_order[num_inserted] = item;
            num_inserted++;
            return true;
        }
        else
            return false;
    }

    public void set_restaurant_name(String to_set){
        restaurant_name = to_set;
    }

    public void set_orderer_name(String to_set){
        name_of_orderer = to_set;
    }

    public void display(){
        System.out.println("Order details:");
        System.out.printf("Restaurant Name: %s | name of orderer: %s | Contents of order: \n", restaurant_name, name_of_orderer);
        for (int x = 0; x < num_inserted; x++){
            contents_of_order[x].display();
        }

    }

    public void copy(Order to_copy){
        restaurant_name = to_copy.restaurant_name;
        name_of_orderer = to_copy.name_of_orderer;
        num_inserted = to_copy.num_inserted;
        System.arraycopy(to_copy.contents_of_order, 0, contents_of_order, 0, to_copy.contents_of_order.length);
    }


}
