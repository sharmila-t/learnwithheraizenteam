package com.heraizen.cj.array.crud;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class contactBookApplication {
	private String name;
    private int id1=getNewId();
    private String mobileNumber;
    private String email;
	public contactBookApplication(String name, String mobileNumber, String email) {
		this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
	}
	public String toString() {
        return "Contact: name = " + name + ";  MobileNumber = " + mobileNumber
                + "; Email = " + email;
    }
	
	static void start()
	{

		List<contactBookApplication> listOfContact = new ArrayList<contactBookApplication>();
		listOfContact.add(new contactBookApplication("Sharmila", "9010794336", "sharmila@gmail.com"));
		listOfContact.add(new contactBookApplication("Rishitha", "9442498826", "rishi@gmail.com"));
		listOfContact.add(new contactBookApplication("Swetha", "8144867060", "swetha@gmail.com"));
		listOfContact.add(new contactBookApplication("Manish", "9574452776", "manish@gmail.com"));
		listOfContact.add(new contactBookApplication("Sabarish", "875478668", "sabarish@gmail.com"));
		

		Scanner scan=new Scanner(System.in);
		
		do {
		System.out.println();
		System.out.println("\t\t\t\tContact Book Application\t");
		System.out.println();
		System.out.println("1.ADD\t2.VIEW ALL\t3.EDIT\t4.DELETE\t5.SEARCH\t6.SORT\t7.EXIT");
		int choice=scan.nextInt();
	
		switch(choice)
		{
		case 1:
			addContact(listOfContact);
			break;
		
	    case 2:
			viewContact(listOfContact);

	    	break;
	
		case 3:
			editContact(listOfContact);
			break;
			
		case 4:
			deleteContact(listOfContact);
			break;
			
		case 5:
			searchContact(listOfContact);
			break;
			
		case 6:
			sortContact(listOfContact);
			break;
			
		case 7:
			System.out.println("Application closed");
			System.exit(0);
			
			
		}

		} while (true);
		
		
	}
	private static int id = 1001;
	  
	  public static int getNewId()
	  {
	    return id++;
	  }
	static void addContact(List<contactBookApplication> listOfContact)
	{

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the name :");
		String name = scan.next();
		
	
		
		System.out.println("Enter the email :");
		String email = scan.next();


		System.out.println("Enter the mobile number :");
		String mobileNumber = scan.next();


		System.out.println("contact is added successfully");

		listOfContact.add(new contactBookApplication(name,mobileNumber,email));
		

	}
	static void viewContact(List<contactBookApplication> listOfContact )
	{
		
		for (contactBookApplication contact : listOfContact)
			System.out.format("\n%-10d%-15s%-15s%-20s\n", contact.id1, contact.name,
				contact.mobileNumber, contact.email);

		
	}
	static void editContact(List<contactBookApplication> listOfContact)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the contact id to edit :");
		int contactId=scan.nextInt();
		System.out.println("Please enter option which you want to edit: 1.Mobile Number 2.email");
		int ch=scan.nextInt();
		if(ch==1)
		{
			System.out.println("Enter Mobile Number");
			String mobileNumber=scan.next();
			ListIterator<contactBookApplication> iterator = listOfContact.listIterator();
			String name = null;
			String email= null;
			for (contactBookApplication contact : listOfContact)
			{
				if(contact.id1==contactId)
				{
					 name=contact.name;
					 email=contact.email;
				}
			}
			while (iterator.hasNext()) {
				contactBookApplication contact = iterator.next();
				if (contact.getId() == contactId) {

					iterator.set(new contactBookApplication(name, mobileNumber, email));
					break;
				}
			 }
		}
		if(ch==2)
		{
			System.out.println("Enter email ");
			String email=scan.next();
			ListIterator<contactBookApplication> iterator = listOfContact.listIterator();
			String name = null;
			String mobileNumber= null;
			for (contactBookApplication contact : listOfContact)
			{
				if(contact.id1==contactId)
				{
					 name=contact.name;
					 mobileNumber=contact.mobileNumber;
				}
			}
			while (iterator.hasNext()) {
				contactBookApplication contact = iterator.next();
				if (contact.getId() == contactId) {
//					iterator.set(contact);
					iterator.set(new contactBookApplication(name, mobileNumber, email));
					break;
				}
			 }
		}
	}
	static void deleteContact(List<contactBookApplication> listOfContact)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the contact id to delete :");

		int contactId=scan.nextInt();


		
		ListIterator<contactBookApplication> iterator = listOfContact.listIterator();
		while (iterator.hasNext()) {
			contactBookApplication contact = iterator.next();
			if (contact.getId() == contactId) {
				iterator.remove();
				break;
			}
		}
			
			
		System.out.println("Contact Id:"+contactId+" is deleted successfuly ");
	
		
	}
	
	static void searchContact(List<contactBookApplication> listOfContact)
	{
		System.out.println("Enter Search by name,mobile number and email");
		Scanner scan=new Scanner(System.in);
		String name=scan.next();

		listOfContact.stream().filter(val -> val.getName().contains(name) || val.getMobileNumber().contains(name) || val.getEmail().contains(name)).forEach(System.out::println);
		
		
	}
	static void sortContact(List<contactBookApplication> listOfContact)
	{
		System.out.println("Enter Sort choice 1.name 2.email 3.Mobile Number");
		Scanner scan=new Scanner(System.in);
		int ch=scan.nextInt();
		if (ch == 1) {
			listOfContact = sort((e1, e2) -> e1.getName().compareTo(e2.getName()), listOfContact);
		} else if (ch == 2) {
			listOfContact = sort((e1, e2) -> e1.getEmail().compareTo(e2.getEmail()), listOfContact);
		}
		else if (ch == 3) {
			listOfContact = sort((e1, e2) -> e1.getMobileNumber().compareTo(e2.getMobileNumber()), listOfContact);
		}
		System.out.println("Sorting done successfully");
	}
	 public int getId()
	  {
	    return this.id1;
	  }
	 public String getName()
	  {
	    return this.name;
	  }
	 public String getMobileNumber()
	  {
	    return this.mobileNumber;
	  }
	 public String getEmail()
	  {
	    return this.email;
	  }
	 public static List<contactBookApplication> sort(Comparator<contactBookApplication> comparator, List<contactBookApplication> listOfContact) {
			Collections.sort(listOfContact, comparator);
			return listOfContact;
		}
	public static void main(String[ ] arg)
	   {
		
		start();
	   }
}


