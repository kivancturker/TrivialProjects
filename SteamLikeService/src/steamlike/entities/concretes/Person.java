package steamlike.entities.concretes;

import java.time.LocalDate;

import steamlike.entities.abstracts.Entity;

public class Person implements Entity {
	private int personId;
	private String firstName;
	private String lastName;
	private long ssn;
	private LocalDate birthDate;
	public Person() {
		super();
	}
	public Person(int personId, String firstName, String lastName, long ssn, LocalDate birthDate) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.birthDate = birthDate;
	}
	public Person (Person person) {
		super();
		this.personId = person.personId;
		this.firstName = person.firstName;
		this.lastName = person.lastName;
		this.ssn = person.ssn;
		this.birthDate = person.birthDate;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
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
	public long getSsn() {
		return ssn;
	}
	public void setSsn(long ssn) {
		this.ssn = ssn;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
}
