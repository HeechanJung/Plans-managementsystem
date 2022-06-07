package GUI;

import java.awt.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PlanViewer extends JPanel {
	
	WindowFrame frame;
	
	@SuppressWarnings("deprecation")
	public PlanViewer(WindowFrame frame) {
		this.frame=frame;

		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Year");
		model.addColumn("Month");
		model.addColumn("Week");
		model.addColumn("Daily");
		
				
		JTable table=new JTable(model);
		JScrollPane sp=new JScrollPane(table);

		
		
		
		
		
		this.add(sp);
		
		
	}

}
