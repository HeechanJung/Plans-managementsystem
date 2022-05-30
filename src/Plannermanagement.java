import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Exception.WeekException;

public class Plannermanagement {
	ArrayList<Plannerinput> list= new ArrayList<Plannerinput>();
	
	Planner planner;
	Scanner input;
	Plannermanagement(Scanner input){
		this.input=input;
	}
	public void addPlans() {
		
		int kind=0;
		Plannerinput Plannerinput = null;
		while (kind <1 || kind >3 ) {
			try {
			System.out.println("1 for Everyday");
			System.out.println("2 for Exam");
			System.out.println("3 for Promission");
			System.out.print("Select num for 1, 2, or 3 for Plan Kind:");
			kind=input.nextInt();
			if(kind==1) {
				Plannerinput =new Everyday(PlanKind.Everyday);
				Plannerinput.getUserInput(input);
				list.add(Plannerinput);
				break;
			}
			else if(kind==2) {
				Plannerinput =new Exam(PlanKind.Exam);
				Plannerinput.getUserInput(input);
				list.add(Plannerinput);
				break;
			}
			else if(kind==3) {
				Plannerinput =new promission(PlanKind.Promission);
				Plannerinput.getUserInput(input);
				list.add(Plannerinput);
				break;
			}
			else {
				System.out.println("Select num for Plan Kind between 1 and 2:");
			}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				kind=-1;
			}
		}
		//Planner planner = new Planner();
//	System.out.print("Year Plan: ");
//	
//	Plannerinput.setYearplan(input.next());
//	System.out.print("Month Plan: ");
//	Plannerinput.setMonthplan(input.next());
//	System.out.print("Week Plan: ");
//	try {
//		Plannerinput.setWeekplan(input.next());
//	} catch (WeekException e) {
//		System.out.println("Incorrect Week plan. Put the weekplan that contains p");
//	}
//	System.out.print("Daily Plan: ");
//	Plannerinput.setDailyplan(input.next());
//	Plannerinput.printInfo();
//	list.add((Plannerinput) planner);
//	System.out.println(list.size());
		Plannerinput.printInfo();
}

public void deletePlans() {
	
	System.out.print("Year Plan: ");
	String yearplan=input.next();
	int index=-1;
	for(int i=0;i<list.size();i++) {
		if(list.get(i).getYearplan()==yearplan) {
			index=i;
			break;		}
		}
	if(index>=0) {
		list.remove(index);
		System.out.println("The planner"+yearplan+"is deleted.");
	}
	else {
		System.out.println("The planner has not been registered.");
		return;
	}

}
public void editPlans() {
	
	System.out.print("Year Plan: ");
	String yearplan=input.next();
	for(int i=0;i<list.size(); i++) {
		Plannerinput plannerinput=list.get(i);
	
	if(planner.yearplan==yearplan) {
		int num=-1;
		while (num !=5) {
			System.out.println("1.Add Plans");
			System.out.println("2.Delete Plans");
			System.out.println("3.Edit Plans");
			System.out.println("4.View Plans");
			System.out.println("5.Exit");
			System.out.println("Select one number between 1-5 ");
			num=input.nextInt();
			input.nextLine();
			if (num==1) {
				planner.yearplan=input.nextLine();
			}
			else if (num==2) {
				planner.Monthplan=input.nextLine();
			}
			else if (num==3) {
				planner.weekplan=input.nextLine();
				}
			else if (num==4) {
				planner.dailyplan=input.nextLine();
			}
			else {
				continue;
			}
		
	}
	break;
	}
	}
	

}
public void viewPlans() { 
System.out.print("Year Plan: ");
String yearplan=input.next();
for(int i=0;i<list.size(); i++) {
	yearplan =list.get(i).getYearplan();
	if(yearplan.equals(yearplan)) {
		list.get(i).printInfo();
		break;
	}
	
	
}
	
}
}
