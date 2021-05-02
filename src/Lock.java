//Halit Burak Yeşildal 18050111043
import java.util.Random;

public class Lock {
	private static int lockCounter = 0;
	private int code;

	Lock()
	{	
		Random r = new Random();
		code = r.nextInt();
		lockCounter++;
	}
	
	boolean codeMatches(Lock lock)
	{
		return this.code == lock.getCode();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
