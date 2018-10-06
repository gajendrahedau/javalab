package com.cg.labbook.lab6prob2;
public class Person {
	String name;
	float age;
	public Person() {
		super();
	}
	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public void checkAge(float age)throws InputAgeException{
		if(age<15)
			throw new InputAgeException("Please enter age above 15 yrs");
	}
}
