import java.util.Scanner;

public class Exam extends Planner implements Plannerinput {
	public Exam(PlanKind kind) {
		super(kind);
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
		
//		System.out.print("Daily Plan: ");
//		String dailyplan=input.next();
//		this.setDailyplan(dailyplan);
//		
		char answer='x';
		while(answer != 'y' && answer !='Y' && answer !='n' && answer !='N')
		{
			System.out.print("Do you have an daily plan? (Y/N)");
			answer=input.next().charAt(0);
			if(answer=='y'||answer=='Y') {
				System.out.print("Daily Plan:");
				String dailyplan=input.next();
				this.setDailyplan(dailyplan);
				break;
			}
			else if (answer=='n'||answer=='N') {
				this.setDailyplan(dailyplan);
				break;
			}
			else {
		}
	}

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
