package com.heraizen.cj.exception.empoloyee.exp;

public class Employee {
	private int empno;
	private String ename;
	private float exp;

	public Employee(int empno, String ename, float exp) {
		this.empno = empno;
		this.ename = ename;
		this.exp = exp;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empno=").append(empno).append(", ename=").append(ename).append(", exp=").append(exp)
				.append("]");
		return builder.toString();
	}

}
