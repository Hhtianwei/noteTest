package com.shsxt.yuanx;

import java.util.*;

public class CollectionTest {
	public static void main(String[] args) {
		Collection c = new HashSet();
		c.add("hello");
		c.add(new Name("f1", "11"));
		c.add(new Integer(100));
		c.remove("hello");
		c.remove(new Integer(100));
		System.out.println(c.remove(new Name("f1", "11")));
		System.out.println(c);
	}

}

class Name {
	private String firstName, lastName;

	public Name(String name, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String toString() {
		return firstName + "" + lastName;
	}

}