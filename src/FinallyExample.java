import java.io.IOException;


public class FinallyExample {
	
	public void execute(boolean b)
	{
		
		try
		{
			if(b)
			{
				System.out.println("executed success");
			}
			else
			{
				throw new IOException();
			}
			
		}
		catch(Exception e)
		{
			System.out.println("exception occured");
			e.printStackTrace();
			//System.exit(1);
		}
		
		finally
		{
			System.out.println("executing finally");
		}
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FinallyExample f= new FinallyExample();
		f.execute(false);
	}

}
