
public class BubbleSort {

	/**
	 * @param args
	 */
	public static int[] sort(int[] array){
		int t=array.length;  //t为交换位置
		int n=t;			//n为最后一次交换的位置
		while(n!=0){
			 //设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
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
			n=t;		//记录最后一次的交换位置
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
