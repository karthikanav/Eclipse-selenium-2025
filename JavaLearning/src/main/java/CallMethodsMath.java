
public class CallMethodsMath {
	
	
	
	
	public int 	category(int add) {
		System.out.println("In addition kevin scored 20");
		return add;
	}
public int specific(int sub) {
	return sub;
}

public int hardPart(int div) {
	return div;
}


public static void main(String[] args) {
	CallMethodsMath subject=new CallMethodsMath ();
	subject.category(20);
	subject.specific(100);
	System.out.println(subject.hardPart(92));
	
	
		

	}

}
