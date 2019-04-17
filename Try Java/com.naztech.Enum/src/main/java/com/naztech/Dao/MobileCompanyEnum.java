package com.naztech.Dao;

public enum MobileCompanyEnum implements MoblieCompany {
	Apple(8),Sumsung(6),HTC(4);
	int variable ;
	  MobileCompanyEnum(int variable) {
		this.variable=variable;
	}
	 MobileCompanyEnum() {
		this.variable=-1;
	}	
	public int show() {
		return variable;
	}
	public String someThing() {
		 return "Hello I am A Enum";
	 }
}
