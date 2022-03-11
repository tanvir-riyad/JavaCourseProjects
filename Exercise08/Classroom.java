import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

public class Classroom {
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	private String id;

	private Course course;

	//private Student [] participants;
	
	private List<Student> participants=new ArrayList<Student>();

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
		
		int lastTwoDigits = Calendar.getInstance().get(Calendar.YEAR) % 100;
		
		int month= date.get(Calendar.MONTH);
		
		int month1=firstdate.get(Calendar.MONTH);
		
		int month2=seconddate.get(Calendar.MONTH);
		
		
		
		
		
		if(month<month1 || month>month2) {
			
			return "WS"+(date.get(Calendar.YEAR)-1)+"/"+lastTwoDigits;
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
//		    for (int i = 0; i < participants.size(); i++) {
//		        str.add(participants.getID()(i).toString());
//		        
//		    }
			for(Student s : participants) {
				
				str.add(s.getID().toString());
			}
		    
		    for(int i=0;i<str.size();i++) {
		    	
		    
		    	str.set(i, str.get(i)+"@student.hsrw");
		    	
		    }
		    
		    String a=str.toString();
		    
		    a = a.replace("[", "")
		            .replace("]", "")
		            .replace(" ", "");
		    
		   
		  System.out.println(a);
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
	

	
//	public void save(String file) {
//		
//		String json = new Gson().toJson(participants);
//		
//		try {
//			PrintWriter out1 = new PrintWriter(new FileWriter(file));
//		    out1.write(json);
//		    out1.close();
//		} catch (Exception ex) {
//		    System.out.println("error: " + ex.toString());
//		}
//	}
//	
//	public void load(String file) throws IOException, ParseException, java.text.ParseException {
//		
//	
//		
//		participants.clear();
//		 JSONParser parser = new JSONParser();
//		
//		JSONArray a = (JSONArray) parser.parse(new FileReader(file));
//
//		  for (Object o : a)
//		  {
//		    JSONObject student = (JSONObject) o;
//
//		    String id = (String) student.get("id");
//		   
//
//		    String firstname = (String) student.get("firstname");
//		    
//
//		    String lastname = (String) student.get("lastname");
//		   
//		    
//		    String birthdate = (String) student.get("birthdate");
		    
//		    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy, HH:mm:ss a");
//		     
//		    simpleDateFormat.applyPattern("MMM dd, yyyy, HH:mm:ss a");
//		    Date date = simpleDateFormat.parse(birthdate);
//		    System.out.println(birthdate);
//		    
		    
		   
		    
//		    DateFormat df = new SimpleDateFormat("MMM dd, yyyy, HH:mm:ss aaa",Locale.US);
//		    Date date = df.parse(birthdate);
	    
		   
		    
		    
//		    String domain = (String) student.get("domain");
//		   
//		    
//		    Student student1 = new Student(firstname,lastname,birthdate,domain,id);
//		    
//		    participants.add(student1);
//
//
//		    
//
//		    
//		  }
		  
		  
		
//	}
	
	public Student getStudent(String str) {
		
		Student std = null;
		
		for(Student p :participants ) {
			
			if (p.getID().equals(str)) {
				
				 std=p;
					
			}
			
		}
		
		
		
		return std;
		
		
	}
	
	public Student [] getStudentbyName(String a,String b) {
		
		
		
		ArrayList<Student> arrList=new ArrayList<Student>();
		
		for (Student p : participants) {
			
			if (p.getFirstName().equals(a) && p.getLastName().equals(b)) {
				
				arrList.add(p);
				
				break;
				
				
				
			}
			
			else if(p.getFirstName().equals(a) && b.equals("*")) {
				
				arrList.add(p);
				
			}else if( a.equals("*") && p.getLastName().equals(b)) {
				
				arrList.add(p);
			}else if(a.equals("*") && b.equals("*")) {
				
				arrList.add(p);
			}
		}
		
		
		Student [] arr = arrList.toArray(new Student[arrList.size()]);
		
		return arr;
			
		
	}
}
