package lilstener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.PlanAdder;
import GUI.PlanViewer;
import GUI.WindowFrame;
import manage.Planmanager;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame=frame;//frame 제어 가능
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		PlanViewer viewer= frame.getPlanviewer();
		Planmanager planmanager=getObject("planmanager.ser");
		viewer.setPlanmanager(planmanager);

		JButton b=(JButton)e.getSource();
		frame.setupPanel(viewer);
		frame.revalidate();
		frame.repaint();

	}

	private Planmanager getObject(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
