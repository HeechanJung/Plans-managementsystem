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
				System.out.print("Year plans");
				int Yearplans=input.nextInt();
				System.out.print("Month plans");
				String Monthplans=input.next();
				
			}
			



			
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
