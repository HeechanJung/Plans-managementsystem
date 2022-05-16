
import java.util.InputMismatchException;
import java.util.Scanner;

public class Plansmanager {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		Plannermanagement plannermanagement=new Plannermanagement(input);
		
		selectMenu(input,plannermanagement);
		
	}
	public static void selectMenu(Scanner input, Plannermanagement plannermanagement) {
		int num=-1;
		
		while (num !=5) {
			try {
			showMenu();
			num=input.nextInt();
			//input.nextLine();
			if (num==1) {
				plannermanagement.addPlans();
			}
			else if (num==2) {
				plannermanagement.deletePlans();
			}
			else if (num==3) {
				plannermanagement.editPlans();
				}
			else if (num==4) {
				plannermanagement.viewPlans();
			}
			else {
				continue;
			}
			}
		 
		
		catch(InputMismatchException e) {
			System.out.println("Please put an integer between 1 and 5!");
			if(input.hasNext()) {
				input.next();
			}
			num=-1;
		}
	}
		}
		
		
	
	public static void showMenu() {
		System.out.println("##### Plan Management System Menu #####");
		System.out.println("1. Add Plans");
		System.out.println("2. Delete Plans");
		System.out.println("3. Edit Plans");
		System.out.println("4. View Plans");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1~5: ");

	}

 
	
	}