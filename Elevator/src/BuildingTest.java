import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BuildingTest 
{
	Building b1;
	
	@Before
	public void setUp() throws Exception 
	{
		b1=new Building("Dempo Towers",6);
	}

	@Test
	public void testBuilding() 
	{
		assertEquals(6,b1.getTotalFloors());
	}

	@Test
	public void testGetFloor() 
	{
		Floor floor=new Floor(5,b1);
		assertSame(floor.getFloorNo(),b1.getFloor(5).getFloorNo());
	}

}

