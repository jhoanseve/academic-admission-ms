package com.academic.cloud.admissions.domain.enums;

/**
 * Representa los estados mas genericos de las entidades 
 * 
 * @author jhoanseve
 *
 */
public enum Status {
	ACTIVE("A"),
	INACTIVE("I");
	
	private String value;
	private Status(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
}
