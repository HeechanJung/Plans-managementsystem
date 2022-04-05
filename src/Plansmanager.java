import java.util.Scanner;

public class Plansmanager {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		Plannermanagement plannermanagement=new Plannermanagement(input);
		
		int num=0;
		
		while (num !=5) {
			System.out.println("1.Add Plans");
			System.out.println("2.Delete Plans");
			System.out.println("3.Edit Plans");
			System.out.println("4.View Plans");
			System.out.println("5.Exit");
			System.out.println("Select one number between 1-5 ");
			num=input.nextInt();
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
			
	}

 
	
	}