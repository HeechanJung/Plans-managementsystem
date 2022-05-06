import java.util.Scanner;

public class Planner {
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
	 
	
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Hobby:
			skind = "hobby";
			break;
		case Exam:	
			skind = "exam";
			break;
		case Promission:
			skind= "promission";
			break;
		case Everyday:
			skind= "everyday";
		default:	
		}
		
		System.out.println("kind:"+skind+"yearplan:"+yearplan+"Monthplan"+Monthplan+"weekplan"+weekplan+"dailyplan"+dailyplan);
		
	}

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

	public void getUserInput(Scanner input) {
		System.out.print("Year Plan: ");
		String yearplan=input.next();
		this.setYearplan(yearplan);
		
		System.out.print("Month Plan: ");
		String Monthplan=input.next();
		this.setMonthplan(Monthplan);
		
		System.out.print("Week Plan: ");
		String weekplan=input.next();
		this.setWeekplan(weekplan);
		
		System.out.print("Daily Plan: ");
		String dailyplan=input.next();
		this.setDailyplan(dailyplan);
	}


	
}
