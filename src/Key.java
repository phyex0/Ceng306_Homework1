
public class Key {
	private Lock lock;

	Key(Lock lock)
	{
		this.lock=lock;
	}
	
	boolean isValidLock(Lock lock)
	{	if(lock!=null)
			return this.lock.codeMatches(lock);
		return false;
	}

	public Lock getLock() {
		return lock;
	}

	public void setLock(Lock lock) {
		this.lock = lock;
	}
}
