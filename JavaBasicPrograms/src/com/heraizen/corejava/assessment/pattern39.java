package com.heraizen.corejava.assessment;

public class pattern39 {

	public static void main(String[] args) {
		int i, j=1,num=0;
		for (i = 1; i <= 5; i++) {
			num=num+i;
			num=num*10;
			j=j*10;
		}
		num=num/10;
		j=j/10;
			for (i = 1; i <= 5; i++) {
				System.out.println(num +" ");
				num=(num%10)*j+(num/10);
			}
			
		

	}

}
//out put
//12345 
//51234 
//45123 
//34512 
//23451 