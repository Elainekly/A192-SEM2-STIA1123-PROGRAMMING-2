import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener
{   
    private static JPanel panel;
    private static JFrame frame;
    private static JLabel title;
    private static JLabel l;
    private static JButton b;
    private static JButton b1;
    private static JButton b2;
    private static JButton b3;
    private static JButton b4;
    
    public static void main (String[] args)
    {        
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(1000, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Refrigerator");
        frame.add(panel);        
    
        panel.setLayout(null);
        
        title = new JLabel("Refrigerator");
        title.setFont(new Font ("Courgette", Font.BOLD , 50));
        title.setForeground(Color.blue);
        title.setBounds(330, 20, 350, 70);
        panel.add(title);
        
        l = new JLabel("Please click a button to know more about Refrigerator.");
        l.setFont(new Font ("Arial", Font.PLAIN , 20));
        l.setBounds(230, 100, 700, 50);
        panel.add(l);
        
        b = new JButton("Refrigerator Basic");
        b.setBounds(375, 200, 250, 25);
        b.addActionListener(new GUI());
        panel.add(b);
        
        b1 = new JButton("Freech Door Refrigerator");
        b1.setBounds(150, 300, 250, 25);
        b1.addActionListener(new GUI());
        panel.add(b1);
        
        b2 = new JButton("Side By Side Refrigerator");
        b2.setBounds(600, 300, 250, 25);
        b2.addActionListener(new GUI());
        panel.add(b2);
        
        b3 = new JButton("Top Mount Freezer");
        b3.setBounds(150, 400, 250, 25);
        b3.addActionListener(new GUI());
        panel.add(b3);
        
        b4 = new JButton("Bottom Mount Freezer");
        b4.setBounds(600, 400, 250, 25);
        b4.addActionListener(new GUI());
        panel.add(b4);
        
        frame.setVisible(true);
    }
        
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == b)
        {
            RefrigeratorBasic r = new RefrigeratorBasic();
            r.setVisible(true);
        }
        else if (e.getSource() == b1)
        {
            FD r1 = new FD();
            r1.setVisible(true);
        }
        else if (e.getSource() == b2)
        {
            SBS r2 = new SBS();
            r2.setVisible(true);
        }
        else if (e.getSource() == b3)
        {
            TMF r3 = new TMF();
            r3.setVisible(true);
        }
        else if (e.getSource() == b4)
        {
            BMF r4 = new BMF();
            r4.setVisible(true);
        }
    }

    void setVisible(boolean b) {
        frame.setVisible(true);
    }
    
}
