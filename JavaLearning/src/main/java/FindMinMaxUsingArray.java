import java.util.Arrays;

public class FindMinMaxUsingArray {

	public static void main(String[] args) {
		 int[]arr= {98,4,25,78,12,34};
		 
		 Arrays.sort(arr); //F3 or right click & Open declaration, declared in ascending order
		 
		 int co= arr.length;
		 System.out.println(arr[0]); // sorting an array with minimum number, default declared in ascending
		 System.out.println(arr[co-1]);
		


	}

}
