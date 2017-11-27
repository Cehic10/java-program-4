package com.company;

abstract public class Order {
    //data fields
    protected Food[] contents_of_order;
    protected String restaurant_name;
    protected String name_of_orderer;

    //members
    Order(){
        contents_of_order = null;
        restaurant_name = null;
        name_of_orderer = null;
    }

}
