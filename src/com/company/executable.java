//******************************
//Name: Adrian Bernat
//Date: 12/06/17
//File Name: executable.java
//Purpose:
//This file contains the interface information for the executable interface. This was needed to
//allow the generic BST implementation to call certain functions from the classes that it will
//represent. For example, this will force the driver class to contain these functions, because it
//is used as a data type in the BST template at runtime.
//********************************************************************************************
package com.company;

public interface executable {
    int get_data();
    void display();
    String get_name();
}
