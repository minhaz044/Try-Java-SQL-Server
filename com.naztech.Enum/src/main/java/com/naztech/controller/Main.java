package com.naztech.controller;
import com.naztech.Dao.MobileCompanyEnum ;
import com.naztech.Dao.MoblieCompany;



public class Main {
	public static void main(String[] args) {
		System.out.println(MoblieCompany.apple);
		System.out.println(MobileCompanyEnum.Apple);
		MobileCompanyEnum m=MobileCompanyEnum.Apple;
		switch(m) {
		case Apple:
			System.out.println("This is Apple");
		case Sumsung:
			System.out.println("This is Sumsung");
		case HTC:
			System.out.println("This is HTC");
		
		}
		System.out.println(MobileCompanyEnum.Sumsung.show());
		System.out.println(MobileCompanyEnum.Sumsung.ordinal());
		System.out.println(MobileCompanyEnum.Sumsung.values());
		System.out.println(MobileCompanyEnum.Apple.someThing());
		
		
	}
}
