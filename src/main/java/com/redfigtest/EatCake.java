package com.redfigtest;

public class EatCake {
	public static void main(String[] args) {
		
		int[] children = new int[26];
		
		for (int idx = 0; idx < children.length; idx++) {
			children[idx] = idx + 1;
		}
		
		int age = 9;
		
		PlayCircle pc = new PlayCircle();
		pc.formCircle(children);
		pc.removeChild(age);
		int pos = pc.getPosition();
		pc.printPosition(pos);
		pc.printToOutputStream(pos);
	}
}
