
public class PrintDuplicates {

	public static void main(String[] args) {
		
		int[] num= {3,5,8,1,2,4,0,3,8,6,7,9};
		
		
		
		
		
		
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1; j<num.length;j++) {
				if(num[i]==num[j]) {
					System.out.println(num[i]);
				}
				
				
			}
		}
		
		//for (int i = 0; i < num.length; i++) {
			//for(int j=i+1; j<num.length;j++) {
				//if (num[i]==num[j]);
			//}
			//System.out.println(num[i]);
			
		}

	}

//}
