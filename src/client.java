
public class client {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		A a = new A();
		B b= new B();
		A c= new B();
		  
		
		B d= (B) a;
		
		
		
		a.add(2, 3);
		b.add(3, 4);
		c.add(4, 5);
		d.add(5, 6);

	}

}
