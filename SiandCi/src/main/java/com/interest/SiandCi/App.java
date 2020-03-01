package com.interest.SiandCi;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class App
{
	private static PrintStream myprint;
	private static Scanner sc;
	public static void getSIAndCI() {
		myprint =  new PrintStream(new FileOutputStream(FileDescriptor.out));
		myprint.print("Enter principal amount : ");
		double p=sc.nextDouble();
		myprint.print("Enter time period : ");
		double t= sc.nextDouble();
		myprint.print("Enter rate of interest ");
		double r=sc.nextDouble();
		Interest i=new Interest(p,t,r);
		myprint.print("\noption 1 to calculate Simple Interest\nOption 2 to calculate the Compound Interest\nEnter option : ");
		int  o=sc.nextInt();
		if(o==1) {
			myprint.print("Simple Interest : "+i.getSimpleInterest());
		}
		else {
			myprint.print("Compound Interest : "+i.getCompoundInterest());
		}
	}
	public static void getCostOfBuliding() {
		myprint =  new PrintStream(new FileOutputStream(FileDescriptor.out));
		myprint.print("Option 1 to use standard materials\nOption 2 to use above standard materials\nOption 3 to high standard material\nOption 4 to high standard material and fully automated home\nEnter the type materials requried for constucting  buliding : ");
		int op=sc.nextInt();
		myprint.print("Enter the area of the land to estimate the cost of buliding in square feets ");
		double area=sc.nextDouble();
		Building b=new Building(area,op);
		myprint.print("Cost for construction of buliding with given sqaure feets : "+b.getCostOfBuilding());
	}
    public static void main( String[] args )
    {
	    myprint =  new PrintStream(new FileOutputStream(FileDescriptor.out));
    	sc =new Scanner(System.in);
        while(true) {
        	myprint.print("\noption 1 to claculate Simple Interest and Compound Interest\noption 2 calculate  cost for constructing a buliding\noption 3 to exit\n");
        	myprint.print("Enter your option ");
        	int opt = sc.nextInt();
        	switch(opt) {
        	case 1:
        		getSIAndCI();
        		break;
        	case 2:
        		getCostOfBuliding();
        		break;
        	case 3:
        		sc.close();
        		return;
        	default:
        		error();
        	}
        }
        
    }
	private static void error() {
		myprint.print("Enter valid option");
			myprint.close();
	}
}




