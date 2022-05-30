package GUI;
import javax.swing.*;

public class PlanAdder extends JFrame {
	
	public PlanAdder() {
		JPanel panel=new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelYear=new JLabel("Year: ",JLabel.TRAILING);
		JTextField fieldYear = new JTextField(10);
		labelYear.setLabelFor(fieldYear);
		panel.add(labelYear);
		panel.add(fieldYear);
		
		JLabel labelMonth=new JLabel("Month: ",JLabel.TRAILING);
		JTextField fieldMonth = new JTextField(10);
		labelMonth.setLabelFor(fieldMonth);
		panel.add(labelMonth);
		panel.add(fieldMonth);
		
		JLabel labelWeek=new JLabel("Week: ",JLabel.TRAILING);
		JTextField fieldWeek = new JTextField(10);
		labelWeek.setLabelFor(fieldWeek);
		panel.add(labelWeek);
		panel.add(fieldWeek);
		
		JLabel labelDaily=new JLabel("Daily: ",JLabel.TRAILING);
		JTextField fieldDaily = new JTextField(10);
		labelDaily.setLabelFor(fieldDaily);
		panel.add(labelDaily);
		panel.add(fieldDaily);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 10, 10, 10, 10);
		
	
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel);
		this.setVisible(true);
	}

}
