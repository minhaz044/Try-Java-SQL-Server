package com.naztech.Controller;

import com.naztech.Dao.Gun;
import com.naztech.Dao.MachineGun;
import com.naztech.Services.KillerGun;
import com.naztech.Services.KillerMachineGun;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gun AK47=KillerGun::kill;
		System.out.println(AK47.Trigger());
		Gun M16=new KillerGun()::killAll;
		System.out.println(M16.Trigger());
		MachineGun MS =KillerMachineGun::new;
		KillerMachineGun M134=MS.getKillerMachineGun(5000);
		System.out.println(M134.getNumberOfBullet());
		
	}

}
