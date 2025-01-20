package twoDimensionalArray;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int sum[][]=new int[3][3];
		int diff[][]=new int[3][3];
		
		A a1  = new A();
		
		a1.acceptData(a);
		a1.acceptData(b);
		a1.showData(a);
		a1.showData(b);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Addition ");
	    a1.getSum(a, b, sum);
	    a1.showData(sum);
	    
	    System.out.println();
	    System.out.println();
	    
	    System.out.println("Substraction ");
	    a1.getdiff(a, b, sum);
	    a1.showData(diff);
	    
		

	}

}
