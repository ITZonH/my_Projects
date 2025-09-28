package View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Arrays;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import model.UserCreateAccountDAO;
import model.UserCreateAccount;

import javax.swing.JButton;


public class CreateAccount 
{
   SchoolFrame createAcoount = new SchoolFrame();
   private JLabel firstName = new JLabel();
   private JLabel lastName = new JLabel();
   private JLabel newPassword = new JLabel();
   private JLabel confirmPassword = new JLabel();
   private JLabel email = new JLabel();
   private JLabel createAccountLabel = new JLabel();
   JPanel mainPanel = new JPanel();
   JPanel createAccountTitlePanel = new JPanel();
   JPanel inputPanel = new JPanel();
   private JTextField emailField = new JTextField();
   private JTextField firstNameFiled = new JTextField();
   private JTextField lastNameFiled = new JTextField();
   private JPasswordField newPasswordField = new JPasswordField();
   private JPasswordField confirmPasswordField = new JPasswordField();
   private JButton createAccountBotton = new JButton();
   JButton logInBotton = new JButton();
   
    

    CreateAccount()
    {
        firstName.setText("First Name:");
        lastName.setText("Last Name:");
        email.setText("Email:");
        newPassword.setText("Password:");
        confirmPassword.setText("Confirm Password:");
        createAccountBotton.setText("Sign Up");
        createAccountLabel.setText("Create Account!");
        logInBotton.setText("LogIn!");

        createAccountBotton.setFont(new Font("Ariel",Font.BOLD,20));
        
        logInBotton.setFont(new Font("Ariel",Font.BOLD,15));
        email.setFont(new Font("Ariel",Font.BOLD,15));
        newPassword.setFont(new Font("Ariel",Font.BOLD,15));
        emailField.setFont(new Font("Ariel",Font.BOLD,15));
        newPasswordField.setFont(new Font("Ariel",Font.BOLD,15));
        confirmPasswordField.setFont(new Font("Ariel",Font.BOLD,15));
        lastNameFiled.setFont(new Font("Ariel",Font.BOLD,15));
        firstNameFiled.setFont(new Font("Ariel",Font.BOLD,15));
        firstName.setFont(new Font("Ariel",Font.BOLD,15));
        lastName.setFont(new Font("Ariel",Font.BOLD,15));
        confirmPassword.setFont(new Font("Ariel",Font.BOLD,15));
        createAccountLabel.setFont(new Font("Ariel",Font.BOLD,18));
       

         //Adding colors
        logInBotton.setBackground(new Color(200,230,250));

        //making the button look line plain text
        logInBotton.setContentAreaFilled(false);
        logInBotton.setBorderPainted(false);
        logInBotton.setForeground(Color.BLUE);
        logInBotton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logInBotton.setOpaque(false);
        logInBotton.setFocusPainted(false);
        
        

        //inputPanel.setLayout(new GridLayout(4,1 ,10,5));
        //inputPanel.setLayout(new FlowLayout());

        

        mainPanel.setBackground(new Color(200,250,255));
        inputPanel.setBackground(new Color(200,230,250));
        createAccountTitlePanel.setBackground(new Color(33,230,250));
        createAccountBotton.setBackground(Color.ORANGE);

        
        
        

        // no layout manager
        createAccountTitlePanel.setLayout(null);
        inputPanel.setLayout(null);
        mainPanel.setLayout(null);
        
       
        
        
        //creating dimensions
        mainPanel.setPreferredSize(new Dimension(600,700));
        inputPanel.setPreferredSize(new Dimension(500,600));
        createAccountTitlePanel.setPreferredSize(new Dimension(400,30));
        
       
        //positioning components since no layout manager
        createAccountTitlePanel.setBounds(450,80,400,60);
        createAccountLabel.setBounds(120,0,150,60);
        inputPanel.setBounds(450,130,400,480);
        firstName.setBounds(100,50,200,30);
        firstNameFiled.setBounds(100,80,200,30);
        lastName.setBounds(100,110,200,30);
        lastNameFiled.setBounds(100,140,200,30);
        email.setBounds(100,170,200,30);
        emailField.setBounds(100,200,200,30);
        newPassword.setBounds(100,220,200,50);
        newPasswordField.setBounds(100,260,200,30);

        confirmPassword.setBounds(100,290,150,30);
        confirmPasswordField.setBounds(100,320,200,30);
        createAccountBotton.setBounds(100,380,200,40);
        logInBotton.setBounds(100,430,200,30);
        createAccountBotton.setFocusPainted(false);
        
        
        
        
        createAccountTitlePanel.add(createAccountLabel);
        mainPanel.add(createAccountTitlePanel);

        inputPanel.add(firstName);
        inputPanel.add(firstNameFiled);
        inputPanel.add(lastName);
        inputPanel.add(lastNameFiled);
        inputPanel.add(email);
        inputPanel.add(emailField);
        inputPanel.add(newPassword);
        inputPanel.add(newPasswordField);
        inputPanel.add(confirmPassword);
        inputPanel.add(confirmPasswordField);
        inputPanel.add(createAccountBotton);
        inputPanel.add(logInBotton);
        mainPanel.add(inputPanel);
        
      
        createAcoount.setLayout(new BorderLayout());
        createAcoount.add(mainPanel,BorderLayout.CENTER);
       
        createAcoount.setVisible(true);


        createAccountBotton.addActionListener(e->
        {
            String fname = firstNameFiled.getText().trim();
            String lName = lastNameFiled.getText().trim();
            String email = emailField.getText().trim();
            char [] newPassword = confirmPasswordField.getPassword();
            char [] confPss = confirmPasswordField.getPassword();

            String pass = new String(newPassword);
            String cPass = new String(newPassword);
            UserCreateAccount user = new UserCreateAccount(email, pass, cPass, fname, lName);
            boolean created = new UserCreateAccountDAO().createUser(user);
            Arrays.fill(newPassword, '\0');
            Arrays.fill(confPss, '\0');

            if(!fname.isEmpty() || !lName.isEmpty() || !email.isEmpty() || newPassword.length != 0 || confPss.length != 0 )
            {
                if(newPasswordField.getPassword().equals(confirmPasswordField.getPassword()))
                {
                    if(created)
                    {
                        new SchoolLogin(); 
                        createAcoount.dispose();
                    }
                    
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Failed to create account. Check console for details.", "Error", JOptionPane.ERROR_MESSAGE);

                    }

                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "Password don't match."," Validation ", JOptionPane.WARNING_MESSAGE);
                }
                
            }

            
            else
            {
                JOptionPane.showMessageDialog(null, " All fields required."," Validation ", JOptionPane.WARNING_MESSAGE);
            }

        });

        
        logInBotton.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            @Override
            public void mousePressed(java.awt.event.MouseEvent e) 
            {
                logInBotton.setLocation(logInBotton.getX(), logInBotton.getY() + 2);
            
                new SchoolLogin();
                createAcoount.dispose();
            }
            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) 
            {
                logInBotton.setLocation(logInBotton.getX(), logInBotton.getY() - 2);
            }
        });

        
    }







    public static void main(String[] args) {
        new CreateAccount();
    }
}