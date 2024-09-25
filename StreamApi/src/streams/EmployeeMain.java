package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee implements Comparable<Employee>{
	@Override
	public String toString() {
		//return "";
		return "Employee [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	int id;
	String name;
	float price;
	
	public Employee(int id, String name,int price) {
		this.id=id;
		this.name=name;
		this.price=price;
}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (int) (this.price-o.price);
	}
}
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(1,"Ganesh",200));
		e.add(new Employee(2, "Kartik", 400));
		e.add(new Employee(3, "Shankar", 100));
		e.add(new Employee(4, "kankar",300));
		System.out.println(e);
	//	List<Employee> s = e.stream().filter(emp ->emp.price>0).collect(Collectors.toList());
		Collections.sort(e);
		//s.sort(null);
		//s.filter(emp -> emp.price>200);
		e.forEach(emp -> System.out.println(emp));
	}

}
