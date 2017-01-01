import javax.swing.*;
import java.awt.*;

public class Q4 extends JFrame {
	Q4(){
		setTitle("Random Labels");
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		for(int i=0; i<20; i++){
			JLabel label = new JLabel();
			int x = (int)(Math.random()*200) + 50; // 50~250�� ���� x
			int y = (int)(Math.random()*200) + 50; // 50~250�� ���� y
			label.setLocation(x, y); //label�� (x, y)�� ��ġ
			label.setSize(10, 10); //label ũ�⸦ 10x10���� ����
			label.setOpaque(true); //label�� ������ ���̰� ��
			label.setBackground(Color.BLUE);
			
			contentPane.add(label);
		}

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Q4 frame = new Q4();
	}

}
