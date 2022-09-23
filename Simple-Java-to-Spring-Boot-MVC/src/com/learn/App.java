package com.learn;

import java.util.Scanner;

import com.learn.persondetails.Person;

public class App {
	public static void main(String[] args) {

		App app = new App();
		Person person1 = app.scanPersonDetails();
		System.out.println(person1.toString());
	}

	private Person scanPersonDetails() {
		Scanner scan = new Scanner(System.in);
		Person person = new Person();
		String firstName = null;
		String lastName = null;
		String gender = null;
		int age = 0;
		System.out.println("Enter your First Name: ");
		firstName = scan.nextLine();
		System.out.println("Enter your Last Name: ");
		lastName = scan.nextLine();
		System.out.println("Enter your gender: ");
		gender = scan.nextLine();
		System.out.println("Enter your Last Name: ");
		age = scan.nextInt();
		
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAge(age);
		person.setGender(gender);
		return person;
	}
	
}
