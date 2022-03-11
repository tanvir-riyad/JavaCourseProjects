import java.util.Date;

public class Professor extends User {
	
  private Faculty faculty=Faculty.TUB;
	
	private Campus campus=Campus.KLE;
	
	private int phone=0;
	
	private Professor() {
		
		Domain domain=Domain.STAFF;
				
	}
		
	
	
	public Professor(String id,String firstname,String lastname) {
		
		super(id,Domain.STAFF,firstname,lastname);
		
		
		
		
		
	}
	
	public Professor(String id,String firstname,String lastname,Date birthdate) {
		
		super(id,Domain.STAFF,firstname,lastname,birthdate);
		
		
	}
	
	public void setFaculty(Faculty faculty) {
		
		this.faculty=faculty;
		
		switch(faculty) {
		
		case TUB:
			
			this.campus=Campus.KLE;
			break;
		case LS:
			
			this.campus=Campus.KLE;
			break;
			
		case GO:
			
			this.campus=Campus.KLE;
			break;
			
		default: 
			
			this.campus=Campus.KL;
		}
		
		
	}
	
	public Faculty getFaculty() {
		
		return faculty;
		
	}
	
	public String getFacultyString() {
		
		switch(this.faculty) {
		
		case TUB:
			
			return "Technology and Bionics";
			
		case LS:
			
			return "Life Sciences";
			
		case GO:
			  
			return "Society and Economics";
			
		case KU:
			
			return "Communication and Environment";
		}
		
		return "invalid entry";
	}
	
	public void setPhone(int phone) {
		
		this.phone=phone;
		
	}
	
	public String getPhone() {
		
		switch(this.campus) {
		
		case KLE:
			
			return "+49 2821 806 73 " + this.phone;
			
		case KL:
			
			return "+49 2842 908 " + this.phone;
		}
		
		
		return "invalid entry";
	}
		
}
