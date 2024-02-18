
import java.sql.*;

public class DisplayEmployee {

	
	public void  DisplayAllEmployee() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "root1234");
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select * from emp");
			System.out.println("\nEmployee  Details are : \n");
			System.out.println("Id          Name \n");
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+"     "  + rs.getString(2));
				
				
				
			}
			
			con.close();
			
		}catch(Exception e )
		{
			
		}
		
		
		
		
	}
	
	
	
}
