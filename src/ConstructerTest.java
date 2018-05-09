import java.io.IOException;


public class ConstructerTest extends ClassB{
	
	ConstructerTest()
	{
		System.out.println("Default ConstructerTest");
	}
	
	public ConstructerTest(int i)
	{
		super(i);
		System.out.println("ConstructerTest  i:"+ i);
	}
	
	/* public Exception m1(){
		System.out.println("Constructor class m1");
		return new Exception();
	} */
	
	public static void main(String[] args) throws IOException
	{
		ConstructerTest ct=	new ConstructerTest();
		ClassB	b=	new ClassB(5);
		ClassA	a=	new ConstructerTest(6);
		ClassA  a1=	new ClassB(7);
		ClassA  a2=	new ClassA(9);
		
		a2.m1();
		
		b = ct;		
		b.m1();
		
		a2 = ct;
		a2.m1();
		
		a2 = b;
		a2.m1();
		
		
		
		
	}

}


