


public interface credit {
	//add and deletes from the list. 
	public void add(String student, String classname, String type, int hour);
	public void delete(String student, String classname, String type, int hour) ;
	
	//prints all values in A and B.
	public void printALL();

	//gets the size of A and B.
	public int sizeA();
	public int sizeB();	
	
}
