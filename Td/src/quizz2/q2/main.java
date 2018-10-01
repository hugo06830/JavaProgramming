package quizz2.q2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;


public class main
{
	
	public static void main(String[] args)
    {
        
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame    F    =    new    JFrame();
                F.setTitle("Color Sliders Exercise");                         
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // ADD TOP PANEL

                JPanel    P1    =    new JPanel();
                
                JPanel    P2    =    new JPanel();
                P2.setLayout(new GridLayout(3,1));
                
                JPanel panel = new JPanel();
                panel.setBorder(new TitledBorder(null, "Green", TitledBorder.LEADING, TitledBorder.TOP, null, null));
                P2.add(panel);
                
                JSlider s1    = new JSlider(0,255,0);
                panel.add(s1);
                s1.setBorder(null);
                
                //setting up
                s1.setPaintTrack(true);
                s1.setPaintLabels(true);
                
                //spacing
                s1.setMajorTickSpacing(50);
               
                
                
                
                
               
                
                JPanel panel_1 = new JPanel();
                panel_1.setBorder(new TitledBorder(null, "blue", TitledBorder.LEADING, TitledBorder.TOP, null, null));
                P2.add(panel_1);
                JSlider s2    = new JSlider(0,255,0);
                panel_1.add(s2);
                s2.setBorder(null);
                s2.setPaintTrack(true);                
                s2.setPaintLabels(true);
                s2.setMajorTickSpacing(50);
                
                
                JPanel panel_2 = new JPanel();
                panel_2.setBorder(new TitledBorder(null, "red", TitledBorder.LEADING, TitledBorder.TOP, null, null));
                P2.add(panel_2);
                JSlider s3    = new JSlider(0,255,0);
                panel_2.add(s3);
                s3.setBorder(null);
                s3.setPaintTrack(true);                
                s3.setPaintLabels(true);
                s3.setMajorTickSpacing(50);
                
                ChangeListener    L    =    new    ChangeListener() {

					@Override
					public void stateChanged(ChangeEvent e) {
					P1.setBackground(new Color(s3.getValue(),s1.getValue(),s2.getValue()));
						
					}
                    
                    
                 };
              
          s1.addChangeListener(L);
          s2.addChangeListener(L);
          s3.addChangeListener(L);
          
          
                F.getContentPane().add(P1);
                
                
                F.getContentPane().add(P2,BorderLayout.SOUTH);
                
                F.setSize(400,400);
                F.setVisible(true); 
            }
        });
    }

}