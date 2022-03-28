import java.util.Scanner;

public class Plansmanager {

	public static void main(String[] args) {
		int num=0;
		System.out.println("Input :");
		Scanner input=new Scanner(System.in);
	
		
		while (num !=6) {
			System.out.println("1.Add Plans");
			System.out.println("2.Delete Plans");
			System.out.println("3.Edit Plans");
			System.out.println("4.View Plans");
			System.out.println("5.Show Plans");
			System.out.println("6.Exit");
			System.out.println("Select one number between 1-6 ");
			num=input.nextInt();
			if (num==1) {
				addPlans();
			}
			else if (num==2) {
				deletePlans();
			}
			else if (num==3) {
				editPlans();
				}
			else if (num==4) {
				viewPlans();
			}
			else {
				continue;
			}
		}
			
	}
	public static void addPlans() {
		Scanner input=new Scanner(System.in);
		System.out.print("Year Plan: ");
		String yearplan=input.nextLine();
		System.out.println("Month Plan: ");
		String monthplan=input.nextLine();
		System.out.println("Week Plan: ");
		String weekplan=input.nextLine();
		System.out.println("Daily Plan: ");
		String dailyplan=input.nextLine();

	}
	public static void deletePlans() {
		Scanner input=new Scanner(System.in);
		System.out.print("Year Plan: ");
		String yearplan=input.nextLine();
		System.out.println("Month Plan: ");
		String monthplan=input.nextLine();
		System.out.println("Week Plan: ");
		String weekplan=input.nextLine();
		System.out.println("Daily Plan: ");
		String dailyplan=input.nextLine();

}
	public static void editPlans() {
		Scanner input=new Scanner(System.in);
		System.out.print("Year Plan: ");
		String yearplan=input.nextLine();
		System.out.println("Month Plan: ");
		String monthplan=input.nextLine();
		System.out.println("Week Plan: ");
		String weekplan=input.nextLine();
		System.out.println("Daily Plan: ");
		String dailyplan=input.nextLine();
	
	}
	public static void viewPlans() { Scanner input=new Scanner(System.in);
	System.out.print("Year Plan: ");
	String yearplan=input.nextLine();
	System.out.println("Month Plan: ");
	String monthplan=input.nextLine();
	System.out.println("Week Plan: ");
	String weekplan=input.nextLine();
	System.out.println("Daily Plan: ");
	String dailyplan=input.nextLine();1
	}
	}