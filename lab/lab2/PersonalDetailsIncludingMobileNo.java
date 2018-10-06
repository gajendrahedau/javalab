package com.cg.lab2;
public class PersonalDetailsIncludingMobileNo {
	private String firstName,lastName;
	private char gender;
	private int age;
	private float weight;
	private long mobileNo;
	public PersonalDetailsIncludingMobileNo() {
		super();
	}
	public PersonalDetailsIncludingMobileNo(String firstName, String lastName,
			char gender, int age, float weight, long mobileNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		this.mobileNo = mobileNo;
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
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public void printDetails(){
		System.out.println("First Name:"+" "+firstName);
		System.out.println("Last Name:"+" "+lastName);
		System.out.println("Gender:"+" "+gender);
		System.out.println("Age:"+" "+age);
		System.out.println("Weight:"+" "+weight);
		System.out.println("Mobile No:"+mobileNo);
	}
}
