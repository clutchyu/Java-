
public class BubbleSort {

	/**
	 * @param args
	 */
	public static int[] sort(int[] array){
		int t=array.length;  //tΪ����λ��
		int n=t;			//nΪ���һ�ν�����λ��
		while(n!=0){
			 //�趨һ����ǣ���Ϊtrue�����ʾ�˴�ѭ��û�н��н�����Ҳ���Ǵ��������Ѿ����������Ѿ���ɡ�
			boolean flag = true;
			for(int j=0;j<n-1;j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					flag = false;
					t=j+1;
				}
			}
			n=t;		//��¼���һ�εĽ���λ��
			if(flag){
				break;
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
