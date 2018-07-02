package com.siddhartha.model;

//@Data
public class LoginModel {
	private Long Id;
	private String Name;
	private String Mobile_No;

	public LoginModel() {

	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public LoginModel(Long id, String name, String mobile_No) {
		super();
		Id = id;
		Name = name;
		Mobile_No = mobile_No;
	}

	@Override
	public String toString() {
		return "LoginModel [Id=" + Id + ", Name=" + Name + ", Mobile_No=" + Mobile_No + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((Mobile_No == null) ? 0 : Mobile_No.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginModel other = (LoginModel) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (Mobile_No == null) {
			if (other.Mobile_No != null)
				return false;
		} else if (!Mobile_No.equals(other.Mobile_No))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		return true;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMobile_No() {
		return Mobile_No;
	}

	public void setMobile_No(String mobile_No) {
		Mobile_No = mobile_No;
	}

}
