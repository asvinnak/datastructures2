import java.io.IOException;


public class ClassC extends ClassB{
	
	public ClassC()
	{
		System.out.println("Default Class C");
	}
	
	public ClassC(int i)
	{	
		super(i);
		System.out.println(" Class C   i"+ i);
	}


	public ClassB m1(String s)
	{
		System.out.println(" Class B    m2");
		return new ClassB();
	}
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ClassC c = new ClassC(2);
		//ClassB b = new ClassB(3);
		//ClassA a = new ClassA(4);
		
		
		
		//b =  (ClassB) a;
		
		//System.out.println(b.m1());
		
		//a = b;
		
		//System.out.println(a.m1());
		
		System.out.println(c.m1());
		
	}

}
