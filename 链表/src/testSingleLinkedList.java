
public class testSingleLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SingleLinkedList singleList = new SingleLinkedList();
		    singleList.addHead("A");
		    singleList.addHead("B");
		    singleList.addHead("C");
		    singleList.addHead("D");
		    //打印当前链表信息
		    singleList.display();
		    //删除C
		    singleList.delete("C");
		    singleList.display();
		    //查找B
		    
		    System.out.println(singleList.find("B"));

	}
	


}
