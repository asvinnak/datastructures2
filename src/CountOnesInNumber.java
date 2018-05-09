
public class CountOnesInNumber {
	
	public void numones(int input) {
	    int num = 0;
	    do {
	        num += input % 2;
	        input = input / 2;
	       
	    } while (input > 0);
	    
	    System.out.println(num);
	 }

	public static void main(String[] args) {

       int a = 37;
       CountOnesInNumber c= new CountOnesInNumber();
       c.numones(a);
       
      /*  
       128 64 32 16 8 4 2 1
        int orig = a;
        int count = 0;
        while(a>0)
        {
            a = a >> 1 << 1;
            System.out.println("orig="+ orig);
            System.out.println("a="+ a);
            
            if(orig-a==1)
                count++;
            orig = a >> 1;
            System.out.println("orig="+ orig);            
            a = orig;
            
        }
        System.out.println("Number of 1s are: "+count); */
	}

}
