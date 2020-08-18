public class QuickSort {
	
	public static void main (String[] args) {
		
		int arr[] ={11,6,78,19,2,17,5,14};
		int leng = arr.length;
		QuickSort ob = new QuickSort();
		ob.quicksort(arr,0,leng-1);
		ob.show(arr);
		
	}
	int partition(int arr[], int low, int high)
	{
		int pivot =arr[(low+high)/2]; //choosing pivot
		
		while(low<=high){
			
			while(arr[low]<pivot){
				low++;
			}
			while(arr[high]>pivot){
					high--;
			}
			if(low<=high){
					//swap
					int temp = arr[low];
					arr[low] = arr[high];
					arr[high] = temp;
					
					low++;
					high--;
					
			}			
		}
	return low;
			
}
void quicksort(int arr[],int low, int high){
	
	int pi = partition(arr,low,high);
	if(low < (pi-1)){
		
		quicksort(arr,low,pi-1);
	}
	if(pi<high){
		quicksort(arr,pi,high);

}}

void show(int arr[]){
	for(int i:arr){
		System.out.print(i + ", ");

}}
}
