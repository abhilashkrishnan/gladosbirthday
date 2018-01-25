package com.gladosbday;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class PlayCircle {
	private Child shortest;
	private Child tallest;
	private int size;
	
	public void formCircle(int[] height) {
		for (int idx = 0; idx < height.length; idx++) {
			Child c = new Child(height[idx]);
			addChildToCirCle(c);
		}
	}
	
	public void addChildToCirCle(Child child) {
		if (shortest == null) {
			shortest = child;
			child.next = shortest;
			tallest = shortest;
		} else {
			child.next = shortest;
			tallest.next = child;
			tallest = child;
		}
		size++;
	}
	public void removeChild(int place) {
		Child c = shortest;
		int idx = 1;
		
		for (int i = 1, jdx = 1; ;i++) {
			
			if (size == 1) {
				break;
			}

			if (idx > size) {
				idx = 1;
			} 
			
			if (jdx > place) {
				jdx = 1;
				removeChildFromCircle(idx);
				System.out.printf("Position \t %d: Is out.\n", idx);
				idx += jdx;
			}  else if (jdx == place){
				idx += jdx;
				removeChildFromCircle(idx);
				System.out.printf("Position \t %d: Is out.\n", idx);
				jdx += place;
			}else {
				jdx += place;
				idx += jdx;
			}

			c = c.next;
		}
		
		shortest = c;
		tallest = c;
	}
	
	public void removeChildFromCircle(int idx) {

		if (size == 1)
        {
			shortest.next = tallest;
            shortest = tallest;
            tallest = shortest;
            tallest.next = shortest;
            return;
        }        
        if (idx == 1) 
        {
        	shortest = shortest.next;
        	tallest.next = shortest;
            size--; 
            return;
        }
        if (idx == size) 
        {
            Child s = shortest;
            Child t = tallest;
            while (s != tallest)
            {
                t = s;
                s = s.next;
            }
            tallest = t;
            tallest.next = shortest;
            t = null;
            s = null;
            size --;
            return;
        }
        
        Child t = shortest;
        idx = idx - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == idx) 
            {
                Child tmp = t.next;
                tmp = tmp.next;
                t.next = tmp;
                tmp = null;
                break;
            }
            t = t.next;
        }
        size-- ;
	}
	
	public int getPosition() {
		Child c = tallest;
		return c.height;
	}
	
	public void printPosition(int pos) {
		System.out.printf("Position \t %d: Winner!\n", pos);
	}
	
	public void printToOutputStream(int pos) {
		String position = String.format("Position \t %d: Winner!\n", pos);
		OutputStream os = System.out;
		try {
			os.write(position.getBytes(Charset.forName("UTF-8")));
		} catch (IOException e) {
			throw new RuntimeException("Unable to write to output stream");
		}
		
	}
	
	class Child {
		int height;
		Child next;
		
		public Child(int height) {
			this.height = height;
		}
	}
}
