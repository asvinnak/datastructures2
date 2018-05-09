
public class QuickSort {
	
	public int[] sort(int[] a, int low, int high) {		
		
		if (low >= high) {
			  return a;
		}
		
		//Determine pivot 7, 5, 3, 8, 10, 2, 4	
		int left= low;
		int right= high;
		int pivot= left+(right-left)/2;	
			
		while(left <= right) {				
			while( a[left] < a[pivot]){
				left++;
			}			
			while( a[right] > a[pivot]){
				right--;
			}	
			
			if(left <= right) {			
				int temp= a[left];
				a[left]= a[right];
				a[right]= temp;			
				left++;
				right--;
			}	
		}		
			
		
		if(low < right) 
			sort(a, low, right);
		if(left < high)
			sort(a, left, high);
		
		return a;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a= new int[] {4,6,8,2,9,8,3};
		System.out.println("before :"+ a);		
		QuickSort o= new QuickSort();
		long sTime = System.nanoTime();
		a= o.sort(a, 0, a.length-1);
		long eTime = System.nanoTime();
		System.out.println("Time take to process Quick sort - " + (eTime - sTime) / 1E06 + "msec");		
		for(int i=0, len = a.length; i < len; i++){
			System.out.println(a[i] + ",");			
		}

	}

}
