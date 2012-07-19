import java.util.ArrayList;

public class ElevatorPanel 
{
	Elevator e1;
	ElevatorLightIndicator elevatorLight;
	int totalButtons;	// totalFloors + any extra buttons(fan, light)								
	ArrayList<ElevatorButton> elevatorButtons=new ArrayList<ElevatorButton>();
	
	ElevatorPanel(Elevator e, int totalFloors)
	{
		e1=e;
		elevatorLight=new ElevatorLightIndicator(this);
		totalButtons=totalFloors;	//Later: +2 (fan, light)
		for(int i=0;i<totalButtons;i++)
		{
			elevatorButtons.add(new ElevatorButton());	//Adding buttons one by one to the Elevator Panel
		}
	}
	
	ElevatorLightIndicator getElevatorLightIndicator()
	{
		return elevatorLight;
	}
	
	ElevatorButton getElevatorButton(int floorNo)
	{
		return elevatorButtons.get(floorNo);
	}
}
