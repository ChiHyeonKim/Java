import java.awt.*;
import java.awt.event.*;
import java.util.Locale;
import javax.swing.*;

public class Q6 extends JFrame
{
    Container cp;
    JCheckBox cho1 = new JCheckBox("��ư ��Ȱ��ȭ");
    JCheckBox cho2 = new JCheckBox("��ư ���߱�");
    JButton jb = new JButton("test button");
    
    Q6()
    {
        setTitle("CheakBox��  ItemEvent");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cho1.addItemListener(new MyItemListener());
        cho2.addItemListener(new MyItemListener());
        cp.add(cho1);
        cp.add(cho2);
        cp.add(jb);
        
        setSize(300, 200);
        setVisible(true);
    }
    
    public class MyItemListener implements ItemListener
    {
        boolean bl = true;
        public void itemStateChanged(ItemEvent e) 
        {
            if(e.getStateChange()==ItemEvent.SELECTED) bl = false;
            else bl = true;
            
            if(e.getItem() == cho1) jb.setEnabled(bl);
            else jb.setVisible(bl);
        }
    }
    
    public static void main(String[] args)
    {
        new Q6();
    }
}