package GUI;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PlanViewer extends JFrame {
	
	public PlanViewer() {
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Year");
		model.addColumn("Month");
		model.addColumn("Week");
		model.addColumn("Daily");
		
		JTable table=new JTable(model);
		JScrollPane sp=new JScrollPane(table);

		
		
		
		
		
		this.add(sp);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
