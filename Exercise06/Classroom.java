import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

public class Classroom{
	
	private String id;

	private Course course;

	//private Student [] participants;
	
	private List<Student> participants=new ArrayList<Student>();;

	private String room;

	private String term;
	
	private Calendar date;

	

	private Classroom(){
		
		 
		
		

}

	public Classroom(Course course,String room){
		
		date =new GregorianCalendar();
		
		this.course=course;

		this.room=room;

}

	public Classroom(Course course,String room,GregorianCalendar date){
		
		this.date=date;

		this.course=course;

		this.room=room;
	
		

}
	public Course getCourse(){

		return course;

}

	public String getRoom(){

		return room;

}

	public String getTerm(){
		
		
		
		Calendar firstdate = new GregorianCalendar(2020, 2, 1);
		
		Calendar seconddate = new GregorianCalendar(2020, 8, 30);
		
		int lastTwoDigits = Calendar.getInstance().get(Calendar.YEAR) % 100+1;
		
		int month= date.get(Calendar.MONTH);
		
		int month1=firstdate.get(Calendar.MONTH);
		
		int month2=seconddate.get(Calendar.MONTH);
		
		
		
		
		
		if(month<month1 || month>month2) {
			
			return "WS"+date.get(Calendar.YEAR)+"/"+lastTwoDigits;
		}else {
			
			return "SS"+date.get(Calendar.YEAR);
		}

}

	public String getID(){

		return course.getID()+"-"+this.getTerm();

}

	public void setRoom(String room){

		this.room=room;

}

	public void addStudent(Student student){
		
		
		  
		 participants.add(student);
		  
		 participants=participants.stream().distinct().collect(Collectors.toList());
		  
		  
		
		

}
	

	

		public String getParticipantsEmail(){
			
			ArrayList<String> str = new ArrayList<String>();
		    for (int i = 0; i < participants.size(); i++) {
		        str.add(participants.get(i).toString());
		        
		    }
		    
		    for(int i=0;i<str.size();i++) {
		    	
		    
		    	str.set(i, str.get(i)+"@student.hsrw");
		    	
		    }
		    
		    String a=str.toString();
		    
		    a = a.replace("[", "")
		            .replace("]", "")
		            .replace(" ", "");
		    
		   
		  
		  return a;
		}



	public int getTotalParticipants(){

		return participants.size();



}
	public boolean isParticipating (Student student) {
		
		if(participants.contains(student)) {
			
			return true;
		}else {
			return false;
		}
	}
	
	public void removeStudent(Student student) {
		
		participants.remove(student);
		
		
	}
	
	public void removeAllParticipants() {
		
		participants.clear();
		
		
	}

}
