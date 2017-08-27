package org.anuj;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class test implements Serializable {

	private check c;
	void display(){
	System.out.println("display method called");
}
	public static void main(String args[]) throws IOException, ClassNotFoundException{
		check c= new check();
		test t = new test();
		FileOutputStream fs = new FileOutputStream("anuj.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(t);
		FileInputStream fi= new FileInputStream("anuj.txt");
		ObjectInputStream is= new ObjectInputStream(fi);
		test ob=(test)is.readObject();
		ob.display();
		
	}
}
