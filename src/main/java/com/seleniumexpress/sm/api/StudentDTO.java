package com.seleniumexpress.sm.api;

public class StudentDTO {

	private String name = "Mr x";
	private Long mobile = 1111L;
	private String country = "India";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", mobile=" + mobile + ", country=" + country + "]";
	}

}
