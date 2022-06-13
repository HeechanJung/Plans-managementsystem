package manage;

import java.io.Serializable;
import java.util.Scanner;

import Exception.WeekException1;

public abstract class Planner implements Plannerinput, Serializable {
	protected PlanKind kind = PlanKind.Everyday;

	public PlanKind getKind() {
		return kind;
	}

	public void setKind(PlanKind kind) {
		this.kind = kind;
	}

	protected String plannerid;
	protected String yearplan;
	protected String Monthplan;
	protected String weekplan;
	protected String dailyplan;

	public Planner() {

	}

	public Planner(PlanKind kind) {
		this.kind = kind;
	}

//	public Planner(String yearplan,String Monthplan) {
//		this.yearplan=yearplan;
//		this.Monthplan=Monthplan;
//	}

	public Planner(String plannerid, String yearplan, String Monthplan, String weekplan, String dailyplan) {
		this.yearplan = yearplan;
		this.Monthplan = Monthplan;
		this.weekplan = weekplan;
		this.dailyplan = dailyplan;
		this.plannerid = plannerid;

	}

	public abstract void printInfo();

	public String getPlannerid() {
		return plannerid;
	}

	public void setPlannerid(String plannerid) {
		this.plannerid = plannerid;
	}

	public String getYearplan() {
		return yearplan;
	}

	public void setYearplan(String yearplan) {
		this.yearplan = yearplan;
	}

	public String getMonthplan() {
		return Monthplan;
	}

	public void setMonthplan(String monthplan) {
		Monthplan = monthplan;
	}

	public String getWeekplan() {
		return weekplan;
	}

	public void setWeekplan(String weekplan) throws WeekException1 {
		System.out.println("aaaaaaaa : " + weekplan);
		if (!weekplan.contains("p")) {
			System.out.println("Incorrect Week plan. Put the weekplan that contains p or CH");
			throw new WeekException1();
		}
		this.weekplan = weekplan;
	}

	public String getDailyplan() {
		return dailyplan;
	}

	public void setDailyplan(String dailyplan) {
		this.dailyplan = dailyplan;
	}

	public void setPlanneryear(Scanner input) {
		System.out.println("Year plan: ");
		String year = input.nextLine();
		this.setYearplan(year);
	}

	public void setPlannermonth(Scanner input) {
		System.out.println("Month plan: ");
		String month = input.nextLine();
		this.setMonthplan(month);
	}

	public void setPlannnerweek(Scanner input) {

		String weekplan = "";
		while (!(weekplan.contains("p") && weekplan.contains(""))) {
			System.out.println("Week plan: ");
			weekplan = input.next();

			try {
				this.setWeekplan(weekplan);
			} catch (WeekException1 e) {
				System.out.println("Incorrect Week plan. Put the weekplan that contains p or CH");
			}
		}
	}

	public void setPlannerdaily(Scanner input) {
		System.out.println("Daily plan: ");
		String daily = input.nextLine();
		this.setDailyplan(daily);
	}

}
