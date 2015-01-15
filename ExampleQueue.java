package IntermediateJava;

import java.util.*;

public class ExampleQueue {
	
	//implement a priority queue 
	private LinkedList<String> list2 = new LinkedList<String>();
	
	public void offer(String s){
		list2.addLast(s);
	}
	
	//return the highest priority element 
	public void peek(){
		System.out.println(list2.get(0));
	}
	
	public void poll(){
		if(list2.size()!=0){
			System.out.println(list2.get(0));
			list2.remove(0);
		}
		else{
			System.out.println("The queue is empty");
		}
	}
		
	public void isQueueEmpty(){
		if(list2.size()!=0){
			System.out.println("The queue is not empty");
		}
		else{
			System.out.println("The queue is empty");
		}
	
	}
	
	}
	
	

