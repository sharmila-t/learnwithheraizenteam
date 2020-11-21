package com.heraizen.cj.array.crud;

public class ContactDetailsEntity {
	 public String userId;
	   public String fullName;
	   public String ph_Number;
	   public String address;
	   
	   ContactDetailsEntity(String id, String name,String number,String address){
		   userId = id;
		   fullName = name;
		   ph_Number = number;
		   this.address = address;
	   }
}
