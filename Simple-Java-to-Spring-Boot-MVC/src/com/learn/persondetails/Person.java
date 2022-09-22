package com.learn.persondetails;

public class Person {
	private String firstName;
	private String lastName;
	private String gender;
	private int age;

	public Person() {
	}

	public Person(String firstName, String lastName, String gender, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [firstName=").append(firstName).append(", lastName=").append(lastName)
				.append(", gender=").append(gender).append(", age=").append(age).append("]");
		return builder.toString();
	}

}
