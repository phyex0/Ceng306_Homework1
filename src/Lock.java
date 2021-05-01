import java.util.Random;

public class Lock {
	static int lockCounter = 0;
	int code;

	Lock()
	{	
		Random r = new Random();
		code = r.nextInt();
		lockCounter++;
	}
	
	boolean codeMatches(Lock lock)
	{
		return this.code == lock.code;
	}
	
}
