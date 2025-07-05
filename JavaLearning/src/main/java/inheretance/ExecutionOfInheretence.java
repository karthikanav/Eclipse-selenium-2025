package inheretance;

public class ExecutionOfInheretence {

	public static void main(String[] args) {
		
		Car maruthi=new Car();
		maruthi.noOfSeats();//from car
		maruthi.applyGear();// from vehicle
		maruthi.noOfWheels();// from car
		maruthi.soundHorn();//from vehicle
		
		System.out.println("***************");
		
		
		BMW bmw=new BMW();
		bmw.openRoof();// from BMW
		bmw.applyGear();// from vehicle
		bmw.soundHorn();// from vehicle
		
		
	

	}

}
