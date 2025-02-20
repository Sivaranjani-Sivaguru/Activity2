package com.model;

import org.springframework.stereotype.Component;

@Component
public class City {
	private String cityName;
	private String state;
	private int pinCode;
	public City() {}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	
	
	

}
