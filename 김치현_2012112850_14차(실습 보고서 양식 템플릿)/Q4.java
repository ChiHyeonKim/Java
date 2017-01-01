import javax.swing.*;
import java.awt.*;

public class Q4 extends JFrame {
	Q4(){
		setTitle("Random Labels");
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		for(int i=0; i<20; i++){
			JLabel label = new JLabel();
			int x = (int)(Math.random()*200) + 50; // 50~250의 랜덤 x
			int y = (int)(Math.random()*200) + 50; // 50~250의 랜덤 y
			label.setLocation(x, y); //label을 (x, y)에 배치
			label.setSize(10, 10); //label 크기를 10x10으로 설정
			label.setOpaque(true); //label에 배경색이 보이게 함
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
