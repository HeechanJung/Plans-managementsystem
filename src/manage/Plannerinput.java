import java.util.Scanner;

import Exception.WeekException;

public interface Plannerinput {
	
	public void getUserInput(Scanner input);
	public String getYearplan();
	public void setYearplan(String yearplan);
	public void setMonthplan(String monthplan);
	public void setWeekplan(String weekplan) throws WeekException;
	public void setDailyplan(String dailyplan);
	public void printInfo();
	public void setPlanneryear(Scanner input);
	public void setPlannermonth(Scanner input);
	public void setPlannnerweek(Scanner input);
	public void setPlannerdaily(Scanner input);

}
