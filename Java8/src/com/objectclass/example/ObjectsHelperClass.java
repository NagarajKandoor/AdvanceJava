package com.objectclass.example;

import java.util.Objects;

public class ObjectsHelperClass implements Cloneable {
	private final String firstName;
	private final String lastName;
	private final String email;

	public ObjectsHelperClass(String firstName, String lastName, String email) {
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
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final ObjectsHelperClass other = (ObjectsHelperClass) obj;
		if (!Objects.equals(email, other.email)) {
			return false;
		} else if (!Objects.equals(firstName, other.firstName)) {
			return false;
		} else if (!Objects.equals(lastName, other.lastName)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, firstName, lastName);
	}

	@Override
	public String toString() {
		return String.format("%s[email=%s, first name=%s, last name=%s]", getClass().getSimpleName(), email, firstName,
				lastName);
	}

	@Override
	public Person clone() throws CloneNotSupportedException {
		return (Person) super.clone();
	}

}
