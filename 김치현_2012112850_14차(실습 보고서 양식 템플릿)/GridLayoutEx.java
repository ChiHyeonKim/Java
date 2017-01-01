import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		super("GridLayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane(); 
	
		// 1x10�� GridLayout ��ġ������
		contentPane.setLayout(new GridLayout(1, 10)); 

		for(int i=0; i<10; i++) { // 10���� ��ư ����
			String text = Integer.toString(i); // i�� ���ڿ��� ��ȯ
			JButton button = new JButton(text);
			contentPane.add(button); // ����Ʈ�ҿ� ��ư ����

			switch(i){
			case 0:button.setBackground(Color.RED);break;
			case 1:button.setBackground(Color.ORANGE);break;
			case 2:button.setBackground(Color.YELLOW);break;
			case 3:button.setBackground(Color.GREEN);break;
			case 4:button.setBackground(Color.CYAN);break;
			case 5:button.setBackground(Color.BLUE);break;
			case 6:button.setBackground(Color.MAGENTA);break;
			case 7:button.setBackground(Color.GRAY);break;
			case 8:button.setBackground(Color.PINK);break;
			case 9:button.setBackground(Color.LIGHT_GRAY);break;
			}
		}
		
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
