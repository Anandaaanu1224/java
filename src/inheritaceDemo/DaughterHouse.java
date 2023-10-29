package inheritaceDemo;

public class DaughterHouse extends parenthouse
{
  public void scootyPep() {
	  System.out.println("this is daughter's bike");
  }
  public void vespa()
  {
	  System.out.println("this is daughter vespa bike");
  }
  public static void main(String[] args) {
	  DaughterHouse d = new DaughterHouse();
	  d.scootyPep();
	  d.vespa();
	  d.audiCar();
	  d.porchesCar();
	  d.BiCycle();
  }
}
