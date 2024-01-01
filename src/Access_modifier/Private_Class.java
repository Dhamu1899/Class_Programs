package Access_modifier;

class base{
	private int stud_no=12;// stud_no,stud_name=state
	 String stud_name="Nisha";
	void display()//display()-behaviour
	{
		System.out.println("Student ID:"+stud_no);
		System.out.println("Student Name:"+stud_name);
		}
}
public class Private_Class {
	

	public static void main(String[] args) {
		base obj=new base();
		System.out.println("Calling the Method");
		obj.display();
		System.out.println("Callinng the State");
		System.out.println(obj.stud_name);
		
		
		

	}

}
