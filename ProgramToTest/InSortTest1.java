import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import java.util.Random;
import java.util.Arrays;

public class InSortTest1{
	InsertionSort sorter = new InsertionSort();
	Random rand = new Random();

	public void fillArr(int [] arr){
		for(int i =0; i< arr.length;i++){
			arr[i] = rand.nextInt(50);
		}
	}
	@Test
	public void testCase1(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = sorter.sort(arr);
		Arrays.sort(arr);
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase2(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]+= 5;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]+= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
		public void testCase3(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]*= 3;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]*= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase4(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = sorter.sort(arr);
		Arrays.sort(arr);
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase5(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]+= 5;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]+= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
		public void testCase6(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]*= 3;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]*= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase7(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = sorter.sort(arr);
		Arrays.sort(arr);
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase8(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]+= 5;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]+= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
		public void testCase9(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]*= 3;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]*= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase10(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = sorter.sort(arr);
		Arrays.sort(arr);
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase11(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]+= 5;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]+= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
		public void testCase12(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]*= 3;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]*= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase13(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = sorter.sort(arr);
		Arrays.sort(arr);
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase14(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]+= 5;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]+= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
		public void testCase15(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]*= 3;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]*= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase16(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = sorter.sort(arr);
		Arrays.sort(arr);
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase17(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]+= 5;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]+= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
		public void testCase18(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]*= 3;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]*= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase19(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = sorter.sort(arr);
		Arrays.sort(arr);
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase20(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]+= 5;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]+= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
		public void testCase21(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]*= 3;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]*= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase22(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = sorter.sort(arr);
		Arrays.sort(arr);
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase23(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]+= 5;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]+= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
		public void testCase24(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]*= 3;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]*= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase25(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = sorter.sort(arr);
		Arrays.sort(arr);
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase26(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]+= 5;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]+= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
		public void testCase27(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]*= 3;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]*= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase28(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = sorter.sort(arr);
		Arrays.sort(arr);
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase29(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]+= 5;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]+= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
		public void testCase30(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]*= 3;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]*= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase31(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = sorter.sort(arr);
		Arrays.sort(arr);
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase32(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]+= 5;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]+= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
		public void testCase33(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]*= 3;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]*= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase34(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = sorter.sort(arr);
		Arrays.sort(arr);
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase35(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]+= 5;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]+= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
		public void testCase36(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]*= 3;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]*= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase37(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = sorter.sort(arr);
		Arrays.sort(arr);
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase38(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]+= 5;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]+= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
		public void testCase39(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]*= 3;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]*= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase40(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = sorter.sort(arr);
		Arrays.sort(arr);
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase41(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]+= 5;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]+= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
		public void testCase42(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]*= 3;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]*= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase43(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = sorter.sort(arr);
		Arrays.sort(arr);
		assertArrayEquals(arr,arr1);
	}
	@Test
	public void testCase44(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]+= 5;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]+= 5;
		}
		assertArrayEquals(arr,arr1);
	}
	@Test
		public void testCase45(){
		int [] arr = new int[rand.nextInt(20)+2];
		fillArr(arr);
		int []arr1 = arr;
		// Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			arr[i]*= 3;
		}
		arr = sorter.sort(arr);

		arr1 = sorter.sort(arr1);
		for(int i =0; i<arr1.length;i++){
			arr1[i]*= 5;
		}
		assertArrayEquals(arr,arr1);
	}

}