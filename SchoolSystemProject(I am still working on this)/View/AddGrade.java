package View;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class AddGrade extends AddStudent
{
    private JPanel inputPanel = new JPanel();
    private final JLabel  HEADER = new JLabel();
    private final String [] SUBJECTNAMESARRAY = {"Maths:","English:",
                                                "Frensh:","Geography:",
                                                "Construction:","Engineering:"};
    private JLabel [] labelArray = new JLabel[SUBJECTNAMESARRAY.length];

    //private JTextField [] inputFieldsArray = new JTextField[SUBJECTNAMESARRAY.length];
    private JTextField [] gradeFieldsArray = new JTextField[SUBJECTNAMESARRAY.length];

    private final String [][] BUTTONSNAMESARRAY = {{"Add","Edit","Cancel"},

                                                    {"Add","Edit","Cancel"},

                                                    {"Add","Edit","Cancel"},

                                                    {"Add","Edit","Cancel"},

                                                    {"Add","Edit","Cancel"},

                                                    {"Add","Edit","Cancel"}};


    //private JButton [][] buttonsArray = new JButton[BUTTONSNAMESARRAY.length][BUTTONSNAMESARRAY[0].length];
    private JButton [][] aecButtonsArray = new JButton[BUTTONSNAMESARRAY.length][BUTTONSNAMESARRAY[0].length];
    
    int i = 0;
    int j = 0;
    int k = 0;
    
   public AddGrade()
    {
       
       setUpPanel();
       
        
    }

    private void setUpPanel()
    {
        
        inputPanel.setLayout(null);
        HEADER.setText("Add Grade (s)!");
        HEADER.setFont(new Font("Arial",Font.BOLD,50));
        HEADER.setBounds(300,15,500,60);
        HEADER.setForeground(getTextOrLabelColor());
        inputPanel.setBackground(new Color(75,0,130));

        inputPanel.add(HEADER);


        int labelArrayY = 90;
        int fieldArrayY = 90;
       
        for(i=0; i<SUBJECTNAMESARRAY.length;i++)
            {
                
                labelArray[i] = new JLabel(SUBJECTNAMESARRAY[i]);
                gradeFieldsArray[i] = new JTextField();
                gradeFieldsArray[i].setBackground(getFieldColor());
                gradeFieldsArray[i].setBorder(new EmptyBorder(0,40,0,40));
                gradeFieldsArray[i].setForeground(getTextOrLabelColor());
                gradeFieldsArray[i].setCaretColor(getTextOrLabelColor());
                labelArray[i].setBounds(200,labelArrayY ,150,50);
                gradeFieldsArray[i].setBounds(335,fieldArrayY ,120,50);
                labelArray[i].setFont(new Font("Arial",Font.BOLD,20));
                labelArray[i].setForeground(getTextOrLabelColor());
                
                
                inputPanel.add(labelArray[i]);
                inputPanel.add(gradeFieldsArray[i]);
                labelArrayY +=80;
                fieldArrayY +=80;
               

            }

            

        int perLabelY = 470;
        int perLabelX = 100;
        for(int i =0; i<6; i++)
            {
                JLabel perLabel = new JLabel();
                perLabel.setText("%");
                perLabel.setFont(getTextFont());
                perLabel.setForeground(getTextOrLabelColor());
                perLabel.setBounds(perLabelY, perLabelX ,15,20);
                inputPanel.add(perLabel);
                perLabelX +=80;
            }
            

            
        int gapY = 100;
        for(j = 0; j<BUTTONSNAMESARRAY.length; j++)
            {
                int gapX =500;
                 
                for(k = 0; k <BUTTONSNAMESARRAY[0].length; k++)
                    {
                        
                        String labels = BUTTONSNAMESARRAY[j][k];
                        aecButtonsArray[j][k] = new JButton(labels);
                        if(k==1)
                            {
                                gapX +=150;
                            }
                        else if(k==2)
                            {
                                gapX +=150;
                            }
                        aecButtonsArray[j][k].setBounds(gapX,gapY ,100,30);
                        aecButtonsArray[j][k].setFocusPainted(false);

                        if(labels.equals("Add"))
                            {
                                aecButtonsArray[j][k].setBackground(Color.GREEN);
                            }

                        else  if(labels.equals("Edit"))
                            {
                                aecButtonsArray[j][k].setBackground(Color.ORANGE);
                            }
                        
                        else
                            {
                                aecButtonsArray[j][k].setBackground(Color.RED);
                            }
                        

                        inputPanel.add(aecButtonsArray[j][k]);
                        
                      
                        
                       
                        
                    } 
                    
                    gapY += 80;
                    
                    
                     
            }
                
       

    }

    public JPanel getAddGradeJPanel()
    {
        return inputPanel;
    }

}