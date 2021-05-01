
public class Door {
	private Lock lock;
	private boolean locked = true;

	Door(Lock lock)
	{
		this.lock = lock;
	}
	
	boolean isLocked()
	{
		return locked;
	}
	
	boolean lock(Key key)
	{
		if(lock!= null && key!=null && key.isValidLock(lock)){
			locked=true;
			return true;
		}

		return false;
	}

	boolean unlock(Key key)
	{
		if(lock!= null && key!=null && key.isValidLock(lock)){
			locked=false;
			return true;
		}

		return false;
	}

	public Lock getLock() {
		return lock;
	}

	public void setLock(Lock lock) {
		this.lock = lock;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}
}
