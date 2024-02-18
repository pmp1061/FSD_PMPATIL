import java.sql.*;

import java.util.Scanner;

public class CURDDemo {

	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int choice ;
		
		do
		{
		System.out.println("\n------------  M E N U  ------------  \n");
		System.out.println(" 1)    Display employee \n");
		System.out.println(" 2)    Insert employee \n");
		System.out.println(" 3)    Update employee \n");
		System.out.println(" 4)    Delete employee \n");
		System.out.println(" 5)    Exit Menu ");
		System.out.println("    Enter your choice  ( 1 /2 /3/ 4 / 5 ) :  ");
		System.out.println("\n----------------------------------  \n");	
		choice= sc.nextInt();
		// Display all employee records
		if(choice == 1)
		{
		DisplayEmployee  o1= new DisplayEmployee();
	
		o1.DisplayAllEmployee();
		
		}
		
		// Insert a record into database
		if(choice == 2)
		{
			InsertEmployee o2= new InsertEmployee();
	
		o2.addemp();
		
		}
		
		
		// Update Employee
		
		if(choice == 3)
		{
			UpdateEmployee o3= new UpdateEmployee ();
	
		o3.updateemp();
		
		}
		
		
		// Delete  Employee
		
		if(choice == 4)
		{
			DeleteEmployee o3= new DeleteEmployee  ();
	
		o3.deleteemp();
		
		}
		
		
		
		}while(choice != 5);
		
	}
}
