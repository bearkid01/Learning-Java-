package IntermediateJava;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleStack littleS = new ExampleStack();
		
		littleS.isStackEmpty();
		
		littleS.push("Spring");
		littleS.push("Summer");
		littleS.push("Fall");
		littleS.push("Winter");
		System.out.printf("The length of the stack is %s\n", littleS.getLen());
		
		littleS.isStackEmpty();
		
		littleS.pop();
		littleS.pop();
		littleS.pop();
		littleS.pop();
		System.out.printf("The length of the stack is %s\n", littleS.getLen());
		
		littleS.isStackEmpty();		
	}

}
