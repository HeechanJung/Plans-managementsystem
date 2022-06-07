package lilstener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.PlanAdder;
import GUI.PlanViewer;
import GUI.WindowFrame;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame=frame;//frame 제어 가능
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		PlanViewer viewer= frame.getPlanviewer();
		frame.setupPanel(viewer);

	}

}
