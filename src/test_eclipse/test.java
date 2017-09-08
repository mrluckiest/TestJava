package test_eclipse;

import java.util.ArrayList;

public class test {
	public static void main(String[]args){
		
		GenericStack<Integer> stack = new GenericStack<Integer>();
	
		
		for(int i=0;i<5;i++){
			stack.push(1);
		}
		
		ArrayList<Integer> aa = new ArrayList<Integer>();
		Integer [] intArray = new Integer[]{1,2,3,4};
		Integer [][]intArray2 = new Integer[][]{{1,2},{10,11}};

		
		aa.add(1);
		aa.add(1);
		aa.add(2);
		
		aa = GenericStack.removeDuplicates(aa);
		
		System.out.println(aa); 
		System.out.println(GenericStack.linearSearch(intArray, 99));
		System.out.println(GenericStack.max(intArray2));
		
	}
	
}
