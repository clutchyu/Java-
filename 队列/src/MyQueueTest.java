
public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(3);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);//queArray��������Ϊ[1,2,3]
         
        System.out.println(queue.peekFront()); //1
        queue.remove();//queArray��������Ϊ[null,2,3]
        System.out.println(queue.peekFront()); //2
         
        queue.insert(4);//queArray��������Ϊ[4,2,3]
        queue.insert(5);//��������,queArray��������Ϊ[4,2,3]
        
    }
 
}