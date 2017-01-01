import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Q4 extends JFrame 
{
    JPanel jp = new JPanel();
    JLabel jl = new JLabel("Love Java");
    Font f = jl.getFont();
    int size = f.getSize();
    
    Q4()
    {
        setTitle("¸¶¿ì½º ÈÙ ±¼¸®±â ¿¬½À");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(jp);
        jl.setFont(new Font("Arial", Font.PLAIN, 10));
        jp.addMouseWheelListener(new MouseWheelListener());
        jp.add(jl);
        setSize(300, 200);
        setVisible(true);
        jp.requestFocus();
    }
    
    public static void main(String[] args)
    {
        new Q4();
    }
    
    public class MouseWheelListener extends MouseAdapter{
        public void mouseWheelMoved(MouseWheelEvent e){
           int n = e.getWheelRotation();
           
           if(n < 0){
        	   size -=5;
        	   if (size < 5)
        		   size = 5; }
    
           else 
        	size +=5;
     
           jl.setFont(new Font("Arial", Font.PLAIN, size));
       }
   }

}