import java.util.ArrayList;

public class Building 
{
	Elevator e1;
	String buildingName;
	int totalFloors;
	ArrayList<Floor> floors=new ArrayList<Floor>();	//ASK: Can i write this new thing(allocate mem for floors) in the constr? n not here?
	
	public Building(String name,int totFloors)
	{
		buildingName=name;
		totalFloors=totFloors;
		for(int i=0;i<totalFloors;i++)
		{
			floors.add(new Floor(i,this));	//Adding floors one by one to the ArrayList floors  
		}
		System.out.println("\nBuilding:"+buildingName+" created with "+totFloors+" floors\n");
	}
		
	public void displayBuilding()
	{
		System.out.println("Name: "+ buildingName+"\nFloors: "+totalFloors);
	}
	
	void addElevator()
	{
		e1=new Elevator(this);
	}

	Floor getFloor(int floorNo)
	{
		return floors.get(floorNo);
	}
	
	Elevator getElevator()
	{
		return e1;
	}
	
	int getTotalFloors()
	{
		return totalFloors;
	}
}

