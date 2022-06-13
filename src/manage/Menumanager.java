package manage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import GUI.WindowFrame;
import log.Eventlogger;


public class Menumanager {
	static Eventlogger logger = new Eventlogger("log.txt");

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		Planmanager planmanager = new Planmanager(input);
		Planmanager planmanager = getObject("planmanager.ser");
		if (planmanager == null) {
			planmanager = new Planmanager(input);
		}else {
			planmanager.input = input;
		}
		WindowFrame frame = new WindowFrame(planmanager);
		selectMenu(input, planmanager);
		putObject(planmanager, "planmanager.ser");

	}

	public static void selectMenu(Scanner input, Planmanager planmanager) {
		int num = -1;

		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				// input.nextLine();
				if (num == 1) {
					planmanager.addPlans();
					logger.log("add plans");
				} else if (num == 2) {
					planmanager.deletePlans();
					logger.log("delete plans");

				} else if (num == 3) {
					planmanager.editPlans();
					logger.log("edit plans");

				} else if (num == 4) {
					planmanager.viewPlans();
					logger.log("view a list of plan");

				} else {
					continue;
				}
			}

			catch (InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
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
	
	public static Planmanager getObject(String filename) {
		Planmanager planmanager = null;

		FileInputStream file;
		try {
			file = new FileInputStream(filename);
			ObjectInputStream obj = new ObjectInputStream(file);
			planmanager = (Planmanager) obj.readObject();

			obj.close();
			file.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			return planmanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return planmanager;

	}

	public static void putObject(Planmanager planmanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream obj = new ObjectOutputStream(file);

			obj.writeObject(planmanager);

			obj.close();
			file.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}