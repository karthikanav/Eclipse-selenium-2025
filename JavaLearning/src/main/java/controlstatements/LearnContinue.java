package controlstatements;

public class LearnContinue {

	public static void main(String[] args) {
		
		//for (int i=0; i<=10; i++) {
			//if (i==4) {
				//continue;  // skip the loop if** logic fails here
		//	}
			
			//System.out.println(i);
		//}
		
		for (int q=0;q<=20;q++) {
			if(q%2!=0) {     // <>--// getting reminder as 0 here   //i%2!=0     q%2==1 or q%2!=1
				//finding add number here
				System.out.println("This will be odd number   " +q);
				
			}else {
				System.out.println("This will be even number   " +q);
			}
		}

	}

}
