import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q1 extends JFrame {
		Q1(){
		setTitle("키 누르기 떼기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
		Container c = getContentPane();
		c.setBackground(Color.CYAN);
		c.addKeyListener(new MyKeyListener());

		c.requestFocus();
	}
	
class MyKeyListener extends KeyAdapter{
	public void keyPressed(KeyEvent e){
		switch(e.getKeyChar()){
		case 'R':
			getContentPane().setBackground(Color.RED);
			break;
		
		case 'r':
			getContentPane().setBackground(Color.RED);
			break;
	}
	}
	
	public void keyReleased(KeyEvent e){
		switch(e.getKeyChar()){
		case 'r':
			getContentPane().setBackground(Color.CYAN);
			break;
		case 'R':
			getContentPane().setBackground(Color.CYAN);
			break;
	}
	}
}
	
	public static void main(String[] args) {
		Q1 mf = new Q1();
	}
	
}