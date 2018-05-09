
public class MergeSort {	
	public int[] a= { 8, 5, 3, 7, 5, 4, 9, 2 };	
	public int[] t= new int[a.length];
	
	public void mergeSort(int low, int high) {		
		if(low < high){				
			int mid= (low + high) /2;			
			mergeSort(low, mid);
			mergeSort(mid+1, high);			
			merge(low, mid, high);
		}
	}	
	
	private void merge(int low, int mid, int high) {		
		// Copy both parts into the helper array
	    for (int i = low; i <= high; i++) {
	      t[i] = a[i];
	    }
	    
		int i= low;		
		int j= mid+1;
		int k= low;			
		while( (i <= mid) && (j <= high) ){			
			if(t[i] >= t[j]){
				a[k]= t[j];
				j++;
			}
			else{
				a[k] = t[i];
				i++;
			}
			k++;
		}		
		
		while(i <= mid){
			a[k]= t[i];
			k++;
			i++;
		}			
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MergeSort o= new MergeSort();
		o.mergeSort(0, o.a.length - 1);	
		for(int i=0, len = o.a.length; i < len; i++){
			System.out.println(o.a[i] + ",");			
		}
	}

}
