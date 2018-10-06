package com.cg.lab2;
public class PersonalDetailsInNewClass {
	private String firstName,lastName;
	private char gender;
	private int age;
	private float weight;
	public PersonalDetailsInNewClass() {
		super();
	}
	public PersonalDetailsInNewClass(String firstName, String lastName,
			char gender, int age, float weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "PersonalDetailsInNewClass [firstName=" + firstName
				+ ", lastName=" + lastName + ", gender=" + gender + ", age="
				+ age + ", weight=" + weight + "]";
	}
}
