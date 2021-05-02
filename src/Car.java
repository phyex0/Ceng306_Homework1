//Halit Burak Yeşildal 18050111043
public class Car {
	public Door doors[];
	private ControlPanel controlPanel;
	
	Car(Door doors[], ControlPanel controlPanel)
	{
		this.doors = doors;
		this.controlPanel = controlPanel;
	}
	
	boolean isOpen()
	{	if(doors==null || doors.length==0)
			return false;
		for (Door d : doors)
			if (d==null || d.isLocked())
				return false;

		return true;
	}
	
	ControlPanel getControlPanel()
	{
		if(isOpen())
			return controlPanel;
		return null;
	}

	public void setControlPanel(ControlPanel controlPanel) {
		this.controlPanel = controlPanel;
	}

}
