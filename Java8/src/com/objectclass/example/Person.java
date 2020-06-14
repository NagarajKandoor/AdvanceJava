package com.objectclass.example;

public class Person {

	private final String firstName;
	private final String lastName;
	private final String email;

	public Person(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public boolean equals(Object ob) {
		if (ob == null) {
			return false;
		}
		if (ob == this) {
			return true;
		}
		if (getClass() != ob.getClass()) {
			return false;
		}
		final Person other = (Person) ob;
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		return true;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return String.format("%s[email=%s, first name=%s, last name=%s]", getClass().getSimpleName(), email, firstName,
				lastName);
	}
}
