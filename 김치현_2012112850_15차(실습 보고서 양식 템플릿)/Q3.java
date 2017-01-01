import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class Q3 extends JFrame implements KeyListener { 
   public Q3() { 
	  setTitle("키로 프레임 조절");
      setLayout(new FlowLayout()); 
      JButton button = new JButton("A"); 
      add(button); 
      Container c = getContentPane();
      getContentPane().setFocusable(true); 
      getContentPane().addKeyListener(this); 
      setVisible(true); 
      c.requestFocus();
      setSize(15, 150); 
      setDefaultCloseOperation(EXIT_ON_CLOSE); 
   } 
   
   public static void main(String[] args) { 
      new Q3(); 
   } 
   
   public void keyTyped(KeyEvent e) { 
   } 
   
   public void keyPressed(KeyEvent e) { 
      if( e.getKeyCode() == KeyEvent.VK_F1 ) { 
         setSize(getWidth()+10, getHeight()+10); 
         } else if( e.getKeyCode() == KeyEvent.VK_F2 ) { 
         setSize(getWidth()-10, getHeight()-10); 
         } else if( e.getKeyCode() == KeyEvent.VK_Q ) { 
         System.exit(0); 
      } 
   } 
   public void keyReleased(KeyEvent e) { 
   } 
} 