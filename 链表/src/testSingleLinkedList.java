
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
		    //��ӡ��ǰ������Ϣ
		    singleList.display();
		    //ɾ��C
		    singleList.delete("C");
		    singleList.display();
		    //����B
		    
		    System.out.println(singleList.find("B"));

	}
	


}
