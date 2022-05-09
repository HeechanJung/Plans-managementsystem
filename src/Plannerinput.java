import java.util.Scanner;

public interface Plannerinput {
	
	public void getUserInput(Scanner input);
	public String getYearplan();
	public void setYearplan(String yearplan);
	public void setMonthplan(String monthplan);
	public void setWeekplan(String weekplan);
	public void setDailyplan(String dailyplan);
	public void printInfo();

}
