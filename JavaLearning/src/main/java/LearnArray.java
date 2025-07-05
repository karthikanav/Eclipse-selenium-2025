import java.util.Iterator;

public class LearnArray {

	public static void main(String[] args) {
		
		
		int[]marks= {20,40,90,75,100};
		
        int length=marks.length;
       System.out.println(length); // calling number of elements in the array
       System.out.println("-----------=");
        
       System.out.println(marks[4]); // calling specific element location
       System.out.println("---------------");

        for (int i = 0; i <marks.length; i++) { // Need "for loop" to access the array elements
        	// reaches 0 to 4 as index of array starts with 0
        	System.out.println(marks[i]);
        	
			
	}
        System.out.println("----------------");
        
        for (int i = length-1; i >=0; i--) {
        	System.out.println(marks[i]);
			
		}
			
		}
	}



