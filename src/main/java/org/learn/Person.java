package org.learn;

public class Person {

	Sportist mySport;
	
	public void setMySport(Sportist mySport) {
		this.mySport = mySport;
	}

	public String doSport() {
		return mySport.playSport();
	}
}
