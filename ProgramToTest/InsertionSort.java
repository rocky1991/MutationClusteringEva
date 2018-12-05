import java.util.Arrays;

public class InsertionSort{

	public static int [] sort(int[] arr){
		int n = arr.length;
		int[] newArr = new int[n];
		newArr[0] = arr[0];
		int i;
		int j;
		for(i = 1; i < arr.length;i++){
			
			for(j = i-1;j>=0;j--){
				if(arr[i] > newArr[j]){
					newArr[j+1] = arr[i];
					break;
				}
				else{
					newArr[j+1]=newArr[j];
				}
			}
			newArr[j+1] = arr[i];
			
		}
		return newArr;
	}
	// public static void main(String[]args){
	// 	int [] intArr = new int[]{1,60,10,2,7,90,100,35};
	// 	System.out.println(Arrays.toString(intArr));
	// 	System.out.println(Arrays.toString(sort(intArr)));
	// }

}