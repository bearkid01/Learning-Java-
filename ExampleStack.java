package IntermediateJava;

import java.util.*;

public class ExampleStack {
	
	// first initialize it as an array; then convert to a list 
	private LinkedList<String> list1 = new LinkedList<String>();
	
	public void push(String s){
		list1.addFirst(s);
	}
	
	public void pop(){
		//check if empty
		if(list1.isEmpty()==false){
			System.out.println(list1.get(0));
			//remove the first element
			list1.removeFirst();	
		}
		else{
			System.out.println("The stack is empty");
		}
	}
	
	public void isStackEmpty(){
		if(list1.size()!=0){
			System.out.println("The stack is not empty");
		}
		else{
			System.out.println("The stack is empty");
		}
	}	
	
	public int getLen(){
		return list1.size();
	}
}


