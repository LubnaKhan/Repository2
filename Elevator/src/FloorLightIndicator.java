
public class FloorLightIndicator
{	
	FloorPanel fp;
	
	FloorLightIndicator(FloorPanel fp)
	{
		this.fp=fp;
	}
	
	public void displayElevDirection(int elevDirection)
	{
		if(elevDirection==0)
			System.out.println("Elevator Waiting...");
		if(elevDirection==1)
			System.out.println("Elevator Going Up...");
		if(elevDirection==2)
			System.out.println("Elevator Going Down...");
	}
	
}
