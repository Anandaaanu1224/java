package AbstractClassDemo;


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
		 public void porchesCar() {

			System.out.println("this is father's porches car on son");

		}
		 public static void main(String[] args) {
			 SonHouse s = new SonHouse();
			 s.royalEnfield();
			 s.pulsurBike();
			 s.audiCar();
			 s.porchesCar();
		 }

	}

