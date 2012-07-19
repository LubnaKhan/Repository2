
public class FloorPanel 
{
	Floor floor;
	FloorButton upButton;
	FloorButton downButton;
	FloorLightIndicator floorLight;
	
	public FloorPanel(Floor floor)
	{
		this.floor=floor;
		floorLight=new FloorLightIndicator(this);
		
		// Ground Floor has no Down Button
		if(floor.floorNo==0)
		{
			upButton=new FloorButton(this);
			upButton.status=0;
		}
		
		// Topmost Floor has no Up Button
		else if(floor.floorNo==floor.b1.totalFloors-1)
		{
			downButton=new FloorButton(this);
			downButton.status=0;
		}
		
		else
		{
			upButton=new FloorButton(this);
			downButton=new FloorButton(this);
			upButton.status=0;
			downButton.status=0;
		}
	}

	FloorButton getUpButton()
	{
		return upButton;
	}
	
	FloorButton getDownButton()
	{
		return downButton;
	}
	
	FloorLightIndicator getFloorLightIndicator()
	{
		return floorLight;
	}
}
