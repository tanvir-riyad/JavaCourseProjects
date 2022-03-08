import java.util.Date;
import java.util.GregorianCalendar;

public class Student {
    private int id;
	
	private static int idGen=10000;
	
	private String lastname;
	
	private String firstname;
	
	private Date birthdate;
	
	private Course studycourse;
	
	
	private Student(){
		
		
		
	}
	
	public Student (String firstname, String lastname) {
		
		this.firstname = firstname;
		
		this.lastname = lastname;
		
		this.id=idGen++;
	}
	
	public Student (String firstname,String lastname,Date birthdate) {
		
		this.firstname = firstname;
		
		this.lastname = lastname; 
		
		this.birthdate =birthdate;
		
		this.id=idGen++;
	}
	
	public String getFirstName() {
		
		return firstname;
		
	}
	
	
	public void setFirstName(String firstname) {
		
		this.firstname= firstname;
		
	}
	
	public String getLastName() {
		
		return lastname;
		
	}
	
	public void setLastName(String lastname) {
		
		this.lastname=lastname;
	}
	
	public int getID() {
		
		return id;
	}
	
	public Date getBirthDate() {
		
		return birthdate;
	}
	
	public void setBirthDate(Date birthdate) {
		
		this.birthdate=birthdate;
		
	}
	
	public Course getStudyCourse() {
		
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
	
	
	
	public void setStudyCourse(Course studycourse) {
		
		this.studycourse=studycourse;
		
	}
	
	public void setStudyCourse(String studycourse) {
		
		this.studycourse=Course.valueOf(studycourse);
		
		
	}
	
	public static void main (String [] args) {
		
		 GregorianCalendar date = new GregorianCalendar(1990, 01, 01);
		
		 Student student1 = new Student("A", "B");
	     student1.setStudyCourse(Course.ME);
	     System.out.println(student1.getStudyCourse());
	     
	     Student student2 = new Student("C", "D");
	     System.out.println(student2.getID());
	     
	     student2.setStudyCourse("EL");
	     System.out.println(student2.getStudyCourse());
	     
	     Student student3 = new Student("E", "F",date.getTime());
	     Student student4 = new Student("G", "H",date.getTime());
	     
	     student4.setStudyCourse("MME");
	     
	     System.out.println(student3.getBirthDate());
	     
	     System.out.println(student4.getID());
	     
	     System.out.println(student4.getStudyCourseDescription());

}
}
