package garage;


public abstract class Person {
	private String name;
	private String firstname;
	private String natnum;
	private int birthyear;
	private String mail;
	private String password;
	
//    public abstract String getRef();
//    public abstract void setRef(String ref);
//    public abstract float getComm();
//    public abstract void setComm(float comm);
	
	public Person() {
		this.name = "";
		this.firstname = "";
		this.natnum = "";
		this.birthyear = 1990;
		this.mail = "";
		this.password = "";
	}
	
	public Person(String name, String firstname, String natnum, int birthyear, String mail, String password) {
		this.name = name;
		this.firstname = firstname;
		this.natnum = natnum;
		this.birthyear = birthyear;
		this.mail = mail;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getNatnum() {
		return natnum;
	}

	public int getBirthyear() {
		return birthyear;
	}

	public String getMail() {
		return mail;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setNatnum(String natnum) {
		this.natnum = natnum;
	}

	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return name + " " + firstname;
	}
	
	
	
}
