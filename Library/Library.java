
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
import java.util.*;

/**
 *
 * @author Mario
 */
public class Library {
//main class libratry
//id_counter of book    
private static int id_counter = 0;
//id_person who is ib library
private static int id_person = 0;
//private Set library = new HashSet();
//Container of books
private HashMap library = new HashMap();
//Container of Person who are in library
private HashMap lenters = new HashMap();

public void add_book(String name,int rok,String autor)
{
    this.library.put(this.id_counter,new Book(name,rok,autor));
    this.id_counter++;
}
//method which remove book from library
public void remove_book(int id)
{
    System.out.println("Function=============Remove_book ==================");
    if(library.containsKey(id))
    {
        System.out.println("Book is library");
        if(!((Book)library.get(id)).is_lent())
            library.remove(id);
        else
            System.out.println("This book is lend!!!!");      
    }
    else
        System.out.println("Book was deleted or was not add to library!!!");
    {
    }
    System.out.println("Function=============Remove_book =================="); 
}
//method which return number of books in library
public int count()
{
    return library.size();
}
public void show()
{
    //method which give information about all books in library
    int i = 0;
    for(i =0; i < library.size();i++)
    {
        if(library.containsKey(i))
        {
            System.out.print("ID = "+i+" ");
            ((Book)library.get(i)).print();
        }
    }
}
public void search_title(String title)
{//method which search book for in title    
    int i = 0;
    boolean is = false;
    for(i = 0; i < library.size();i++)
    {
        if(library.containsKey(i))
        {
            if(((Book)library.get(i)).get_title()==title)
            {
                ((Book)library.get(i)).print();
                is = true;
            }
        }    
    }
    if(is == false)
    {
        System.out.println("There is no Book in Library!");
    }
}

public void search_author(String author)
{//method which search book by author
    int i = 0;
    boolean is = false;
    for(i = 0; i < library.size();i++)
    {
        if(library.containsKey(i))
        {
            if(((Book)library.get(i)).get_author()==author)
            {
                ((Book)library.get(i)).print();
                is = true;
            }
        }
    }
    if(is == false)
    {
        System.out.println("There is no Book!");
    }
}
public void search_year(int year)
{//method which search boook by year
    int i = 0;
    boolean is = false;
    for(i = 0; i < library.size();i++)
    {
        if(library.containsKey(i))
        {
            if(((Book)library.get(i)).get_year()==year)
            {
                ((Book)library.get(i)).print();
                is = true;
            }
        }
    }
    if(is == false)
    {
        System.out.println("There is no Book!");
    }
}
public void search_id(int id)
{//method which search book by id
    if(library.containsKey(id))
        ((Book)library.get(id)).print();
    else
        System.out.println("There is no Book!");
        
}
/*public boolean is_lend(int id)
{//method give information if book is lend
    if(library.containsKey(id))
        return((Book)library.get(id)).is_lent();
}*/
public void registration(Person  name)
{//add new person to library
    lenters.put(id_person,name);
    id_person++;
}
public void show_readers()
{//method which show all reader in library
        
        //((Book)library.get(0)).print();
    int i = 0;
    System.out.println("Numbers of lender " + lenters.size());
    for(i =0; i < lenters.size();i++)
    {
        System.out.print("ID: "+i + " | ");
        ((Person)lenters.get(i)).print();
    }
}
public void lend(int id_book,int id_person)
{//lend book by id book and id person
    if(library.containsKey(id_book))
    {
        if(!((Book)library.get(id_book)).is_lent())
        {
            System.out.println("Book is lending now!");
            ((Book)library.get(id_book)).lent((Person)lenters.get(id_person));
        }
        else
        {   
            System.out.println("Is Lend by someone!!!!");
        }
    }
    else
        System.out.println("There is not Book in Library");    
}
public void lend(int id_book,String name)
{//lend book by id book and name of book
    int id_lender = check_person(name);
    if(id_lender > -1)
    {
        lend(id_book,id_lender);
    }
    else
    {
        System.out.println("There is no Person in the system!!!!");
    }
}
public void info()
{//method give info about number of books in library
 //
 //number of books which are lend
 //number of books which are not lend
    System.out.println("Function=========INFO==============");
    System.out.println("Numbers of books: " + library.size());
    int i = 0;
    int lent = 0;
    int not_lent = 0;
    //System.out.println("List of BOOK:");
    for(i = 0;i < library.size();i++)
    {
        if(library.containsKey(i))
        {
            //System.out.print("ID = "+i+" | ");
            //((Book)library.get(i)).print();
            if(((Book)library.get(i)).is_lent())
            {
                lent +=1;
            }
            else
            {
                not_lent +=1;
            }
        }
    }
    System.out.println("Numer of not lend books: "+ not_lent);
    System.out.println("Numer of lend books: "+ lent);
    System.out.println("Function=========INFO==============");
}
//method chech if the person present in lenters
public int check_person(String names)
{
    boolean person = false;
    int i = 0;
    int index = -1;
    for(i = 0; i < lenters.size();i++)
    {

        if(lenters.containsKey(i))
        {
            Person test = (Person)lenters.get(i);
            if (((Person)test).get_names().equals(names))
            {
                person = true;
                index=i;
                break;
            }
        }
    }
    return index; 
}
public static void main(String[] args) 
{
    System.out.println("Testing Library");
    System.out.println("Point 1:");
    System.out.println("==================================================");
    System.out.println("Creating instance of Library name: public_library");
    Library public_library = new Library();
    System.out.println("==================================================");
    
    
    System.out.println();
    System.out.println("Point 5:");
    System.out.println("Adding 10 book to public_library ");
    System.out.println("================ADD===============");
    public_library.add_book("Gen",2017,"Siddharta Mukherjee");
    public_library.add_book("Thinking in Java",2003,"Bruce Eckel");
    public_library.add_book("Początek",2017,"Dan Brown");
    public_library.add_book("Potop",1960,"Henryk Sienkiewicz");
    public_library.add_book("Gangster", 2010,"John Roberts");
    public_library.add_book("Stulecie Detektywów",2010,"Jurgen Thorwald");
    public_library.add_book("Stulecie chirurgów", 2009, "Jurgen Thorwad");
    public_library.add_book("Wilk z Wall Street",2015,"Jordan Belford");
    public_library.add_book("Statystyka",2001,"Jacek Koronacki");
    public_library.add_book("Machine Learning in Python",2015,"Sebastian Rashka");
    System.out.println("==================================================");
    
    
    System.out.println();
    System.out.println("Point 10:");
    System.out.println("Adding 10 book to public_library ");
    System.out.println("==================================================");
    System.out.println("Number of Book in Public Library " + public_library.count());
    System.out.println("All Book in public Library");
    public_library.show();
    System.out.println("==================================================");
    
    System.out.println();
    System.out.println("Point 6:");
    System.out.println("==================================================");
    System.out.println("Remove 2 Books. Position 3 and 6");
    public_library.remove_book(3);
    public_library.remove_book(6);
    System.out.println("All Book in public Library");
    public_library.show();
    System.out.println("Number of Book in Public Library " + public_library.count());
    System.out.println("Try to remove again Position 3 and 6");
    public_library.remove_book(3);
    public_library.remove_book(6);
    System.out.println("==================================================");
    
    
    
    System.out.println("Registration 4 Person in Public Library");
    System.out.println();
    public_library.registration(new Person("Jan Kowalski"));
    public_library.registration(new Person("Anna Nowacka"));
    public_library.registration(new Person("Mikołaj Koczyk"));
    public_library.registration(new Person("Ewelina Twardowska"));
    
    System.out.println("List of Readers:");
    public_library.show_readers();
    System.out.println();
    
    
    System.out.println();
    System.out.println("Point 8:");
    System.out.println("==================================================");
    System.out.println("Checking Books which was published in 2010");
    public_library.search_year(2010);
    System.out.println("Checking Books which was published in 1980");
    public_library.search_year(1980);
    
    System.out.println("Checking Books on title");
    public_library.search_title("Wilk z Wall Street");
    public_library.search_title("Potop");
    
    System.out.println("Checking Books on author");
    public_library.search_author("Dan Brown");
    public_library.search_author("Henryk Sienkiewicz");
    
    System.out.println("Checking Books by id");
    public_library.search_id(2);
    public_library.search_id(3);
    System.out.println("==================================================");
    
    
    System.out.println();
    System.out.println("Point 9:");
    System.out.println("==================================================");
    System.out.println("Lend Books by two Readers");
    public_library.lend(2,"Anna Nowacka");
    public_library.lend(3,"Ewelina Twardowska");
    public_library.lend(2,"Ewelina Twardowska");
    public_library.lend(2,"Ewelina Twardowsk");
    public_library.lend(5,"Ewelina Twardowska");
    
    System.out.println("All Book in public Library");
    public_library.show();
    System.out.println("==================================================");
    System.out.println();
    
    
    System.out.println("Point :6 7");
    System.out.println("==================================================");
    System.out.println("Information and Statistic");
    public_library.info();
    
    System.out.println("Try Remove book which is lending!!!!");
    public_library.remove_book(2);
    
    System.out.println("Information and Statistic");
    public_library.info();
    
 
    }
 
}
