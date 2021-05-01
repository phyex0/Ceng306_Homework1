
public class Key {
	private Lock lock;

	Key(Lock lock)
	{
		this.lock=lock;
	}
	
	boolean isValidLock(Lock lock)
	{
		return this.lock.codeMatches(lock);
	}
}
