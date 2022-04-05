import java.util.Scanner;

public class Plannermanagement {
	Planner planner;
	Scanner input;
	Plannermanagement(Scanner input){
		this.input=input;
	}
	public void addPlans() {
		planner=new Planner();
	System.out.print("Year Plan: ");
	planner.yearplan=input.next();
	System.out.print("Month Plan: ");
	planner.Monthplan=input.next();
	System.out.print("Week Plan: ");
	planner.weekplan=input.next();
	System.out.print("Daily Plan: ");
	planner.dailyplan=input.next();
}

public void deletePlans() {
	
	System.out.print("Year Plan: ");
	String yearplan=input.next();
	if(planner==null) {
		System.out.println("The planner has not been registered.");
		return;
	}
	if(planner.yearplan==yearplan) {
		planner=null;
		System.out.println("The planner is deleted.");
		
	}
	
}
public void editPlans() {
	
	System.out.print("Year Plan: ");
	String yearplan=input.next();
	if(planner.yearplan==yearplan) {
		System.out.println("The planner to be edited is"+yearplan);
		
	}
	 

}
public void viewPlans() { 
System.out.print("Year Plan: ");
String yearplan=input.next();
if(planner.yearplan==yearplan) {
	planner.printInfo();
   }
  }
	
}
