package GUI;


import java.awt.BorderLayout;

import javax.swing.*;

import lilstener.ButtonAdderListener;
import lilstener.ButtonViewListener;

public class Menuselection extends JPanel{
	
	WindowFrame frame;
	
	public Menuselection(WindowFrame frame) {
		this.frame=frame;
		
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1=new JPanel();//label을 중앙에 오도록
		JPanel panel2=new JPanel();
		JLabel label=new JLabel("Menu Selection");
		
		JButton button1=new JButton("Add Plane");
		JButton button2=new JButton("View Plane");
		JButton button3=new JButton("Edit Plane");
		JButton button4=new JButton("Delete Plane");
		JButton button5=new JButton("Exit Program");
		
		button1.addActionListener(new ButtonAdderListener(frame));
		button2.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(label);//panel1에 label을 붙인다
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);

		
		
	}

}
