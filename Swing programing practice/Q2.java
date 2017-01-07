import javax.swing.*;
import java.awt.*;

public class Q2 extends JFrame{
	Q2(){
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new BorderLayout(5, 7));
		contentPane.add(new JButton("Center"), BorderLayout.CENTER);
		contentPane.add(new JButton("North"), BorderLayout.NORTH);
		contentPane.add(new JButton("South"), BorderLayout.SOUTH);
		contentPane.add(new JButton("East"), BorderLayout.EAST);
		contentPane.add(new JButton("West"), BorderLayout.WEST);
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Q2();
	}

}
