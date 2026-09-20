import java.util.*;
class Student {
	private int studentId;
	private String studentName;
	private double marks;
	private String subject;
	public Student(int studentId,String studentName,double marks,String subject){
		this.studentId=studentId;
		this.studentName=studentName;
		this.marks=marks;
		this.subject=subject;
	}
	public int getStudentId() {
		return studentId;
	}
   public String getStudentName(){
   	    return studentName;
   }
   public double getMarks(){
   	    return marks;
   }
   public String getSubject(){
      return subject;
   }

   public char getGrade(){
   	    if(marks>=90) return 'A';
   	    else if(marks>=75) return 'B';
   	    else if(marks>=60) return 'C';
   	    else if(marks>=50) return 'D';
   	    else  return 'F';
   }



}

class Solution{
  public static List<String> getTopStudentsBySubject(Student[] arr, String subject) {
  	    List<Student> list=new ArrayList<>();
        for(Student st:arr){
        	if(st.getSubject().equalsIgnoreCase(subject)) {
               list.add(st);
        	}
        }
        Collections.sort(list,new Comparator<Student>() {
        	public int compare(Student s1,Student s2) {
        		return Double.compare(s2.getMarks(),s1.getMarks());
        	}
        });
        List<String> res=new ArrayList<>();
        for(Student ss:list){
        	res.add(ss.getStudentName());
        }
        return res;

        

	}
	public static void main(String[] args) {
		Student[] student=new Student[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
			int id = sc.nextInt();
        	String name = sc.next();
			double marks = sc.nextDouble();
			String subject = sc.next();
            student[i]=new Student(id,name,marks,subject);
		}
		String subject1=sc.next();
		List<String> res=getTopStudentsBySubject(student,subject1);
		if(res.isEmpty()) {
       System.out.println("No students found");
    } 
     else {
        for(String name : res) {
        System.out.println(name);
    }
}


	}
}