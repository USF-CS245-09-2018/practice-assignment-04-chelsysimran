public class SelectionSort implements SortingAlgorithm
{
	public void sort(int [] arr)
	{

        int n = arr.length;
 
        for (int i = 0; i < n-1; i++)
	    {

	    	//finding the minimum
	    	int min = i;
	        for (int j = i+1; j < n; j++)
	      
	            if (arr[j] < arr[min])
	          
	                min = j;

	            //SWAP
	            int temp = arr[min];
	            arr[min] = arr[i];
	            arr[i] = temp;
	       
	    }
		
	}
}