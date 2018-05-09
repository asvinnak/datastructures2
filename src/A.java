
public class A {
	
	StringBuilder name;
	
	
	public A(String name) {
		this.name= new StringBuilder(name);
		
	}
	
	public int add(int x,int y)
	{
		System.out.println("A");
		return x+y;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args) {
		
		A a= new A("Aswani");
		A b= new A("Aswani");
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		
	}

}

