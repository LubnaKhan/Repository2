//ASK: Shud there be Floor & FloorDoor objects?

public class Elevator 
{
	Building b1;
	ElevatorPanel ep;
	ElevatorDoor ed;
	int currentFloor;	// Elevator's current position
	int elevDirection;	// 0=>Stationary, 1=>Up, 2=>Down
	static int count=0;
	
	public Elevator(Building building)
	{
		b1=building;
		ep=new ElevatorPanel(this,b1.totalFloors);					
		ed=new ElevatorDoor(this);
		currentFloor=0;	 //Assuming Ground Floor is 0.
		elevDirection=0; //Initially stationary.
		System.out.println("Elevator created");
	}
	
	ElevatorDoor getElevatorDoor()
	{
		return ed;
	}
	
	ElevatorPanel getElevatorPanel()
	{
		return ep;
	}
	
	int getCurrentFloor()
	{
		return currentFloor;
	}
	
	int getElevDirection()
	{
		return elevDirection;
	}
	
	void moveElevator(int source, int destination)
	{
		if(source<destination)
		{
			elevDirection=1; // Up
			b1.getFloor(source).getFloorPanel().getFloorLightIndicator().displayElevDirection(elevDirection);
			for(int i=source;i<=destination;i++)
			{
				b1.getElevator().getElevatorPanel().getElevatorLightIndicator().displayCurrentFloor(i);		
				currentFloor=i;
			}
		}
		else if(source>destination)
		{
			elevDirection=2; // Down
			b1.getFloor(source).getFloorPanel().getFloorLightIndicator().displayElevDirection(elevDirection);
			for(int i=source;i>=destination;i--)
			{
				b1.getElevator().getElevatorPanel().getElevatorLightIndicator().displayCurrentFloor(i);
				currentFloor=i;
			}
		}
		System.out.println("\nReached Floor-"+destination);
		elevDirection=0; // Stationary
		b1.getFloor(destination).getFloorPanel().getFloorLightIndicator().displayElevDirection(elevDirection);
		
		// Floor Door opens
		FloorDoor floorDoor=b1.getFloor(source).getFloorDoor();
		floorDoor.status=1;	// 1 => open
		floorDoor.displayStatus(floorDoor.status);
				
		// Elevator Door opens
		ElevatorDoor elevDoor=b1.getElevator().getElevatorDoor();
		elevDoor.status=1;	// 1 => open
		elevDoor.displayStatus(elevDoor.status);
		
		// Display Passenger Movement
		if(count==0)
			System.out.println("\nPassenger walks into elevator...");
		else
			System.out.println("\nPassenger walks out of elevator...");

		count++;
		if(count==2)
			count=0;

		
		// Floor Door closes
		floorDoor.status=0; // 0 => close
		floorDoor.displayStatus(floorDoor.status);
				
		// Elevator Door closes
		elevDoor.status=0; // 0 => close
		elevDoor.displayStatus(elevDoor.status);
	}
	
	
	void gotoFloor(int source, int destination)
	{
		FloorButton floorButton;
		ElevatorButton elevButton;
		
		System.out.println("\nNEW REQUEST:\nElevator Current Position: Floor-"+currentFloor+" ;  Passenger: Floor-"+source+" -> Floor-"+destination);
		
		//Validation Check:-  Floor Range: 0 - (totalFloors-1)
		if(source<0 || destination>b1.totalFloors-1)
		{
			System.out.println("\nError Msg: Valid Floor Range: 0 to "+(b1.totalFloors-1)+" !!!");
			return;
		}
		
		
		// FLOOR BUTTON:
		if(source<destination)	
		{
			floorButton=b1.getFloor(source).getFloorPanel().getUpButton();
			floorButton.value="Up";												
			elevDirection=1;	// 1=> up
		}
		else if(source>destination)
		{
			floorButton=b1.getFloor(source).getFloorPanel().getDownButton();
			floorButton.value="Down";											
			elevDirection=2;	// 2=> down
		}
		else
		{
			System.out.println("\nError: Source & Destination same!");
			return;
		}
		floorButton.press(source);
		
		
		//Elevator moving from current floor to source floor
		if(currentFloor==source)
			System.out.println("Elevator already on Floor-"+source);
		else
			moveElevator(currentFloor, source);
		
		
		// ELEVATOR BUTTON:
		elevButton=b1.getElevator().getElevatorPanel().getElevatorButton(destination); //ASK: Y not b1.e1? Y do v need get() fnctns? (coz private?)
		elevButton.value=destination;											
		elevButton.press(source);												
		
		
		//Elevator moving from source floor to destination floor
		moveElevator(source, destination);
		
	}
}

