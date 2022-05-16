import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class HighSchoolTest {
	HighSchool head = new HighSchool("","","",0);
	private static ArrayList<String> t1;
	private static ArrayList<String> t2;
	@BeforeAll
	static void setup() {
		t1.add("A");
		t1.add("History");
		t1.add("High School");
		t2.add("B");
		t2.add("Math 180");
		t2.add("High School");
	}
	
	//Testing the add function. 
	@Test 
	void addToSize() {
		head.add ("A", "History", "High School", 3);
		head.add("B", "MATH 180", "High School", 3);
		assertEquals(1,head.A.size(), "wrong size");
		assertEquals(1, head.B.size(), "wrong size");
		
	}
	//Testing the delete function.
	@Test 
	void delete() {
		head.add ("A", "History", "High School", 3);
		head.add("A", "MATH 180", "High School", 3);
		head.add ("A", "COM 101", "High School", 3);
		head.add("A", "BIO 101", "High School", 3);
		head.delete("A", "COM 101", "High School", 3);
		assertEquals(3, head.A.size(), "wrong size");
		
	}
	//Testing the size of each list when there is nothing in them.
	@Test
	void testForempty() {
		head.add ("A", "History", "High School", 3);
		head.add("A", "MATH 180", "High School", 3);
		head.add ("A", "COM 101", "High School", 3);
		head.add("A", "BIO 101", "High School", 3);
		
		head.add ("B", "History", "High School", 3);
		head.add("B", "MATH 180", "High School", 3);
		head.add ("B", "COM 101", "High School", 3);
		head.add("A", "Computer Science 101", "High School", 3);
		
		head.delete ("A", "History", "High School", 3);
		head.delete("A", "MATH 180", "High School", 3);
		head.delete ("A", "COM 101", "High School", 3);
		head.delete("A", "BIO 101", "High School", 3);
		
		head.delete ("B", "History", "High School", 3);
		head.delete("B", "MATH 180", "High School", 3);
		head.delete ("B", "COM 101", "High School", 3);
		head.delete("A", "Computer Science 101", "High School", 3);
		
		assertEquals(0, head.A.size(), "There is something inside.");
		assertEquals(0, head.B.size(),"There is something inside.");
		
		
	}
	//Comparing a static given String ArrayList t1 with A student. 
	@Test
	void compareString() {
		head.add ("A", "History", "High School", 3);
		//compare string arraylist for student.
		assertEquals(t1.get(0),head.A.get(0).getStudet(),"Not the same.");
		
		//compare string arraylist for type. 
		assertEquals(t1.get(2),head.A.get(0).getType(),"Not the same.");
		
		//Compare string for class name.
		assertEquals(t1.get(1),head.A.get(0).getClass(),"Not the same.");
	}
	//Comparing a static given String ArrayList t2 with A student. 
	@Test
	void compareString2() {
		head.add ("B", "Math 180", "High School", 3);
		//compare string arraylist for student.
		assertEquals(t2.get(0),head.B.get(0).getStudet(),"Not the same.");
		
		//compare string arraylist for type. 
		assertEquals(t2.get(2),head.B.get(0).getType(),"Not the same.");
		
		//Compare string for class name.
		assertEquals(t2.get(1),head.B.get(0).getClass(),"Not the same.");
	}

}
