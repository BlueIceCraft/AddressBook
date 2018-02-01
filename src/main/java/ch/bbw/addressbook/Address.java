package ch.bbw.addressbook;

import java.util.Date;

public class Address {

	private int id;
	private String firstname;
    private String lastname;
    private String phonenumber;
    private Date registrationDate;
    private String village;

    public Address(int id, String firstname, String lastname, String phonenumber, String village) {
    	this(id, firstname, lastname, phonenumber, village , null);
    }
    public Address(int id, String firstname, String lastname, String phonenumber, String village, Date registrationDate) {
    	this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.village = village;
        this.registrationDate = registrationDate;
    }

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}

}
