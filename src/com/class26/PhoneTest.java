package com.class26;

public class PhoneTest {
	public static void main(String[] args) {
		System.out.println("----Object of Parent class");
		Phone phone = new Phone();
		phone.hasCamera();
		phone.makeCall();

		System.out.println("-----Object of iPhone class");
		iPhone iphone = new iPhone();
		iphone.hasCamera();
		iphone.makeCall();

		System.out.println("-----Object of Samsung class");
		Samsung samsung = new Samsung();
		samsung.makeCall();
		samsung.hasCamera();

		System.out.println("-----Object of Nokia class");
		Nokia nokia = new Nokia();
		nokia.makeCall();
		nokia.hasCamera();
		nokia.cannotBreak();

		System.out.println("-----Object of iPhone class referring to the Parent");
		Phone p = new iPhone();
		p.makeCall();
		p.hasCamera();

		System.out.println("-----Object of Nokia class referring to the Parent");

		Phone p1 = new Nokia();
		p1.makeCall();
		p1.hasCamera();

		// p1.cannotBreak();ce: method is undefined
		// creating a variable of a ParentType

		Phone parentPhone;
		System.out.println("-----assinging iphone object-----");
		parentPhone = new iPhone();
		parentPhone.makeCall();
		parentPhone.hasCamera();

		System.out.println("-----assinging Samsung object-----");
		parentPhone = new Samsung();
		parentPhone.makeCall();
		parentPhone.hasCamera();

		System.out.println("-----assinging Nokia object-----");
		parentPhone = new Nokia();
		parentPhone.makeCall();
		parentPhone.hasCamera();

	}
}
