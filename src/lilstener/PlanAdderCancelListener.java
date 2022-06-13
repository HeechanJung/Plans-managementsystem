package lilstener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.PlanAdder;
import GUI.PlanViewer;
import GUI.WindowFrame;

public class PlanAdderCancelListener implements ActionListener {
	
	WindowFrame frame;
	
	public PlanAdderCancelListener(WindowFrame frame) {
		this.frame=frame;//frame 제어가능
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		PlanAdder adder= frame.getPlanadder();
		
		frame.setupPanel(adder);
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
		

	}
	
	

}
