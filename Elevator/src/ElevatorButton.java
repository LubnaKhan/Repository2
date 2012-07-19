
public class ElevatorButton 
{
	int status;	// 1=> pressed 0=> not pressed
	int value;  // 0 to totalFloors-1
	
	public void press(int source)
	{
		status=1;
		System.out.println("\nElevator Button: "+value+" pressed from Floor-"+source+"\n");
	}
	
	public void displayElevButtStatus(int status)
	{
		if(status==1)
			System.out.println("Elevator Button Pressed!");	
	}
}
