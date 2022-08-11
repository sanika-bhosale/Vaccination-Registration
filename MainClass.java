package i2.client;

import java.util.Scanner;

import i2.logic.Venue1;
import i2.logic.Venue2;

public class MainClass {

	public static void main(String[] args) {
		
Venue1 v1=new Venue1();
Venue2 v2=new Venue2();
int flag;
do {
	flag=0;
	System.out.println("***************** Welcome to 'Vaccination-Venture' Registration App ****************");
	System.out.println();
	System.out.println("The following vaccine slots have been scheduled this week within the time slot 10:00 am to 4:00 pm.....");
	System.out.println("This Are The Vaccination Centre Near By You  According To Your Live Location...");
	System.out.println("-----------------------------------------------------------------------------------");
	//table km typeOfVaccine
	System.out.println("1.Karve Nagar");
	System.out.println("2.DGP Nagar");
	System.out.println("3.Exit");
	System.out.print("Enter Your Choice:");
	int choice;
	Scanner input=new Scanner(System.in);
	if(input.hasNextInt()) {
		choice=input.nextInt();
		switch(choice) {
		case 1:
			v1.VaccinationAtVenue1();
			break;
		case 2:
			v2.VaccinationAtVenue1();
			break;
		case 3:
			flag=1;
			break;
			
			default:
				
		}
	}
	else {
		System.out.println("Please Enter Choice In Integer!!");
		flag=1;
	}
	
}while(flag==0);

	}

}
