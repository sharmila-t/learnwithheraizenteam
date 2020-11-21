package com.heraizen.cj.exception.dbconnection;

public class DbConnectionMain {
	public static void main(String[] args) {
		DbConnection db;
		for(int i=0; i < 2; i++) {
			db = DbConnection.getObject();

			if(DbConnection.count > 0) {
				throw new IllegalArgumentException("Creation of objects Exceeds limit");
			}else {
				System.out.println("Object is created "+(i+1)+" time .");
				
			}
		}
	}
	
	
	
	
}
