
public class ElevatorDoor 
{
	Elevator e;
	int status;	// 1=>Open , 0=>Close
	
	ElevatorDoor(Elevator e)
	{
		this.e=e;
		status=0;
	}
	
	public void displayStatus(int status)
	{
		if(status==1)
			System.out.println("Elevator Door Opens...");
		else
			System.out.println("Elevator Door Closes...");	
	}
}
