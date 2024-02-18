import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteEmployee {
	
	
Scanner  sc = new Scanner(System.in);
	
	
	public void  deleteemp() 
	{
		int empid, salary;
		String Empname, city;
		
		
	try {
		System.out.println("\n Delete a Employee :  \n");
		System.out.println("\n  Employee Id : " );
		empid = sc.nextInt();
		sc.nextLine();
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "root1234");
		
		Statement st = con.createStatement();
		
		
		String query  = "delete from  emp  ";
		query +=  " where  empid  = " + empid   ;
		
		System.out.println(query);
		
		
		st.executeUpdate(query );
		con.close();
		System.out.println("Employee  " + empid + "    deleted successfully");

		
	}catch(Exception ex) {
		System.out.println(ex.getMessage());
		
	}
	
	}

}
