
public class ElevatorLightIndicator 
{
	ElevatorPanel ep;
	
	ElevatorLightIndicator(ElevatorPanel ep)
	{
		this.ep=ep;
	}
	
	public void displayCurrentFloor(int currFloor)
	{
		System.out.println("Current Floor: "+currFloor);
	}
}
