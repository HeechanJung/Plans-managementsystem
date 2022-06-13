package lilstener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import GUI.PlanAdder;
import GUI.PlanViewer;
import GUI.WindowFrame;
import manage.Planmanager;


public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame=frame;//frame 제어가능
		
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

	public static Planmanager getObject(String filename) {
		Planmanager planmanager = null;

		FileInputStream file;
		try {
			file = new FileInputStream(filename);
			ObjectInputStream  obj = new ObjectInputStream(file);
			planmanager = (Planmanager) obj.readObject();

			obj.close();
			file.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			return planmanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return planmanager;

	}

	
}
