//ASK: In this, shud there be Elevator & Building objects? 

public class Floor 
{
	Building b1;
	int floorNo;
	FloorDoor fd;
	FloorPanel fp;
	
	Floor(int floorNo,Building b)
	{
		this.floorNo=floorNo;	
		b1=b;
		fd=new FloorDoor(this);
		fp=new FloorPanel(this);
		System.out.println("Floor-"+floorNo+" created");
	}
	
	void displayFloor()
	{
		System.out.println("\nYou are on Floor: "+floorNo);
	}
	
	FloorPanel getFloorPanel()
	{
		return fp;
	}
	
	FloorDoor getFloorDoor()
	{
		return fd;
	}
	
	int getFloorNo()
	{
		return floorNo;
	}
}
