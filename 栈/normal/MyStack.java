
public class MyStack {

	/**
	 * @param args
	 */
	
	private int[] array;
	private int maxsize;
	private int top;
	
	public MyStack(int size){
		maxsize = size;
		top = -1;
		array = new int[size];
	}
	
	public void push(int value){
		if(top<maxsize-1)
			array[++top] = value;
			
	}
	
	public int pop(){
		
		   return array[top--];
	}
	
	public int peek(){
		return array[top];
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}
	
	public boolean isFull(){
		return (top==maxsize-1);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
