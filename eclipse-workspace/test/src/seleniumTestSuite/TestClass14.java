package seleniumTestSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass14 {
	@Test
	public static void main(String[] args) {

		// count the number of names that starts with alphabet A

		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Aviraj");
		names.add("Mehak");
		/*
		 * int num = 0; for (String A : names) { System.out.println(A); if
		 * (A.contains("A")) { num++; }
		 * 
		 * }
		 * 
		 * System.out.println(num);
		 * 
		 * 
		 * Long count= names.stream().filter(s->s.startsWith("A")).count();
		 * System.out.println(count); Long d=Stream.of("Hi",
		 * "Bye","Avi","Anu").filter(s->
		 * 
		 * { s.startsWith("A"); return true; }).count(); System.out.println(d);
		 * 
		 * names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		 * names.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println
		 * (s));
		 * 
		 * 
		 * Stream.of("Hi",
		 * "Bye","Avi","Anu").filter(s->s.endsWith("i")).map(s->s.toUpperCase())
		 * .forEach(s->System.out.println(s)); Stream.of("Hi",
		 * "Bye","Avi","Anu").map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		 * List<String> m= Arrays.asList("Hi", "Bye","Avi","Anu");
		 * m.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).
		 * forEach(s->System.out.println(s));
		
		List<String> m = Arrays.asList("Hi", "Bye", "Avi", "Anu");
		//m.stream().sorted().forEach(s -> System.out.println(s));
		Stream<String> newStream= Stream.concat(names.stream(), m.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		boolean flag= newStream.anyMatch(s->s.equalsIgnoreCase("Hi"));
		Assert.assertTrue(flag);
		 */
		
		List<String> ls=Stream.of("Hi","Bye","Avi","Anu").sorted().limit(2).collect(Collectors.toList());
		for(String n:ls) {
			System.out.println(n);
		}
		
		List<Integer> num= Arrays.asList(3,2,5,2,1,3,5,6,8,7);
		//print the unique number
		//sort the array
		//give me the 3rd index
	//	num.stream().distinct().sorted().limit(3).forEach(s->System.out.println(s));
		List<Integer>l= num.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(l.get(2));
		
	}

}
