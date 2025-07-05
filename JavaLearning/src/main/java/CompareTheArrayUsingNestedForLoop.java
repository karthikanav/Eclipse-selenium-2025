
public class CompareTheArrayUsingNestedForLoop {

	public static void main(String[] args) {
		String[]weeks = {"week 1", "week 2", "week 3"};
		String[] Days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday "};
		for (int i = 0; i < weeks.length; i++) {
			System.out.println(weeks[i]);
			System.out.println("*************");  // nested for loop
			for (int j = 0; j < Days.length; j++) {
				System.out.println(Days[j]);
				
			}
			
		}

	}

}
