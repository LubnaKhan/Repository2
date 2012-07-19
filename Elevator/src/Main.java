public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("\n\t\t\t\t\t\tELEVATOR SIMULATION\n");
		
		Building b1=new Building("Dempo Towers",7);
		
		b1.addElevator();
		
		b1.e1.gotoFloor(3,5);
		b1.e1.gotoFloor(2,0);
		b1.e1.gotoFloor(6,3);
		b1.e1.gotoFloor(0,6);
		b1.e1.gotoFloor(6,0);
		b1.e1.gotoFloor(5,7);
		b1.e1.gotoFloor(5,5);
	}

}
