package com.gladosbday;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gladosbday.PlayCircle;

public class PlayCircleTest {
	private PlayCircle pc;
	
	@Before
	public void setUp() throws Exception {
		pc = new PlayCircle();
	}

	@After
	public void tearDown() throws Exception {
		pc = null;
	}

	@Test
	public void scenarioA() {
		int[] children = new int[5];
		
		for (int idx = 0; idx < children.length; idx++) {
			children[idx] = idx + 1;
		}
		
		int age = 3;
		
		pc.formCircle(children);
		pc.removeChild(age);
		int pos = pc.getPosition();
		pc.printPosition(pos);
		pc.printToOutputStream(pos);
		assertEquals(4, pos);
	}

	@Test
	public void scenarioB() {
		int[] children = new int[26];
		
		for (int idx = 0; idx < children.length; idx++) {
			children[idx] = idx + 1;
		}
		
		int age = 9;
		
		pc.formCircle(children);
		pc.removeChild(age);
		int pos = pc.getPosition();
		assertEquals(21, pos);
		pc.printPosition(pos);
		pc.printToOutputStream(pos);
		
	}
	
	@Test
	public void scenarioC() {
		int[] children = new int[14];
		
		for (int idx = 0; idx < children.length; idx++) {
			children[idx] = idx + 1;
		}
		
		int age = 17;
		
		pc.formCircle(children);
		pc.removeChild(age);
		int pos = pc.getPosition();
		pc.printPosition(pos);
		pc.printToOutputStream(pos);
		assertEquals(14, pos);
	}
}
