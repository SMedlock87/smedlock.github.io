/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;

/**
 *
 * @author me
 */
//Create class
public class Pet {
	public String petType;
	public String petName;
	public int petAge;
	public int dogSpace;
	public int daysStay;
	public double amountDue;

//Assign Type, Name, Age, Space, Stay, and Amount due
public Pet() {
	petType = "dog";
	petName = "No name";
	petAge = 0;
	dogSpace = 0;
	daysStay = 0;
	amountDue = 0.00;
}

//Check in pet
public static void checkIn (String petType,String petName, int petAge, int dogSpace, int daysStay, int amountDue) {
	
}
public static void createPet ( ) {
    //Create pet
}
public static void updatePet() { //Update information
}
public static void amountPaid () { //check to see if pet has been paid
}
public static void yardTime() {
}
public void setSpace(int dogSpace) {    //Set dogSpace for space available
	
}
public void setdogWeight(int dogPounds) { //Set weight
	
}
public void setGrooming(int dogGroom) { //Set if animal needs grooming
	
}
public int getSpace() {  //Assign space available
	int dogSpaceNbr = 0;
	return dogSpaceNbr;
}
public void moveSpace() {
}

public int getdogWeight() {  //Assign dogWeight
	int dogWeight = 0;
	return dogWeight;
}
public int getGrooming() {   // Get data to see if grooming is needed
	int dogGrooming = 0;
	return dogGrooming;
}
public void spaceCleaning() { //See if space needs to be cleaned or is ready
}
}

