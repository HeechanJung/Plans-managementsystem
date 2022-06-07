package GUI;


import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
public class WindowFrame extends JFrame {
	
	Menuselection menuselection;
	PlanAdder planadder;
	PlanViewer planviewer;
	
	public WindowFrame() {
		
		
		this.menuselection=new Menuselection(this);//WindFrame 자신임을 알림
		this.planadder=new PlanAdder(this);
		this.planviewer=new PlanViewer(this);
        
		
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
