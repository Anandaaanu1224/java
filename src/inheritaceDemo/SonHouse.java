package inheritaceDemo;


	public class SonHouse extends parenthouse
	{
	 public void royalEnfield()
	 {
		 System.out.println("This is son's Royal enfield bike");
	 }
	 public void pulsurBike()
	 {
		 System.out.println("This is Son's pulsur bike ");
	 }
	 public static void main(String[] args) {
		 SonHouse s = new SonHouse();
		 s.royalEnfield();
		 s.pulsurBike();
		 s.audiCar();
		 s.porchesCar();
		 s.BiCycle();
	 }

	}

