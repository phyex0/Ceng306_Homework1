
public class Car {
	public Door doors[];
	public ControlPanel controlPanel;
	
	Car(Door doors[], ControlPanel controlPanel)
	{
		this.doors = doors;
		this.controlPanel = controlPanel;
	}
	
	boolean isOpen()
	{
		for(Door d:doors)
			if(d.isLocked())
				return false;
		return true;
	}
	
	ControlPanel getControlPanel()
	{
		if(isOpen())
			return controlPanel;
		return null;
	}
	
}
