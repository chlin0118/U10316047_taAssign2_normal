import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class Triangle extends JFrame {
	private JLabel l1 = new JLabel("Triangle:");
	private JLabel l2 = new JLabel("a lenth:");
	private JLabel l3 = new JLabel("b lenth:");
	private JLabel l4 = new JLabel("c lenth:");
	private JLabel l5 = new JLabel("          The area is:");
	private JLabel l6 = new JLabel("The perimeter is:");
	
	private JTextField jtfSideA = new JTextField(8);
	private JTextField jtfSideB = new JTextField(8);
	private JTextField jtfSideC = new JTextField(8);
	private JTextField jtfArea = new JTextField(8);
	private JTextField jtfPerimeter = new JTextField(8);
	
	private JButton jbtCalculate = new JButton("­pºâ");
	private JButton jbtClean= new JButton("²M°£");
	
	private double a = 0;
	private double b = 0;
	private double c = 0;
	private double s = 0;
	
	JPanel bigpanel = new JPanel(new GridLayout(4,1));
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();

	public Triangle(){
		p1.add(l1);
		p2.add(l2);
		p2.add(jtfSideA);
		p2.add(l3);
		p2.add(jtfSideB);
		p2.add(l4);
		p2.add(jtfSideC);
		p2.add(jbtCalculate);
		p2.add(jbtClean);
		p3.add(l5);
		p3.add(jtfArea);
		p4.add(l6);
		p4.add(jtfPerimeter);
		bigpanel.add(p1);
		bigpanel.add(p2);
		bigpanel.add(p3);
		bigpanel.add(p4);
		
		jbtCalculate.addActionListener(new CalculateListener());
		jbtClean.addActionListener(new CleanListener());
	}
	
	private class CalculateListener implements ActionListener {
		@Override /** Handle the action event */
		public void actionPerformed(ActionEvent e) {
			a = Double.valueOf(jtfSideA.getText());
			b = Double.valueOf(jtfSideB.getText());
			c = Double.valueOf(jtfSideC.getText());
			jtfArea.setText(String.valueOf(String.format("%.2f",getArea())));
			jtfPerimeter.setText(String.valueOf(String.format("%.2f",getPerimeter())));
		}
	}
	
	private class CleanListener implements ActionListener {
		@Override /** Handle the action event */
		public void actionPerformed(ActionEvent e) {
			jtfSideA.setText("");
			jtfSideB.setText("");
			jtfSideC.setText("");
			jtfArea.setText("");
			jtfPerimeter.setText("");
		}
	}
	
	double getArea() {
		s = getPerimeter()/2;
		return Math.pow(s*(s-a)*(s-b)*(s-c), 0.5);
	}

	double getPerimeter() {
		return a+b+c;
	}
}
