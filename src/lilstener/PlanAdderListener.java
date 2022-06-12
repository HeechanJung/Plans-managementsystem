package lilstener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

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
	
	public PlanAdderListener(JTextField fieldYear, JTextField fieldMonth, JTextField fieldWeek, JTextField fieldDaily,Planmanager planmanager) {
		super();
		this.fieldYear = fieldYear;
		this.fieldMonth = fieldMonth;
		this.fieldWeek = fieldWeek;
		this.fieldDaily = fieldDaily;
		this.planmanager=planmanager;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(fieldYear.getText());
		System.out.println(fieldMonth.getText());
		System.out.println(fieldWeek.getText());
		System.out.println(fieldDaily.getText());
		
		Plannerinput planner=new Exam(PlanKind.Exam);
		try {
			planner.setYearplan(fieldYear.getText());
			planner.setMonthplan(fieldMonth.getText());
			planner.setWeekplan(fieldWeek.getText());
			planner.setDailyplan(fieldDaily.getText());
			Planmanager.addPlans(planner);
			putObject(planmanager,"planmanager.ser");

			planner.printInfo();
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
		
		
	}


	private void putObject(Planmanager planmanager2, String string) {
		// TODO Auto-generated method stub
		
	}

}
