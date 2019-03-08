package ch14examples;

import java.util.LinkedList;
import java.util.Collection;
import java.util.Iterator;    

public class Contact {
	public String name;
	public String number;
	
	// Contact Constructor
	Contact( String n, String num ) {
		name = n;
		number = num;
	}

	public static void main(String[] args) {
		// old array code commented out or deleted

		// create LinkedList 
		LinkedList<Contact> contactList = new LinkedList<Contact>();

		// add 5 Contacts to list 
		contactList.add(new Contact( "George Washington", "(800) 555-1234" )); 
		contactList.add(new Contact( "John Adams", "(800) 555-4567" ));
		contactList.add(new Contact( "Thomas Jefferson", "(800) 555-7890" ));
		contactList.add(new Contact( "James Madison", "(800) 555-3456" ));
		contactList.add(new Contact( "James Monroe", "(800) 555-2345" ));


		// get first and last Contact from list
//		Contact first = (Contact)contactList.getFirst();
//		Contact last = (Contact)contactList.getLast();
		
		search(contactList,"George Washington");
		search(contactList,"James Monroe");
		search(contactList,"Andrew Jackson");

		// print out contact info
//		System.out.println(first.name + ": " + first.number );
//		System.out.println(last.name + ": " + last.number );
//		System.out.println(contactList);

	}
	
	private static void search(Collection<Contact> contacts, String targetName) {
	   for (Iterator<Contact> myIterator = contacts.iterator(); myIterator.hasNext(); ) {
	      // get the next element 
	      Contact c = (Contact) myIterator.next();
	      if (c.name.equalsIgnoreCase(targetName)) {
	         // print out name and number
	         System.out.println( c.name + ": " + c.number );   

	         // all done searching, exit loop early
	         return; 
	      }
	   } 
	   System.out.println( targetName + ": NOT FOUND");
	} 

}
