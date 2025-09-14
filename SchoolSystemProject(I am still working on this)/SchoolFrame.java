import java.awt.Color;

import javax.swing.JFrame;

public class SchoolFrame extends JFrame
{
    

    SchoolFrame()
    {
       
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setExtendedState(JFrame.MAXIMIZED_BOTH);
       this.setLayout(null);
       this.getContentPane().setBackground(Color.BLACK);
       this.setTitle("Kilkenny City Secondary School");
       

       this.setVisible(true);

    }


}

