import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsSet {

	public static void main(String[] args) {
		
		// Set will not allow duplicates by default
		// set is an interface and it's a class of a collection
		// 3 implementation for the set 1. Treeset --> Arrange the elements in ASCII order
		//2. Hashset --> Arrange the elements in random order
		//3. LinkedHashSet--> Insertion order
// We can't create an object for set
		// set holds the only unique values --> stores the values based on the implementation class
		//we  don't have get() method in the st interface
		Set<String> Mentors= new HashSet<String>(); // HashSet won't print in sequence order as we given
		Mentors.add("Aravid");
		Mentors.add("Aravid");
		Mentors.add("Ragu");
		Mentors.add("Raja");
		Mentors.add("Vinod");
		Mentors.add("Kayal");
		System.out.println(Mentors);
		

		Set<String> Mentors2= new LinkedHashSet<String>(); 
		Mentors2.add("Aravid");
		Mentors2.add("Aravid");
		Mentors2.add("Ragu");
		Mentors2.add("Raja");
		Mentors2.add("Vinod");
		Mentors2.add("Kayal");
		System.out.println(Mentors2);
		
		Set<String> Mentors3= new TreeSet<String>(); 
		Mentors3.add("Aravid");
		Mentors3.add("Aravid");
		Mentors3.add("Ragu");
		Mentors3.add("Raja");
		Mentors3.add("Vinod");
		Mentors3.add("Kayal");
		System.out.println(Mentors3);
		
		//To retrive the each element of the string
		// for (Wrapper class variable: Element in the set)
		for (String m : Mentors3) {
			System.out.println(m);
			System.out.println("_______");
			// if you want to fetch the one particular value from the set, we can use List
			java.util.List<String> Unique= new ArrayList<String>(Mentors3);
			System.out.println(Unique.get(3));
			
		}
		
	}

}
