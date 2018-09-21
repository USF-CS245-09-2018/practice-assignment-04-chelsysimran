public class InsertionSort implements SortingAlgorithm
{
	public void sort(int [] arr) //insertion sort is considered half more efficient that bubble sort or selection sort
	{
		for (int i = 1; i<arr.length; i++)
		{
			double temp = arr[i];
			int k = i - 1;

			while (k >= 0 && arr[k] > temp)
			{
				arr[k+1] = arr[k];
				--k;
			}
		}
		
	}
}