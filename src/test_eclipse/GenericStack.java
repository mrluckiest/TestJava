package test_eclipse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GenericStack<E> {
	private java.util.ArrayList<E> list = new java.util.ArrayList<>();

	public int getSize() {
		return list.size();
	}

	public E peek() {
		return list.get(getSize() - 1);
	}

	public void push(E o) {
		list.add(o);
	}

	public E pop() {
		E o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}

	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> alist){
		ArrayList<E> list2= new ArrayList<E>();
		
		for(E item : alist){
			if(!list2.contains(item)){
				list2.add(item);
			}
		}
	
		return list2;	
	}
	
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key){
		for(E item : list){
			if(item.equals(key)){
				return 1;
			}		
		}
		return 0;
		
	}
	
	public static <E extends Comparable<E>> E max(E[][] list){
		E maxVal = list[0][0];
		for(int i=0;i<list.length;i++){
			for(int j=0;j<list[i].length;j++){
				if((list[i][j].compareTo(maxVal))== 1){
					maxVal=list[i][j];
				}
			}
		}
		
		return maxVal;
	}
}