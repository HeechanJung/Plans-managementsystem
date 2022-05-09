import java.util.Scanner;

public class Everyday extends Planner implements Plannerinput {
	public Everyday(PlanKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.println("Year Plan: ");
		String yearplan=input.next();
		this.setYearplan(yearplan);
		
		System.out.println("Month Plan: ");
		String Monthplan=input.next();
		this.setMonthplan(Monthplan);
		
		System.out.println("Week Plan: ");
		String weekplan=input.next();
		this.setWeekplan(weekplan);
		
		System.out.println("Daily Plan: ");
		String dailyplan=input.next();
		this.setDailyplan(dailyplan);
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


}