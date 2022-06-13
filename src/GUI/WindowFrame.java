package GUI;


import javax.swing.JFrame;
import javax.swing.JPanel;

import manage.Planmanager;

import java.awt.*;
public class WindowFrame extends JFrame {
	
	Menuselection menuselection;
	PlanAdder planadder;
	PlanViewer planviewer;
	Planmanager planmanager;
	public WindowFrame(Planmanager planmanager) {
		
		this.planmanager = planmanager;
		this.menuselection=new Menuselection(this);//WindFrame �옄�떊�엫�쓣 �븣由�
		this.planadder = new PlanAdder(this, planmanager);
		this.planviewer=new PlanViewer(this, planmanager);
        
		
        this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setupPanel(menuselection);
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

	
	public Menuselection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(Menuselection menuselection) {
		this.menuselection = menuselection;
	}

	public PlanAdder getPlanadder() {
		return planadder;
	}

	public void setPlanadder(PlanAdder planadder) {
		this.planadder = planadder;
	}

	public PlanViewer getPlanviewer() {
		return planviewer;
	}

	public void setPlanviewer(PlanViewer planviewer) {
		this.planviewer = planviewer;
	}

}