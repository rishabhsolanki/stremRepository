package streams;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		List<Integer> list = List.of(2,3,4,5,6,7,8);
		List<Integer> evenListStram =list.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.print(evenListStram);
		String [] names= {"Ram","Shyam"};
		List<String>naam = new ArrayList<String>();
		naam.add("Aman");
		naam.add("Divya");
	//	List<String>naams=naam.stream().filter(n->n.endsWith("a")).collect(Collectors.toList());
		List<Integer>naamm=list.stream().filter(e->e>2).map(n->n+2).collect(Collectors.toList());
		System.out.print(naamm);
		
		
		
		
		
		
		
		
		
		Stream<String> stream = Stream.of(names);
		List<String> rr=stream.filter(i->i.startsWith("R")).collect(Collectors.toList());
		List<String> ss=stream.map(i-> i+" Singh").collect(Collectors.toList());
		System.out.println(rr);
		//stream.forEach(e ->{
		//	System.out.println(e);
		//});
	}

}
