package in.rahultech.persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import in.rahultech.dto.Student;

public class StudentDaoImplementation implements RStudentDao {
	private static final String DBURL = "jdbc:mysql://localhost:3306/MainCrudApp";
	private static final String DBUSERNAME = "demo_user";
	private static final String DBPASS = "demo_pass";
	
	@Override
	public String addStudent(Integer sId,String sName, Integer sAge, String sAddress) {
		final String QUERY = "Insert into Student1(sId,sName,sAge,sAddress) Values(?,?,?,?);";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			Connection con = DriverManager.getConnection(DBURL,DBUSERNAME,DBPASS);
			PreparedStatement pstmt = con.prepareStatement(QUERY);
			pstmt.setInt(1, sId);
			pstmt.setString(2, sName);
			pstmt.setInt(3, sAge);
			pstmt.setString(4, sAddress);
			int rowsAffected = pstmt.executeUpdate();
			if(rowsAffected>0) return "success";
		} catch (Exception e) {
			System.out.println(e);
		}
		return "fail";
	}

	@Override
	public Student searchStudent(Integer sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStudent(Integer sid, String sname, Integer sage, String saddress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(Integer sid) {
		// TODO Auto-generated method stub
		return null;
	}

}
