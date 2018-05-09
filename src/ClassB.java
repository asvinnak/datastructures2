

public class ClassB extends ClassA{
	
	public ClassB()
	{
		System.out.println("Default ClassB");
	}
	
	public  ClassB(int i)
	{	
		//super(i);
		System.out.println(" Class B   i"+ i);
	}

	public Exception m1()
	{
		System.out.println(" Class B    m2");
		return new Exception();
	}
}
