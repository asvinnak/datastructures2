
public class B extends A{
	
	int x=0;
	int y=0;
	
	
	public B(String name) {
		super(name);
	}


	

	public int add(int x,int y)
	{
		System.out.println("B");
		return x+y;
	}

}
