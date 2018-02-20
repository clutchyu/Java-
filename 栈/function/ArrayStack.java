import java.util.Arrays;
import java.util.EmptyStackException;
public class ArrayStack {

	/**
	 * @param args
	 */
	//存储元素的数组，声明为Object类型能存储任意类型的数据
	private Object[] elementData;
	private int size;
	private int top;
	
	public ArrayStack(){
		elementData = new Object[10];
		top = -1;
		size = 10;
	}
	
	public ArrayStack(int initialCapacity){
		if(initialCapacity<0){
			throw new IllegalArgumentException("栈初始容量不能小于0: "+initialCapacity);
			
		}
		elementData = new Object[initialCapacity];
		size = initialCapacity;
		top = -1;
	}
	
	public Object push(Object value){
		isGrow(top+1);
		elementData[++top]=value;
		return value;
	}

	public Object pop(){
		Object obj = peek();
		remove(top);
		return obj;
	}
	
	public Object peek(){
		if(top==-1){
			 throw new EmptyStackException();
		}
		 return elementData[top];
	}
	
	public void remove(int top){
		elementData[top] = null;
		this.top--;
	}
	
	public boolean isGrow(int minCapacity){
		int oldCapacity = size;
		if(minCapacity >= oldCapacity){
			int newCapacity = 0;
			if((oldCapacity<<1) - Integer.MAX_VALUE >0){
                newCapacity = Integer.MAX_VALUE;
            }else{
					newCapacity=oldCapacity<<1;
			}
			this.size=newCapacity;
			int[] newArray = new int[size];
			elementData=Arrays.copyOf(elementData,size);
			return true;
		}else{
			return false;
		}
		
	}
	public boolean isEmpty(){
		return (top==-1);
	}
	public static void testStringReversal(){
	    ArrayStack stack = new ArrayStack();
	    String str = "how are you";
	    char[] cha = str.toCharArray();
	    for(char c : cha){
	        stack.push(c);
	    }
	    while(!stack.isEmpty()){
	        System.out.print(stack.pop());
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	ArrayStack stack = new ArrayStack(3);
		stack.push(1);
		//System.out.println(stack.peek());
		stack.push(2);
		stack.push(3);
		stack.push("abc");
		System.out.println(stack.peek());
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.peek());	*/
		testStringReversal();
	}

}
