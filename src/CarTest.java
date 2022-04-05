import java.util.Scanner;
public class CarTest {

	public static void main(String[] args) {
		boolean quit=false;
		String toQuit;
		String maker;
		int speed,year=0;
		Scanner scan =new Scanner(System.in);
		
		Car car=new Car(0," ",0);
		
		while (!quit)
		{
			System.out.println("Please enter the Car Maker,Year,Speed: ");
			maker=scan.next();
			year=scan.nextInt();
			speed=scan.nextInt();
			
			car.getMaker();
			car.getYear();
			car.getSpeed();
			scan.nextLine();
			
			System.out.println("Here's the data you provided: "+car);
			System.out.println("Press 'Q' to quit or any to continue ");
			toQuit=scan.next();
            
			if (toQuit.equalsIgnoreCase("Q"))
				quit=true;
		}
		scan.close();
		car.quitScanner();
		System.out.println("Get out!");
	}

}
