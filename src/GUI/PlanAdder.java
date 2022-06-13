package GUI;

import javax.swing.*;

import lilstener.PlanAdderCancelListener;
import lilstener.PlanAdderListener;
import manage.Planmanager;

public class PlanAdder extends JPanel {
	WindowFrame frame;
	Planmanager planmanager;

	public PlanAdder(WindowFrame frame, Planmanager planmanager) {

		this.frame = frame;

		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

		JLabel labelYear = new JLabel("Year: ", JLabel.TRAILING);
		JTextField fieldYear = new JTextField(10);
		labelYear.setLabelFor(fieldYear);
		panel.add(labelYear);
		panel.add(fieldYear);

		JLabel labelMonth = new JLabel("Month: ", JLabel.TRAILING);
		JTextField fieldMonth = new JTextField(10);
		labelMonth.setLabelFor(fieldMonth);
		panel.add(labelMonth);
		panel.add(fieldMonth);

		JLabel labelWeek = new JLabel("Week: ", JLabel.TRAILING);
		JTextField fieldWeek = new JTextField(10);
		labelWeek.setLabelFor(fieldWeek);
		panel.add(labelWeek);
		panel.add(fieldWeek);

		JLabel labelDaily = new JLabel("Daily: ", JLabel.TRAILING);
		JTextField fieldDaily = new JTextField(10);
		labelDaily.setLabelFor(fieldDaily);

		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new PlanAdderListener(fieldYear, fieldMonth, fieldWeek, fieldDaily, planmanager));

		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new PlanAdderCancelListener(frame));

		panel.add(labelDaily);
		panel.add(fieldDaily);

		panel.add(saveButton);
		panel.add(cancelButton);

		SpringUtilities.makeCompactGrid(panel, 5, 2, 10, 10, 10, 10);

		this.setSize(300, 300);

		this.add(panel);
		this.setVisible(true);
	}

}
