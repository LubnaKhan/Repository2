
public class FloorDoor 
{
	int status;	// 1=>Open , 0=>Close
	Floor floor;
	
	FloorDoor(Floor floor)
	{
		this.floor=floor;
		status=0;
	}
	
	public void displayStatus(int status)
	{
		if(status==1)
			System.out.println("\nFloor Door Opens..."); 
		else
			System.out.println("\nFloor Door Closes...");	
	}
	
	int getStatus()
	{
		return status;
	}
}
