package View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SchoolMenu
{
    /*
        Autor : Hamed Zon
        date 25/08/2025
        This is the front end of the menu where there's options of buttons
        to perform different tasks.
        Jave Swing is use for the user interface
        
     */
    private SchoolFrame menu = new SchoolFrame();
    private JPanel formPanel = new JPanel();
    private JPanel menuPanel = new JPanel();
    private JPanel welcomePanel = new JPanel();
    private JPanel wrapPanel = new JPanel();
    private JLabel message = new JLabel();
    private AddStudent newStudentForm;
    private AddGrade newGradeForm;
    private UpDateStudent upDateStudent;
    private JLabel fullName = new JLabel();
    private String [] menuButtonsArray = {"Add Students","Add Grades",
                                        "UpDate Student","UpDate Grades",
                                        "View Students","View Grades",
                                        "Delete Students","Delete Grades"};

    private JButton [] menuButtons = new JButton[menuButtonsArray.length];
    int index =0;
    public SchoolMenu()
    {
    
        for(index=0;index<menuButtonsArray.length;index++)
            {
                menuButtons[index] = new JButton(menuButtonsArray[index]);
                menuPanel.add(menuButtons[index]);
                menuButtons[index].setPreferredSize(new Dimension(150,40));
                menuButtons[index].setFocusPainted(false);
                menuButtons[index].setFont(new Font("Ariel",Font.BOLD,14));
                menuButtons[index].setForeground(Color.WHITE);
                
                if(index == 6 || index == 7)
                    {
                        menuButtons[index].setBackground(Color.RED);

                    }
                else
                    {
                        menuButtons[index].setBackground(Color.BLUE);
                        
                    }
            }
            
            /*-----
                Adding Actionlistener to the buttons by index
            ---- */

            



            menuButtons[0].addActionListener(e -> {
            if (newStudentForm == null)
                {
                    newStudentForm = new AddStudent();
                    
                    
                }

            formPanel = newStudentForm.getAddStudentJPanel();
            menu.getContentPane().removeAll();
            menu.add(wrapPanel, BorderLayout.NORTH); // re-add header
            menu.add(menuPanel, BorderLayout.WEST);  // re-add sidebar
            menu.add(formPanel, BorderLayout.CENTER); // now add new panel

            menu.revalidate();
            menu.repaint();
            
            
        });

        
            menuButtons[1].addActionListener(e ->{

            if(newGradeForm == null)
                {
                    newGradeForm = new AddGrade();
                }

            formPanel = newGradeForm.getAddGradeJPanel();
            menu.getContentPane().removeAll();
            menu.add(wrapPanel, BorderLayout.NORTH); // re-add header
            menu.add(menuPanel, BorderLayout.WEST);  // re-add sidebar
            menu.add(formPanel, BorderLayout.CENTER); // now add new panel

            menu.revalidate();
            menu.repaint();
            
        });

            menuButtons[2].addActionListener(e ->{
             if(upDateStudent == null)
                {
                    upDateStudent= new UpDateStudent();
                }

            formPanel = upDateStudent.getUpDateStudentPanel();
            menu.getContentPane().removeAll();
            menu.add(wrapPanel, BorderLayout.NORTH); // re-add header
            menu.add(menuPanel, BorderLayout.WEST);  // re-add sidebar
            menu.add(formPanel, BorderLayout.CENTER); // now add new panel

            menu.revalidate();
            menu.repaint();
        });

            menuButtons[3].addActionListener(e ->{
            System.out.println("UpDate Grades!");
        });

            menuButtons[4].addActionListener(e ->{
            System.out.println("View Students!");
        });

            menuButtons[5].addActionListener(e ->{
            System.out.println("View Grades!");
        });

            menuButtons[6].addActionListener(e ->{
            System.out.println("Delete Student!");
        });

            menuButtons[7].addActionListener(e ->{
            System.out.println("Delete Grades!");
        });


        wrapPanel.setLayout(new BorderLayout());
        wrapPanel.setOpaque(false);
        menuPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        menu.setLayout(new BorderLayout());
        menuPanel.setBackground(Color.GREEN);
        menuPanel.setPreferredSize(new Dimension(200,600));
        menuPanel.setBorder(new EmptyBorder(50,10,0,10));
        

        message.setText("Welocome Teacher,");
        

        fullName.setText("Hamed Zon :)");
        
        
        welcomePanel.setLayout(new GridLayout(2,1));
        welcomePanel.setPreferredSize(new Dimension(200,70));
        welcomePanel.setBorder(new EmptyBorder(10,40,10,0));
        welcomePanel.add(message);
        welcomePanel.add(fullName);
        
        welcomePanel.setBackground(Color.ORANGE);
        wrapPanel.add(welcomePanel, BorderLayout.WEST);

        menu.add(wrapPanel,BorderLayout.NORTH);
        
        
        //newStudentForm.setLayout(new BorderLayout());
        menu.add(menuPanel,BorderLayout.WEST);
        menu.setVisible(true);
     
    }

    
    public static void main(String[] args) {
        new SchoolMenu();
    }
}