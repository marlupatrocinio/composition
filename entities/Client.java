package entities;

import java.util.Date;

public class Client {

	private String name;
	private String email;
	private Date dirthDate;

	public Client() {
	}

	public Client(String name, String email, Date dirthDate) {

		this.name = name;
		this.email = email;
		this.dirthDate = dirthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDirthDate() {
		return dirthDate;
	}

	public void setDirthDate(Date dirthDate) {
		this.dirthDate = dirthDate;
	}

	
}
