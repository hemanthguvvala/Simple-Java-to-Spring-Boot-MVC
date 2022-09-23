package com.learn.persondetails;

public class Person {
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private int personNumber;

	public Person() {
	}

	public Person(String firstName, String lastName, String gender, int age, int personNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.personNumber = personNumber;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPersonNumber() {
		return personNumber;
	}

	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [firstName=").append(firstName).append(", lastName=").append(lastName)
				.append(", gender=").append(gender).append(", age=").append(age).append(", personNumber=")
				.append(personNumber).append("]");
		return builder.toString();
	}

}
