package com.revature.main;

import java.util.LinkedList;

public class challenge {
	

	public static void main(String[] args) {
		
		LinkedList<Integer> one = new LinkedList<>(); 
		one.add(3); 
		one.add(7); 
		one.add(8); 
		one.add(10);

		LinkedList<Integer> two = new LinkedList<>(); 
		two.add(99); 
		two.add(1); 
		two.add(8); 
		two.add(10); 
		
		for(int each : one) {
			if(two.contains(each)) {
				System.out.println(each);
				return; 
			}
				
		}
	}

}