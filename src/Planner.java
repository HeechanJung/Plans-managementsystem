import java.util.Scanner;

public abstract class Planner {
	protected PlanKind kind=PlanKind.Everyday;
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
		this.kind=kind;
	}
	
//	public Planner(String yearplan,String Monthplan) {
//		this.yearplan=yearplan;
//		this.Monthplan=Monthplan;
//	}
	
	public Planner(String plannerid,String yearplan,String Monthplan,String weekplan,String dailyplan) {
		this.yearplan=yearplan;
		this.Monthplan=Monthplan;
		this.weekplan=weekplan;
		this.dailyplan=dailyplan;
		this.plannerid=plannerid;
		
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

	public void setWeekplan(String weekplan) {
		this.weekplan = weekplan;
	}

	public String getDailyplan() {
		return dailyplan;
	}

	public void setDailyplan(String dailyplan) {
		this.dailyplan = dailyplan;
	}

	


	
}
