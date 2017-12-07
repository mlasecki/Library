package library;

/**
 *
 * @author Mario
 */


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author Mario
 */
public class Person
{//Class Contains Person
    //Field contains names
    private String names;
    //private String email;
    //private int id;
    //Constructor
    public Person(String names)
    {
        this.names = names;
        //this.email = email;
        //this.id = id;
    }
    //method uses to println
    public String toString()
    {
        return "Names: " + this.names;
        //return "Names: " + this.names + " Email " + this.email;
    }
    //method gives names
    public String get_info()
    {
        return "Names: " + this.names;
        //return "Names: " + this.names + " Email " + this.email;
    }
    //method which return names
    public String get_names()
    {
        return this.names;
    }
    //method show field names
    public void print()
    {
        //System.out.print("Names: " + this.names + " | email: " + this.email + "\n");
        System.out.println("Names: " + this.names);
    }
    //main method
    public static void main(String[] args)
    {
        
        //System.out.println("Book1 = "+Book1);
        //System.out.println("Book2 = "+Book2);
        //print("CZY JEST WYPOZYCZONA ? = " +Book1.is_lent());
    }
}

