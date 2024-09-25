package streams;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Student{
	int id;
	String name;
	float price;
	
	public Student(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class StudentStream {
	public static void main(String args[]) {
		List <Student> studentList = new ArrayList<Student>();
	//	List<Student>studentList   =List.of(new Student(100, "Rishabh", 110f),new Student(200, "Ritik", 210f),new Student(300, "Naveen", 310f));
		studentList.add(new Student(100, "Rishabh", 110f));
		studentList.add(new Student(200, "Ritik", 210f));
		studentList.add(new Student(300, "Naveen", 310f));
	//	System.out.print(studentList);
		Stream<Student> s = studentList.stream();
		System.out.print(s);
	
	}

}

/*	System.out.println(list1);
	Stream<Integer> s=list1.stream();
	List<Integer> l = s.filter(i ->i%2==0).collect(Collectors.toList());
*/