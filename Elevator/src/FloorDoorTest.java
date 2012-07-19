import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FloorDoorTest 
{
	Floor floor;
	FloorDoor floorDoor;
	Building b=new Building("Dempo Towers",7);
	
	@Before
	public void setUp() throws Exception 
	{
		floor=new Floor(3,b);
		floorDoor=new FloorDoor(floor);
		assertEquals(0,floorDoor.getStatus());
	}

	@Test
	public void test() 
	{
		//fail("Not yet implemented");
	}

}
