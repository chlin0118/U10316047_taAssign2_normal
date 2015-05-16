import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class TestGeometrics extends JFrame {
	private Circle circle = new Circle();
	private Rectangle rectangle = new Rectangle();
	private Triangle triangle = new Triangle();
	
	
	public TestGeometrics(){
		add(circle.bigpanel, BorderLayout.NORTH);
		add(rectangle.bigpanel, BorderLayout.CENTER);
		add(triangle.bigpanel, BorderLayout.SOUTH);
	}
		
	public static void main(String[] args) {
		JFrame frame = new TestGeometrics();
		frame.setTitle("U10316047_GeoCalculate");
		frame.pack();
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

