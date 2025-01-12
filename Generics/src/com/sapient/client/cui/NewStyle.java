package com.sapient.client.cui;

import java.util.ArrayList;
import java.util.Iterator;

class NewStyle {
	public static void main(String args[]) {

		// Now, list holds references of type String.
		//ArrayList list = new ArrayList();
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");

		// Notice that Iterator is also generic.
		//Iterator itr = list.iterator();
		Iterator<String> itr = list.iterator();
		
		while (itr.hasNext()) {
			String str = (String) itr.next();

			System.out.println(str + " is " + str.length() + " chars long.");
		}
	}
}