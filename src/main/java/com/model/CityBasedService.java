package com.model;

import java.util.List;

public class CityBasedService {
	private List<Subscription> subscription;
	private List<City> cityList;
	
	public CityBasedService() {}
	

	public CityBasedService(List<Subscription> subscription, List<City> cityList) {
		super();
		this.subscription = subscription;
		this.cityList = cityList;
	}


	public List<Subscription> getSubscription() {
		return subscription;
	}

	public void setSubscription(List<Subscription> subscription) {
		this.subscription = subscription;
	}

	public List<City> getCityList() {
		return cityList;
	}

	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}

	@Override
	public String toString() {
		return "CityBasedService [subscription=" + subscription + ", cityList=" + cityList + "]";
	}
	

}
