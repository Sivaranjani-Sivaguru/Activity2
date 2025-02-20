package com.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.model.City;
import com.model.CityBasedService;
import com.model.Subscription;
import com.model.UserService;

@Configuration
public class Appconfig {
	
	@Bean
	public UserService getserv() {
		UserService us=new UserService();
		us.setServiceId(9001);
		us.setServiceName("Telephony service");
		us.setServiceType("caller");
		return us;		
	}
	
	@Bean
	public UserService getserv1() {
		UserService us=new UserService();
		us.setServiceId(874);
		us.setServiceName("Inter city Messaging");
		us.setServiceType("Messaging");
		return us;		
	}
	
	@Bean
	public Subscription getsubscrip() {
		List<UserService> userservlist=Arrays.asList(getserv(),getserv1());
		return new Subscription(userservlist);
		
	}
	@Bean
	public City getcity1() {
		City ct=new City();
		ct.setCityName("Bengaluru");
		ct.setState("Karnataka");
		ct.setPinCode(78001);
		return ct;
	}
	
	@Bean
	public City getcity2() {
		City ct=new City();
		ct.setCityName("Chennai");
		ct.setState("Tamilnadu");
		ct.setPinCode(600011);
		return ct;
	}
	@Bean
	public City getcity3() {
		City ct=new City();
		ct.setCityName("Hyderabad");
		ct.setState("Andhra pradesh");
		ct.setPinCode(45001);
		return ct;
	}
	
	@Bean
	public CityBasedService getcitybased() {
		List<Subscription>subscriptionList=Arrays.asList(getsubscrip());
		List<City> cityList=Arrays.asList(getcity1(),getcity2(),getcity3());
		return new CityBasedService(subscriptionList,cityList);
	}
	

}
