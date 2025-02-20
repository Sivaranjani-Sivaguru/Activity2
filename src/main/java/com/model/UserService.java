package com.model;

import org.springframework.stereotype.Component;

@Component
public class UserService {
	private int serviceId;
	private String serviceName;
	private String serviceType;
	
	public UserService() {}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	@Override
	public String toString() {
		return "UserService [serviceId=" + serviceId + ", serviceName=" + serviceName + ", serviceType=" + serviceType
				+ "]";
	}
	
	

}
