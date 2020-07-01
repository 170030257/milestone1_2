package Encapsulation;

public class books {
	    public static void main(String args[])
	    {
	        Book b=new Book("Computer Networks");
	        author a=new author("amy","xxx.cse@rmd.ac.in",'f');
	        b.setPrice();
	        b.setQtyInStock();
	        System.out.println("The name of the book is :"+b.getName());
	        System.out.println("The price of the book is :"+b.getPrice());
	        System.out.println("The stock is :"+b.getQtyInStock());
	        b.getauthor();
	        
	    }
	}

