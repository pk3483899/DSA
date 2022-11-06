package Array;
public class ReversingAnArray {
	static void RevArr(int arr[], int start, int end)
	{
		int temp;
		while(start < end)
			
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	static void printArr(int arr[], int size)
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= {12,23,34,45,56};
		System.out.println("Original array");
		printArr(arr,arr.length);
		RevArr(arr,0,arr.length-1);
		System.out.println("After Reversing the array");
		printArr(arr,arr.length);

	}
}
