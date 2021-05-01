
public class ControlPanel {
	final double maximumSpeed;
	private boolean running = false;
	private double speed = 0.0;
	private double orientation = 0.0;
	
	ControlPanel(double maximumSpeed)
	{
		this.maximumSpeed = maximumSpeed;
	}
	
	CarState getCarState()
	{
		return new CarState(maximumSpeed, running, speed, orientation);
	}
	
	void turnOnEngine()
	{
		running = true;
	}

	void turnOffEngine()
	{
		running = false;
	}
	
	boolean isRunning()
	{
		return running;
	}
	
	double getSpeed()
	{
		return speed;
	}
	
	double getMaximumSpeed()
	{
		return maximumSpeed;
	}
	
	double getSteeringWheelOrientation()
	{
		return orientation;
	}
	
	// Brake pedal: Used to slow down the car
	double pushBrakePedal(double pressure)
	{
		final double currentSpeed = speed;
		
		if (isRunning()) { 	
			final double slowDownRate = 1.0;
			speed = Math.max(speed - slowDownRate * pressure, 0.0);
		}
		
		return (speed - currentSpeed);
	}
	
	// Accelerator: Used to speed up the car
	double pushAccelerator(double pressure)
	{
		final double currentSpeed = speed;
		
		if (isRunning()) { 	
			final double accelerationRate = 5.0;
			speed = Math.min(speed + accelerationRate * pressure, maximumSpeed);
		}
		
		return (speed - currentSpeed);		
	}	
	
	// Steering wheel: You use the steering wheel to control the direction of the car (steer the car)
	double useSteeringWheel(double angle)
	{
		final double currentOrientation = orientation;
		
		if (isRunning()) { 
			orientation = Math.min(Math.max(orientation + angle, -1.0), 1.0);
		}
		
		return (orientation - currentOrientation);
	}
	
	@Override
	public String toString()
	{
		return "Control Panel of the Peel";
	}

}
