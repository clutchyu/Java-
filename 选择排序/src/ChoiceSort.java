
public class ChoiceSort {

	/**
	 * @param args
	 */
	
	public static int[] sort(int[] array){
		for(int i=0;i<array.length;i++){
			int min=i;
			//min Ϊ������С����λ�ã���ʼʱΪ���ֵ�һ����
			for(int j=i+1;j<array.length;j++){
				if(array[j]<array[min]){
					min=j;
				}
			}
			//����λ��
		if(i!=min){	
			int temp = array[i];
			array[i]=array[min];
			array[min]=temp;
		}
		}
		return array;
	}
	

	public static void display(int[] array){
		for (int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {6,5,8,15,3,6,7,0,1};
		array = sort(array);
		display(array);
	}

}
