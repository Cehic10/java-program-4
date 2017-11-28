package com.company;

public abstract class Order {
    //data fields
    protected Food[] contents_of_order;
    protected String restaurant_name;
    protected String name_of_orderer;

    //members
    Order(){
        contents_of_order = new Food[10];
        restaurant_name = null;
        name_of_orderer = null;
    }

    public void set_restaurant_name(String to_set){
        restaurant_name = to_set;
    }

    public void set_orderer_name(String to_set){
        name_of_orderer = to_set;
    }

    public void display(){
        System.out.print("Order details: ");//probably use printf for this, display name of restaurant and person and then call food display
    }


}
