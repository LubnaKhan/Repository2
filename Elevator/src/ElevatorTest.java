import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ElevatorTest {

	Elevator elev;
	
	@Before
	public void setUp() throws Exception 
	{
		Building b1=new Building("Dempo Towers",7);
		elev=new Elevator(b1);
	}

	@Test
	public void testElevator() 
	{
		assertEquals(0,elev.getCurrentFloor());
		assertEquals(0,elev.getElevDirection());
	}

	
	@Test
	public void testMoveElevator() 
	{
		elev.moveElevator(3,5);
		assertEquals(1,elev.getElevDirection());
	}

	@Test
	public void testGotoFloor() {
		//fail("Not yet implemented");
	}

}
