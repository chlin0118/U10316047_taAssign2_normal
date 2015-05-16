import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Rectangle extends JFrame {
	private JLabel l1 = new JLabel("Rectangle:");
	private JLabel l2 = new JLabel("Length:");
	private JLabel l3 = new JLabel("Width:");
	private JLabel l4 = new JLabel("          The area is:");
	private JLabel l5 = new JLabel("The perimeter is:");
	
	private JTextField jtfLenth = new JTextField(8);
	private JTextField jtfWidth = new JTextField(8);
	private JTextField jtfArea = new JTextField(8);
	private JTextField jtfPerimeter = new JTextField(8);
	
	private JButton jbtCalculate = new JButton("­pºâ");
	private JButton jbtClean= new JButton("²M°£");
	
	private double length = 0;
	private double width = 0;
	JPanel bigpanel = new JPanel(new GridLayout(4,1));
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	
	public Rectangle(){
		p1.add(l1);
		p2.add(l2);
		p2.add(jtfLenth);
		p2.add(l3);
		p2.add(jtfWidth);
		p2.add(jbtCalculate);
		p2.add(jbtClean);
		p3.add(l4);
		p3.add(jtfArea);
		p4.add(l5);
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
			length = Double.valueOf(jtfLenth.getText());
			width = Double.valueOf(jtfWidth.getText());
			jtfArea.setText(String.valueOf(String.format("%.2f",getArea())));
			jtfPerimeter.setText(String.valueOf(String.format("%.2f",getPerimeter())));
		}
	}
	
	private class CleanListener implements ActionListener {
		@Override /** Handle the action event */
		public void actionPerformed(ActionEvent e) {
			jtfLenth.setText("");
			jtfWidth.setText("");
			jtfArea.setText("");
			jtfPerimeter.setText("");
		}
	}
	
	double getArea() {
		return length * width;
	}

	double getPerimeter() {
		return 2 * (length + width);
	}
}
