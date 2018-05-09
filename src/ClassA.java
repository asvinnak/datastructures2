

public class ClassA {
	
	public ClassA()
	{
		System.out.println("Default Class A");
	}
	
		
	public ClassA(int i)
	{		
		System.out.println(" Class A   i"+ i);
	}
	public Exception m1()
	{
		System.out.println(" Class A    m1");
		return new Exception();
	}

}
