import java.util.*;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		
		//PROBLEM #1
				ArrayList<Integer> ints = new ArrayList();
				ints.add(54);
				ints.add(23);
				ints.add(20);
				
				
				Numbers nums = new Numbers(ints);
				System.out.println("sum = " + nums.computeSum());
				
		//PROBLEM #2
				Date d5 = new Date(8,24,2020);
				Date d6 = new Date(8,24,2020);
				
				if(d5.compareTo(d6) == 1) {
					System.out.println(d5 + " is later than " + d6);
				} else if(d5.compareTo(d6) == 1) {
					System.out.println(d5 + " is later than " + d6);
				}else {
					System.out.println(d5 +" and " + d6 +" are the same dates ");
				}
				
		
		
		//PROBLEM #4	
		tableOfSquares(2);
	}
	
	static void tableOfSquares(int n){
		for(int i=1; i<= n; i++) {
			System.out.println("The square of " + i  +" is " + i*i);
		}
	}
	static void tablesofSquares(int i, int n) {
		if(i <= n) {
			System.out.println(i + " ^2 =  " + i*i);
			tableOfSquares(i+1);
		}else {
			return;
		}
	}

}
