package com.heraizen.cj.oop;

public class Employee {
	private int eid;
	private String ename;
	private double esal;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

//	void display() {
//		Employee emp2 = new Employee();
//		emp2.setEid(10001);
//		emp2.setEname("Rishitha");
//		emp2.setEsal(250000);
//		System.out.println(emp2.toString());
//	}

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEid(101);
		emp.setEname("Swetha");
		emp.setEsal(5000);
//		emp.display();
		System.out.println("Employee id= " + emp.getEid() + " " + "Employee name= " + emp.getEname() + " "
				+ "Employee sal= " + emp.getEsal());
//		System.out.println(emp.toString());
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}

}
