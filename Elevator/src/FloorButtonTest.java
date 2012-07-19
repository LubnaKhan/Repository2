import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FloorButtonTest
{
	Building b1=new Building("Dempo Towers",7);
	Floor floor;
	FloorPanel fp;
	FloorButton floorButton;
	
	@Before
	public void setUp() throws Exception 
	{
		floor=new Floor(3,b1);
		fp=new FloorPanel(floor);
		floorButton=new FloorButton(fp);
	}

	@Test
	public void testFloorButton() 
	{
		assertEquals(0,floorButton.getStatus());
	}

}
