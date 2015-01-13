package day2.examples;
import java.io.*;
import java.util.*;

public class ExampleReadfile {
	
	private Scanner x;
	private static String fileLocation = "C:\\Users\\song\\workspace\\FirstProject\\src\\day2\\examples\\test.txt";
	
	public void openFile() {
		
		try {
			x = new Scanner(new File(fileLocation));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("File could not be opened");
		}
	}
	
	public void readFile(){
		while(x.hasNext()){
			String a = x.next();
			String b = x.next();
			String c = x.next();
	
			System.out.printf("%s %s %s\n", a, b, c);
		}
	}
	
	public void closeFile(){
		x.close();
	}

}


package day2.examples;

public class TestReadfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleReadfile r = new ExampleReadfile();
		r.openFile();
		r.readFile();
		r.closeFile();
	}

}


package day2.examples;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Examplecreatefile {
	
	private Formatter x;
	
	public void openFile(){
		
		try{
			x = new Formatter("chinese.txt");
		}
		catch(Exception e){
			System.out.println("You have an error");
		}
	}
	
	public void addRecords(){
		for(int i=0; i<=11, i+=3){
			x.format("%s %s %s\n", i, i+1, i+2);
		}
	}

	public void closeFile(){
		x.close();
	}
}


package day2.examples;

public class Testcreatefile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Examplecreatefile output = new Examplecreatefile();
		output.openFile();
		output.addRecords();
		output.closeFile();
	}	

}