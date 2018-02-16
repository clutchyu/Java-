
public class InsertSort {

	/**
	 * @param args
	 */
	public static int[] sort(int[] array){
		int j;
		int temp;
		for(int i=1;i<array.length;i++){
			j=i;
			temp = array[j];
			while(j>0&&temp<array[j-1]){
				array[j]=array[j-1];
				j--;
			}
			array[j]=temp;
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
