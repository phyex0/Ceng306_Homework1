
public class CarFactory {

	ConcreteCar produce()
	{
		Lock lock = new Lock();
		Door carDoor = new Door(lock);
		Key carKey = new Key(lock);
		
		Door doors[] = {carDoor};		
		final double peelMaximumSpeed = 75.0;
		ControlPanel controlPanel = new ControlPanel(peelMaximumSpeed);

		Car car = new Car(doors, controlPanel);		
		
		ConcreteCar createdCar = new ConcreteCar(car, carKey);
		
		return createdCar;		
	}
}

class ConcreteCar {
	final Car car;
	final Key key;
	
	ConcreteCar(Car car, Key key)
	{
		this.car = car;
		this.key = key;
	}
}
