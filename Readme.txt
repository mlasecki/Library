Version 1.00
Project Library was made by Mariusz Lasecki:
Tool: Net Beans ver. 8.2  


There are 3 file type of java:
Book.java
Person.java
Library.java

There is 1 file jar

Library.jar:

Was created package library.
Package library contains three classes Book Person Library

File Book.java contains definition of class Book
File Person.java contains definition of class Person
File Library.java contains definition of class Library



In file Library.java is run determination test of application Library.

In file Library.jar is run determination test of application Library:
//////////////////////////////////////////////////////////////////////////////////////////////////

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
    public_library.add_book("Pocz¹tek",2017,"Dan Brown");
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
    public_library.registration(new Person("Miko³aj Koczyk"));
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

////////////////////////////////////////////////////////////////////////////////////////////////////

