import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateList {

	public static void main(String[] args) {
	
		List<String> mentors=new ArrayList<String>();
		mentors.add("Sam");
		mentors.add("Raji");
		mentors.add("Ram");
		mentors.add("sujay");
		mentors.add("Kevin");
		System.out.println(mentors);
		
		// add values of one list  to other list
		
		List<String> addedmentors=new ArrayList<String>(mentors);
		
		//  List<String> addedmentors=new ArrayList<String>();
		//  addedmentors.addAll(mentors);
		System.out.println(addedmentors);
		
		// to retrive the data from the list ---> using Index
		String string = addedmentors.get(2);
		System.out.println(string);
		
		// to return the count of elements in the list
		int size = addedmentors.size();
		System.out.println(size);
		
		// replacing a new name in the index of the list
		addedmentors.set(2, "Kale");
		System.out.println(addedmentors);
		
		// adding at the end
		addedmentors.add("Kunal");
		System.out.println(addedmentors);
		System.out.println(addedmentors.size());
		
		// to retrive all the values as a string
		for(int i=0;i<addedmentors.size();i++) {
			System.out.println(addedmentors.get(i)); // get of i to retrive the data
			System.out.println("****************");
			
			// To remove data from one particular list
			String remove = addedmentors.remove(1);
			System.out.println(remove);
			System.out.println(addedmentors);
			
			// Remove all the data in compared with other list
			addedmentors.removeAll(mentors);
			System.out.println(addedmentors);
			
			// to empty or delete all the datas in the list
			addedmentors.clear();
			System.out.println(addedmentors);
			// to check this name is available in the existing list or not
			boolean contains = mentors.contains("Sam");
			System.out.println(contains);
			
			//sorting an array
			Collections.sort(mentors);
			System.out.println(mentors);
			
			Collections.reverse(addedmentors);
			System.out.println(addedmentors);
			
			String max = Collections.min(mentors);
			System.out.println(max);
		}
		
		

	}

}
