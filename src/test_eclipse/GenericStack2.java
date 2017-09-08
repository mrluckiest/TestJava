package test_eclipse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.arraycopy;

public class GenericStack2<E> {
	@SuppressWarnings("unchecked")
	private E[] arr = (E[]) new Object[2];

	public E peek() {
		return arr[arr.length - 1];
	}

	@SuppressWarnings("unchecked")
	public void push(E item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null ) {
				arr[i] = item;
				break;
			} else {
				if(i==this.getSize()-1){
					E[] arr2 = (E[]) new Object[arr.length * 2];
					arraycopy(arr,0,arr2,0,arr.length);
					arr2[this.getSize()]=item;
					arr=arr2;
					break;
				}
			}
		}
	}

	public E pop() {
		@SuppressWarnings("unchecked")
		E temp = (E) new Object();
		
	
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == null){
				temp = arr[i-1];
				arr[i-1]=null;
			}
			
		}
		
		if(arr[arr.length-1] !=null){
			temp = arr[arr.length-1];
			arr[arr.length-1]=null;
		}

		return temp;
	}

	public boolean isEmpty() {

		for (E e : arr) {
			if (e != null) {
				return false;
			}

		}

		return true;
	}

	public int getSize() {
		return arr.length;
	}

	@Override
	public String toString() {
		return Arrays.toString(arr);
	}
	
	
}
