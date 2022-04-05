import java.util.Scanner;
public class Car {

	private int _year;
	private String _maker;
	private int _speed;
	Scanner scan= new Scanner(System.in);
	public Car(int year,String maker, int speed)
	{
		_year=year;
		_maker=maker;
		_speed=speed;
	}
	
	public int getYear() {return _year;}
	public String getMaker() {return _maker;}
	public int getSpeed() {return _speed;}
	
	public void quitScanner()
	{
		scan.close();
	}


	public String toString()
	{
		return _year+" "+_maker+" "+Integer.toString(_speed);
	}
	
}
