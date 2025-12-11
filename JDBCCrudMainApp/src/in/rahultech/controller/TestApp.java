package in.rahultech.controller;

import in.rahultech.Service.RStudentService;
import in.rahultech.Service.StudentServiceImplementation;
import in.rahultech.serviceFactory.StudentServiceFactory;

//controller layer
public class TestApp {

	public static void main(String[] args) {
		//Connection con = DriverManager.getConnection(url,username,password);
		
		RStudentService studentService = StudentServiceFactory.getStudentService();// new StudentServiceImplementation();
		
		String msg = studentService.addStudent(102,"Bob", 25, "UK");
		
		if(msg.equalsIgnoreCase("success")) {
			System.out.println("Record Inserted Successfully");
		}else {
			System.out.println("Record Insertion Failed");
		}

	}

}
