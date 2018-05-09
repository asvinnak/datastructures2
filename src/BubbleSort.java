
public class BubbleSort {
	
	public int[] sort(int[] a, int len) {
		
		
		 if(len <= 1){
			 return a;
		 }
		int temp=0; 
		int n= len;
		for(int i=1; i < len; i++) {			
			if(a[i-1] > a[i]) {
				temp= a[i-1];
				a[i-1]= a[i];
				a[i]= temp;				
			}
		}		
		n= n -1;
		sort(a, n);		
		
		return a;
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a= {7, 5, 3, 8, 10, 2, 4};
		System.out.println("before :"+ a);		
		BubbleSort o= new BubbleSort();
		long sTime = System.nanoTime();
		a= o.sort(a, a.length);
		long eTime = System.nanoTime();
		System.out.println("Time take to process Bubble sort - " + (eTime - sTime) / 1E06 + "msec");		
		for(int i=0, len = a.length; i < len; i++){
			System.out.println(a[i] + ",");			
		}

	}

}
