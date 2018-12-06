// This is a mutant program.
// Author : ysma

import java.util.Arrays;


public class InsertionSort
{

    public static  int[] sort( int[] arr )
    {
        int n = arr.length;
        int[] newArr = new int[n];
        newArr[0] = arr[0];
        int i;
        int j;
        for (i = 1; i < arr.length; i++) {
            for (j = i - 1; j >= 0; j--) {
                if (arr[i] > newArr[j++]) {
                    newArr[j + 1] = arr[i];
                    break;
                } else {
                    newArr[j + 1] = newArr[j];
                }
            }
            newArr[j + 1] = arr[i];
        }
        return newArr;
    }

}
