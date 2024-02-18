import java.sql.*;
import java.util.*;

public class UpdateEmployee {
	
	

	Scanner  sc = new Scanner(System.in);
	
	
	public void  updateemp() 
	{
		int empid, salary;
		String Empname, city;
		
		
	try {
		System.out.println("\n Enter the following details : \n");
		System.out.println("\n  Employee Id : " );
		empid = sc.nextInt();
		sc.nextLine();
		System.out.print("\n  Employee  Name : " );
		Empname = sc.nextLine();
		
		System.out.print("\n  Employee City : " );
		
		city= sc.nextLine();
		
		System.out.print("\n  Employee  Salary : " );
		salary= sc.nextInt();
		
		
		System.out.print("Insert employee " + empid + Empname +city+salary);
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "root1234");
		
		Statement st = con.createStatement();
		// String query  = "insert into emp values (90, 'Emp90' , 'city90', 90 )";
		
		String query  = "update emp set  empid = ";
		query += empid  + " ,  ename  = "  +   Empname + " , city  = "  +  city  + " , salary = "  +  salary + " where  empid  = " + empid   ;
		
		System.out.println(query);
		
		
		st.executeUpdate(query );
		con.close();
		System.out.println("Record inserted successfully");

		
	}catch(Exception ex) {
		System.out.println(ex.getMessage());
		
	}
	
	

		
	}
	
	
	
	

}
