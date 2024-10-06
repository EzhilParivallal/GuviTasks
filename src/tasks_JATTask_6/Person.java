package tasks_JATTask_6;

import java.util.Scanner;

public class Person {
	
	private int age;
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public void getName() {
	   System.out.println("Name : "+name);	
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void getAge()
	{
		System.out.println("Age : "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        	
        	Person obj = new Person();
        	obj.setName("Ezhil");
        	obj.setAge(31);
        	obj.getName();
        	obj.getAge();
        	

	}

}
