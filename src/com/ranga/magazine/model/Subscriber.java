package com.ranga.magazine.model;

import java.util.List;

/**
 * Created by pranga on 8/26/14.
 */
public class Subscriber implements Comparable<Subscriber>{

	private Long id;
	private String firstName;
	private String lastName;
	private List<Magazine> magazineList;

	public Subscriber(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<Magazine> getMagazineList() {
		return magazineList;
	}

	public void setMagazineList(List<Magazine> magazineList) {
		this.magazineList = magazineList;
	}

	@Override
	public int compareTo(Subscriber otherSubscriber) {
		if(this.lastName.equalsIgnoreCase(otherSubscriber.lastName)){
			return this.firstName.compareTo(otherSubscriber.firstName);
		}
		return this.lastName.compareTo(otherSubscriber.lastName);
	}
}

