package library;
import java.util.*;

/**
 *
 * @author Mario
 */
public class Book 
{
    //Class Describe Book
    //Field Title,year,author,Person(lender)
    private String title;
    private int year;
    private String author;
    private Person person;
    //private int id;
    //private static int id_counter = 0;
//Constructor of Book
public Book(String title,int year,String author)
{
    this.title = title;
    this.year = year;
    this.author = author;
    this.person = null;
    //this.id = id_counter++;
} 
//Method use in System.out.println
public String toString()
{
       return "Title: " +  this.title + "\n" + "year = " + this.year + "\n" + "author = " + this.author + "\n";
}
/*public int get_id()
{
        return this.id;
}*/
//method return title
public String get_title()
{
    return this.title;
}
//method return author of book
public String get_author()
{
    return this.author;
}
//method return year publish of book
public int get_year()
{
    return this.year;
}
//method print all info about book
public void print()
{
    //System.out.println("Title: " +  this.title + " | " + "year: " + this.year + " | " + "author: " + this.author + " | " + "id: " + this.id);
    if(this.person!= null)
    {
        System.out.println("Title: " +  this.title + " | " + "year: " + this.year + " | " + "author: " + this.author + " | Person:" + person);
    }
    else
    {
        System.out.println("Title: " +  this.title + " | " + "year: " + this.year + " | " + "author: " + this.author + " | Person null ");
    }
}
//lend book by person
public void lent(Person person)
{
    this.person = person;
}
//method give information if book is lend
public boolean is_lent()
{
    if (this.person == null)
        return false;
    else
        return true;
}
//main method
public static void main(String[] args){
        //Book Book1 = new Book("Gen",2017,"Siddhartha Mukherjee");
        //Book Book2 = new Book("Niebezpieczne związki Sławomira Petelickiego",2017,"Wojciech Sumlinski");
        //System.out.println("Book1 = "+Book1);
        //System.out.println("Book2 = "+Book2);
        //print("CZY JEST WYPOZYCZONA ? = " +Book1.is_lent());
}

}
