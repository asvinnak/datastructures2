import java.io.IOException;
import java.util.concurrent.locks.Lock;


public class DeadLockExample {
	
	public void acquireBothLocks(DeadLockExample r1, DeadLockExample r2) {
		  Lock l1, l2;
		  if (System.identityHashCode(r1) <
		      System.identityHashCode(r2)) {
		    l1 = r1.getLock(); l2 = r2.getLock();
		  } else {
		    l1 = r2.getLock(); l2 = r1.getLock();
		  }
		  l1.lock();
		  l2.lock();
		}
	
	public static void main(String args[]) throws IOException
	{
		DeadLockExample d1= new DeadLockExample();
		DeadLockExample d2= new DeadLockExample();
		d1.acquireBothLocks(d1, d2);
	}

}
