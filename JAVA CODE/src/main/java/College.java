import java.util.ArrayList;

public class College implements credit {
	ArrayList<Node> A;
	ArrayList<Node>B;
	
	String Student;
	String classname;
	String type;
	int hour;
	
	//Constructor 
	College(String a, String b, String c, int d){
		this.Student = a;
		this.classname = b;
		this.type = c;
		this.hour = d;
		this.A = new ArrayList<Node>();
		this.B = new ArrayList<Node>();
	}
	
	//class Node--------------------------------------------------------------
	class Node{
		private String Student;
		private String classname;
		private int hour_credit;
		private String type;
		
		//constructor for Node class
		Node(String Student, String classname, String type, int hour){
			this.Student = Student;
			this.classname = classname;
			this.hour_credit = hour;
			this.type = type;
		}
		
		//gets and sets for Node class variables.
		public String getStudet() {return this.Student;}
		public void setStudent(String s) {this.Student = s;}
		public String getClassName() {return this.classname;}
		public void setClassName(String s) {this.classname = s;}
		public int getHour_credit() {return this.hour_credit;}
		public void setStudent(int s) {this.hour_credit = s;}
		public String getType() {return this.type;}
		public void setType(String s) {this.type = s;}
		
	}
	

	@Override
	public void add(String student, String classname,String type, int hour) {
		// TODO Auto-generated method stub
		//creating a node for the student first.  
		Node create = new Node(student, classname, type, hour);
		
		//if student is equal to Student A or B then they will be added. 
		//if student does not equal either one then an error should be printed out.
		
		if(student.equals("A")) {
			A.add(create);
		} 
		else if (student.equals("B")) {
			B.add(create);
		}
		else {
			System.out.println("Try again must be student A or B");
		}
	}


	@Override
	public void delete(String student, String classname,String type, int hour) {
		// TODO Auto-generated method stub
		//removing a given credit on list A.
		if (student.equals("A")) {
			for (int i = 0; i < A.size(); i++) {
				if(A.get(i).getClassName().equals(classname)) {
					A.remove(i);
					}
				}
			}
		//removing a given credit on list B.
		else if  (student.equals("B")) {
			for (int i = 0; i < B.size(); i++) {
				if(B.get(i).getClassName().equals(classname)) {
					B.remove(i);
					}
				}
			}
	}


	@Override
	public void printALL() {
		// TODO Auto-generated method stub
		//printing out everything in both list.
		int i = 0;
		//this while will print all the Nodes in list A and list B.
		while (!A.isEmpty() || !B.isEmpty()) {
			
			if(i < A.size()) {System.out.println("Student: "+A.get(i).Student + " Class Name: " + A.get(i).classname + " Credit Type: " + A.get(i).type+"  Credit Hours: "+A.get(i).hour_credit);}
			if (i < B.size()) {System.out.println("Student: "+B.get(i).Student + " Class Name: " + B.get(i).classname + " Credit Type: " + B.get(i).type+"  Credit Hours: "+B.get(i).hour_credit);}
			if ((i > A.size()) && (i > B.size())) {break;}
			i++;
			
		}
	}


	@Override
	public int sizeA() {
		// TODO Auto-generated method stub
		return this.A.size();
	}


	@Override
	public int sizeB() {
		// TODO Auto-generated method stub
		return this.B.size();
	}


	
	public  ArrayList <Node> getA() {
		// TODO Auto-generated method stub
		return this.A;
	}


	
	public void setA(ArrayList <Node> a) {
		// TODO Auto-generated method stub
		this.A = a;
	}


	
	public ArrayList <Node> getB()  {
		// TODO Auto-generated method stub
		return this.B;
	}


	
	public void setB(ArrayList <Node> b) {
		// TODO Auto-generated method stub
		this.B = b;
	}


}



