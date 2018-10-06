package co.cg.labbook.lab6;
public class Person {
		private String firstName,lastName,phoneNo;
		private String gender;
		public Person() {
			super();
		}
		public Person(String firstName, String lastName, String gender) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
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
		public String getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
	
		public Person(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
		public void nameCheck(String firstName,String lastName)throws EmptyInputException{
			if(firstName.equals(" ")&&lastName.equals(" ")){
				throw new EmptyInputException("Please enter the name");
			}
		}
		public void PrintDetails(String firstName,String lastName,String gender){
			System.out.println("Person Details:");
			 System.out.println("---------------------");
			 System.out.println("First Name: "+firstName);
			 System.out.println("Last Name: "+lastName);
			 System.out.println("Gender : "+gender);	
			
			 
		}
		
}