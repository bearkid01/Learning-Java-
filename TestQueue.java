package IntermediateJava;

public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleQueue littleq = new ExampleQueue();
		
		littleq.isQueueEmpty();
		
		littleq.offer("Spring");
		littleq.offer("Summer");
		littleq.offer("Fall");
		littleq.offer("Winter");
		
		littleq.isQueueEmpty();
		
		littleq.peek();
		
		littleq.poll();
		littleq.poll();
		
		littleq.peek();
		
		
		littleq.poll();
		littleq.poll();
		littleq.poll();
		
	}

}
