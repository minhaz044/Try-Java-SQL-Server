package com.naztech.Services;

public class KillerGun {
	String Killer ;
	public KillerGun(){
	}
	public KillerGun(String k){
		this.Killer=k;
	}
	
	public String getKiller() {
		return Killer;
	}
	public static String kill() {
		return "You are Dead Man For Sure";
	}
	public String killAll() {
		return "You All are Dead Man For Sure";
	}
}
