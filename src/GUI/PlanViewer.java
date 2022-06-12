package GUI;

import java.awt.Component;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import manage.Planmanager;
import manage.Plannerinput;

public class PlanViewer extends JPanel {
	
	WindowFrame frame;
	Planmanager planmanager;
	
	public Planmanager getPlanmanager() {
		return planmanager;
	}

	public void setPlanmanager(Planmanager planmanager) {
		this.planmanager = planmanager;
		this.removeAll();
		
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Year");
		model.addColumn("Month");
		model.addColumn("Week");
		model.addColumn("Daily");
		
				
		
		for(int i=0;i<planmanager.size();i++) {
			Vector row=new Vector();
			Plannerinput pi=Plannerinput.get(i);
			row.add(pi.getYearplan());
			row.add(pi.getMonthplan());
			row.add(pi.getWeekplan());
			row.add(pi.getDailyplan());
			model.addRow(row);
	
		}
		JTable table=new JTable(model);
		JScrollPane sp=new JScrollPane(table);
			
		this.add(sp);
		
	}

	public PlanViewer(WindowFrame frame, Planmanager planmanager) {
		this.frame=frame;
		this.planmanager= planmanager;

		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Year");
		model.addColumn("Month");
		model.addColumn("Week");
		model.addColumn("Daily");
		
				
		
		for(int i=0;i<planmanager.size();i++) {
			Vector row=new Vector();
			Plannerinput pi=Plannerinput.get(i);
			row.add(pi.getYearplan());
			row.add(pi.getMonthplan());
			row.add(pi.getWeekplan());
			row.add(pi.getDailyplan());
			model.addRow(row);
	
		}
		JTable table=new JTable(model);
		JScrollPane sp=new JScrollPane(table);
			
		this.add(sp);
		
		
	}

	
}
