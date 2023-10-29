package MultipleInheritanceDemo;

public class ChildHouse implements FatherHouse ,motherHouse

{
 public void pulsurBike() {
	 System.out.println("this is  son's pulsur bike");	 
 }
 public void royalEnfield()
 {
	 System.out.println("This is son's Royal enfield bike");
 }

public void audiCar() {
	// TODO Auto-generated method stub
	System.out.println("this is father car");
}
@Override
public void porchesCar() {
	// TODO Auto-generated method stub
	System.out.println("this is fathers porches car");
	
	
}
public void jewelSet() {
	// TODO Auto-generated method stub	
		System.out.println("this is mother jewel");
}
 public static void main(String[] args) {
	 ChildHouse c= new ChildHouse();
	 c.audiCar();
	 c.porchesCar();
	 c.pulsurBike();
	 c.royalEnfield();
	 c.jewelSet();
}
}

