package classpart1;

public class Student {
	String studentName;
	
	public String getStudentName() {
		return studentName;
	}
	public static void main(String[] args) {
		//Student studentAhn=new Student();
		//studentAhn.studentName="�ȿ���";
		
		Student student1=new Student();
		student1.studentName="ȫ�浿";
		
		System.out.println(student1.getStudentName());
		
		Student student2=new Student();
		student2.studentName="�̼���";
		 
		System.out.println(student2.getStudentName());
		
		//System.out.println(studentAhn.studentName);
		//System.out.println(studentAhn.getStudentName());
	}

}