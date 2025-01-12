package com.sapient.client.cui;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class SerDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Sample object1 = new Sample("Hi", -7, 2.7);
			System.out.println("object1: " + object1);
			OutputStream fos = new FileOutputStream("store");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(object1);
			oos.flush();
			oos.close();
		}
		catch (IOException e) {
			System.out.println("Exception : " + e);
			System.exit(0);
		}
		try {
			Sample object2;
			InputStream fis = new FileInputStream("store");
			ObjectInputStream ois = new ObjectInputStream(fis);
			object2 = (Sample) ois.readObject();
			ois.close();
			System.out.println("object 2: " + object2);
		}
		catch (Exception e) {
			System.out.println("Exception : " + e);
			System.exit(0);
		}
		
	}
}

class Sample implements Serializable {
	String s;
	int i;
	double d;

	public Sample(String s, int i, double d) {
		this.s = s;
		this.i = i;
		this.d = d;
	}

	public String toString() {
		return "s=" + s + "; i=" + i + "; d=" + d;
	}
}