package lilstener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Exception.WeekException1;
import manage.Exam;
import manage.PlanKind;
import manage.Planmanager;
import manage.Plannerinput;

public class PlanAdderListener implements ActionListener {

	JTextField fieldYear;
	JTextField fieldMonth;
	JTextField fieldWeek;
	JTextField fieldDaily;
	Planmanager planmanager;

	public PlanAdderListener(JTextField fieldYear, JTextField fieldMonth, JTextField fieldWeek, JTextField fieldDaily,
			Planmanager planmanager) {
		super();
		this.fieldYear = fieldYear;
		this.fieldMonth = fieldMonth;
		this.fieldWeek = fieldWeek;
		this.fieldDaily = fieldDaily;
		this.planmanager = planmanager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	

		Plannerinput planner = new Exam(PlanKind.Exam);
		planner.setYearplan(fieldYear.getText());
		planner.setMonthplan(fieldMonth.getText());
		try {
			System.out.println("testtest : =======> " + fieldWeek.getText());
			planner.setWeekplan(fieldWeek.getText());
		} catch (WeekException1 e1) {
			e1.printStackTrace();
		}

		planner.setDailyplan(fieldDaily.getText());
		planmanager.addPlans(planner);
		putObject(planmanager, "planmanager.ser");

		planner.printInfo();

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

