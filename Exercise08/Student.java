import java.util.Date;

import java.util.List;

public class Student extends User  {
	
	
	

	private static int idGen=10000;
	
	private StudyCourse studycourse;
	
	private List<Student> participants;
	
	
	
	private Student(){
		
		Domain domain=Domain.STUDENT;
		
		idGen++;
			
	}
	
	public Student (String firstname, String lastname) {
		
		super(String.valueOf(idGen), Domain.STUDENT, firstname, lastname);
		
		idGen++;
	}
	
	public Student(String firstname, String lastname,Date birthdate) {
		
		super(String.valueOf(idGen), Domain.STUDENT, firstname, lastname, birthdate);
		
		idGen++;
			
		
	}
	
	public Student(String firstname, String lastname,String birthdate,String domain,String id) {
		
		super(id, Domain.STUDENT, firstname, lastname);
		
		
	}
	
	
	public StudyCourse getStudyCourse() {
		
		return studycourse;
	}
	
	public String getStudyCourseDescription() {
		
		switch(this.studycourse) {
		
		case ME: 
			return "Mechanical Engineering, B.Sc.";
			
		case MSE: 
			return "Mechatronic Systems Engineering, B.Sc.";
			
		case EL: 
			return "Electrical and Electronics Engineering, B.Sc.";
			
		case IE: 
			return "Industrial Engineering, B.Sc.";
			
		case BMS: 
			return "Biomaterial Science, B.Sc.";
			
		case SCB: 
			return "Science Communication and Bionics, B.Sc.";
			
		case MME: 
			return "Mechanical Engineering, M.Sc.";
			
		case MBB: 
			return "Bionics, M.Sc.";
			
		
		}
		return "Invalid Entry";
	}
	
	
	
	public void setStudyCourse(StudyCourse studycourse) {
		
		this.studycourse=studycourse;
		
	}
	
	public void setStudyCourse(String studycourse) {
		
		this.studycourse=StudyCourse.valueOf(studycourse);
		
		
	}
	
//	@Override
//	public String toString() {
//		
//		return this.getID() + this.getFirstName(); //this.getFirstName() + this.getLastName()+this.getID()+this.getBirthDate()+this.getDomain();
//  }
	

}
