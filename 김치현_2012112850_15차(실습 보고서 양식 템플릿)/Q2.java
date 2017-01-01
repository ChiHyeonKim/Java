import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Q2 extends JFrame 
{
    JPanel jp = new JPanel();
    JLabel jl = new JLabel("Love Java");
    Font f = jl.getFont();
    int size = f.getSize();
    
    Q2()
    {
        setTitle("+,-키로 폰트 크기 조절");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setContentPane(jp);
        jl.setFont(new Font("Arial", Font.PLAIN, 10));
        jp.addKeyListener(new LeftListener());
        jp.add(jl);
        setSize(300, 200);
        setVisible(true);
        jp.requestFocus();
    }
    
    public static void main(String[] args)
    {
        new Q2();
    }
    
    public class LeftListener extends KeyAdapter
    {
        String str = jl.getText();
        int c = 0;
        
        public void keyPressed(KeyEvent e)
        {
            int keyCode = e.getKeyCode();
            
            switch(keyCode)
            {
                case KeyEvent.VK_ADD :  size +=5;
                                        break; 
                case KeyEvent.VK_SUBTRACT : size -=5;
                                            if(size < 5)
                                            	size = 5;
                                            break;
            }
            
            jl.setFont(new Font("Arial", Font.PLAIN, size));
        }
    }
}