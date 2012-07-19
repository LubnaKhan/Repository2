 
public class FloorButton 
{
	FloorPanel fp;
	int status; // 1=> pressed, 0=> not pressed
	String value; // values: "Up", "Down"				
	
	public FloorButton(FloorPanel fp)
	{
		this.fp=fp;
		status=0;
	}
	
	public void press(int source)
	{
		status=1;
		System.out.println("\nFloor Button: "+value+" pressed from Floor-"+source+"\n");
	}
	
	public void displayFloorButtStatus(int status)
	{
		if(status==1)
			System.out.println("Floor Button Pressed!");
	}
	
	int getStatus()
	{
		return status;
	}
}
