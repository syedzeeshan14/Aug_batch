
public class Class_1 
{
int age;
int rollno;
 public void display1() {
System.out.println("Welcome All of you");
 }
 public void display2() {
	 System.out.println("Automation is very easy");
 }
 public static void main(String[] args) {
	Class_1 abc= new Class_1();
	abc.age=32;
	System.out.println("Age is:"+abc.age);
	abc.rollno=990;
	System.out.println("Roll No is:"+abc.rollno);
	abc.display1();
	abc.display2();
	
	
}
}
