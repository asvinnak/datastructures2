public class InsertionSort {	
	public void sort(int[] a){
		int lenth= a.length;	
		long sTime = System.nanoTime();		
		for(int i=1; i < lenth; i++ ) {			
			int index= i;
			int	item= a[i];
			while(index > 0 && a[index-1] > item)	{				
				a[index] = a[index - 1];
				index= index -1;				
			}			
			a[index]= item;
		}	
		long eTime = System.nanoTime();
		System.out.println("Time take to process Insertion sort - " + (eTime - sTime) / 1E06 + "msec");
		for(int i=0, len = a.length; i < len; i++){
			System.out.println(a[i] + ",");			
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		int[] a= {7, 5, 3, 8, 10, 2, 4};
		System.out.println("before :"+ a);
		InsertionSort o= new InsertionSort();
		o.sort(a);
	}

}
