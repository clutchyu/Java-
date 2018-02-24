public class SingleLinkedList{
	private int size;
	private Node head;	//Í·½Úµã
	
	public SingleLinkedList(){
		size = 0;
		head = null;
	}
	
	private class Node{
		private Object data;
		private Node next;
		
		public Node(Object data){
			this.data = data;
			
		}
	}
	
	public Object addHead(Object data){
		Node newNode = new Node(data);
		if(size == 0){
			head = newNode;
		}else{
			newNode.next = head;
			head = newNode;
		}
		size++;
		return data;
	}
	
	public Object deleteHead(){
		Object data = head.data;
		head = head.next;
		size--;
		return data;
	}
	
	public Node find(Object obj){
		Node check  = head;
		while(check!=null&&!check.data.equals(obj)){
			check = check.next;
		}
		if(check==null)
			return null;
		System.out.println(check.data);
		return check;
	}
	
	public boolean delete(Object data){
		if(size == 0)
			return false;
		else{
			Node current = head;
			Node previous = head;
			while(!current.data.equals(data)){
				if(current.next == null){
					return false;
				}else{
					previous = current;
					current = current.next;
				}
			}
			if(current == head){
				head=current.next;
			}else{
				previous.next = current.next;	
			}
			size--;
			return true;
		}
	}
		
		public boolean isEmpty(){
			   return (size == 0);
	   }
		
		public void display(){
			if(size>0){
				Node node = head;
				int tempsize = size;
				if(tempsize == 1){
					System.out.println("["+node.data+"]");
				}else{
					while(tempsize>0){
						if(node == head){
                    System.out.print("["+node.data+"->");
                 	}else if(node.next == null){
                     System.out.print(node.data+"]");
                 	}else{
                     System.out.print(node.data+"->");
                 	}
                 	node = node.next;
                 	tempsize--;
             	}
             	System.out.println();
					}
				
			}else{
				System.out.println("[]");
			}
		}
	}
