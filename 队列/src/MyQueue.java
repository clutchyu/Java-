public class MyQueue{
	private Object[] queArray;
	private int maxsize;
	private int front;
	private int rear;
	//队列中元素的实际数目
	private int nltems;
	
	
	public MyQueue(int s){
		maxsize = s;
		queArray = new Object[s];
		front = 0;
		rear = -1;
		nltems = 0;
	}
	
	public void insert(Object value){
		if(isFull()){
			System.out.print("队列已满");
		}
		else{
			if(rear == maxsize-1){
				rear = -1;
			}
			queArray[++rear] = value;
			nltems++;
		}
		
	}
	
	public Object remove(){
		Object removeValue = null;
		if(!isEmpty()){
			removeValue = queArray[front];
			queArray[front] = null;
			front++;
			if(front == maxsize){
				front = 0;
			}
			nltems--;
			return removeValue;
		}
		return removeValue;
	}
	
	public Object peekFront(){
		return queArray[front];
	}
	
	public boolean isFull(){
		return (nltems == maxsize);
	}
	
	public boolean isEmpty(){
		return (nltems == 0);
	}
	
	public int getSize(){
		return nltems;
	}
}