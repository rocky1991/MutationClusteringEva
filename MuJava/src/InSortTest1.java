import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class InSortTest1{
	InsertionSort sorter = new InsertionSort();
	@Test
	public void test1(){
		int [] arr1 = new int[]{3,2,6};
		assertArrayEquals(new int[]{2,3,6},sorter.sort(arr1));
	}
}