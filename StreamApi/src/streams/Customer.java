package streams;
import java.util.*;
import java.util.stream.Collectors;
class CustomerDetail{
	int id;
	String name;
	float price;
	
	public CustomerDetail(int id, String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}

	@Override
	public String toString() {
		return "CustomerDetail [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}
public class Customer {
	public static void main(String args[]) {
		List<CustomerDetail> cd = new ArrayList<CustomerDetail>();
		cd.add(new CustomerDetail(1,"Ganesh",300));
		cd.add(new CustomerDetail(2, "Kartik", 100));
		cd.add(new CustomerDetail(3, "Shankar", 200));
		 int highPrice=0;
		 int hId=0;
		 
		 Collections.sort(cd , (a,b)-> b.id - a.id);
		 System.out.println(cd);
		 
		 List<Float> pricess =  cd.stream().filter(x->x.price>=200)
				 .map(x->x.price).distinct().collect(Collectors.toList());
		 System.out.println(pricess);
		 
		 List<CustomerDetail> Filteredcustomers =  cd.stream().filter(x->x.price>=200).collect(Collectors.toList());
		 System.out.println(Filteredcustomers);
		
		
		 
//		 for(CustomerDetail cds : cd) {
//			 System.out.println(cds.id);
//			 System.out.println(cds.name);
//			 System.out.println(cds.price);
//		 }
//		 System.out.println(cd);
		/*for( CustomerDetail cds : cd) {
			if(cds.price>highPrice) {
				highPrice=cds.price;
				hId=cds.id;
				}
		}
		for(CustomerDetail c : cd) {
			if(c.id==hId) {
				System.out.println(c.id+ c.name+c.price);
				break;
			}
		} */
	}
}
