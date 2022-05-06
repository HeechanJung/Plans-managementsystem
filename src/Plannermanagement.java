import java.util.ArrayList;
import java.util.Scanner;

public class Plannermanagement {
	ArrayList<Planner> list= new ArrayList<Planner>();
	
	Planner planner;
	Scanner input;
	Plannermanagement(Scanner input){
		this.input=input;
	}
	public void addPlans() {
		
		int kind=0;
		while (kind !=1 && kind !=2 ) {
			System.out.print("1 for Hobby");
			System.out.print("2 for Exam");
			System.out.print("3 for Promission");
			System.out.print("Select num for Plan Kind between 1 and 2:");
			kind=input.nextInt();
			if(kind==1) {
				planner =new Planner(PlanKind.Hobby);
				planner.getUserInput(input);
				list.add(planner);
				break;
			}
			else if(kind==2) {
				planner =new Exam(PlanKind.Exam);
				planner.getUserInput(input);
				list.add(planner);
				break;
			}
			else if(kind==3) {
				planner =new promission(PlanKind.Promission);
				planner.getUserInput(input);
				list.add(planner);
				break;
			}
			else {
				System.out.println("Select num for Plan Kind between 1 and 2:");
			}
		}
		Planner planner =new Planner();
	System.out.print("Year Plan: ");
	planner.yearplan=input.next();
	System.out.print("Month Plan: ");
	planner.Monthplan=input.next();
	System.out.print("Week Plan: ");
	planner.weekplan=input.next();
	System.out.print("Daily Plan: ");
	planner.dailyplan=input.next();
	planner.printInfo();
	list.add(planner);
	System.out.println(list.size());
	
}

public void deletePlans() {
	
	System.out.print("Year Plan: ");
	String yearplan=input.next();
	int index=-1;
	for(int i=0;i<list.size();i++) {
		if(list.get(i).yearplan==yearplan) {
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
		Planner planner=list.get(i);
	
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
	yearplan =list.get(i).yearplan;
	if(yearplan.equals(yearplan)) {
		list.get(i).printInfo();
		break;
	}
	
	
}
	
}
}
