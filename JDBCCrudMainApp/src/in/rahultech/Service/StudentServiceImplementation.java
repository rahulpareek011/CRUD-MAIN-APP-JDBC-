package in.rahultech.Service;

import in.rahultech.daofactory.StudentDaoFactory;
import in.rahultech.dto.Student;
import in.rahultech.persistence.RStudentDao;
import in.rahultech.persistence.StudentDaoImplementation;

public class StudentServiceImplementation implements RStudentService {

	RStudentDao daoService;
	public String addStudent(Integer sId,String sName, Integer sAge, String sAddress) {
		daoService = StudentDaoFactory.getStudentDao();//new StudentDaoImplementation();
		String msg = daoService.addStudent(sId,sName, sAge, sAddress);
		return msg;
	}

	@Override
	public Student searchStudent(Integer sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStudent(Integer sid, String sname, Integer sage, String saddress) {
		daoService = StudentDaoFactory.getStudentDao();
		String msg = daoService.updateStudent(sid, sname, sage, saddress);
		return msg;
	}

	@Override
	public String deleteStudent(Integer sid) {
		daoService = StudentDaoFactory.getStudentDao();
		String msg = daoService.deleteStudent(sid);
		return msg;
	}
	
}
