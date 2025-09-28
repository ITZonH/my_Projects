package View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;


public class SchoolLogin
{
   SchoolFrame logInFrame = new SchoolFrame();
   JLabel email = new JLabel();
   JLabel password = new JLabel();
   JLabel logInLabel = new JLabel();
   JPanel mainPanel = new JPanel();
   JPanel logInTitlePanel = new JPanel();
   JPanel inputPanel = new JPanel();
   JTextField emailField = new JTextField();
   JPasswordField passwordField = new JPasswordField();
   JButton logInBotton = new JButton();
   JButton creatAccountBotton = new JButton();
    

    SchoolLogin()
    {
        email.setText("Email:");
        password.setText("Password:");
        logInBotton.setText("LogIn");
        creatAccountBotton.setText("No I don't an account!");
        logInLabel.setText("LogIn!");

        logInBotton.setFont(new Font("Ariel",Font.BOLD,20));
        creatAccountBotton.setFont(new Font("Ariel",Font.BOLD,15));
        email.setFont(new Font("Ariel",Font.BOLD,15));
        password.setFont(new Font("Ariel",Font.BOLD,15));
        emailField.setFont(new Font("Ariel",Font.BOLD,15));
        passwordField.setFont(new Font("Ariel",Font.BOLD,15));
        logInLabel.setFont(new Font("Ariel",Font.BOLD,18));
        
        logInBotton.setFocusPainted(false);
        creatAccountBotton.setFocusPainted(false);
        logInBotton.setBackground(Color.GREEN);

        //inputPanel.setLayout(new GridLayout(4,1 ,10,5));
        //inputPanel.setLayout(new FlowLayout());

        //Adding colors
        creatAccountBotton.setBackground(new Color(200,230,250));

        //making the button look line plain text
        creatAccountBotton.setContentAreaFilled(false);
        creatAccountBotton.setBorderPainted(false);
        creatAccountBotton.setForeground(Color.BLUE);
        creatAccountBotton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        creatAccountBotton.setOpaque(false);

        mainPanel.setBackground(new Color(200,250,255));
        inputPanel.setBackground(new Color(200,230,250));
        logInTitlePanel.setBackground(new Color(33,230,250));

        
        
        

        // no layout manager
        logInTitlePanel.setLayout(null);
        inputPanel.setLayout(null);
        mainPanel.setLayout(null);
        
       
        //creating spaces
        inputPanel.setBorder(new EmptyBorder(20,20,20,40));
        mainPanel.setBorder(new EmptyBorder(60,60,60,60));
        
        
        //creating dimensions
        mainPanel.setPreferredSize(new Dimension(600,600));
        inputPanel.setPreferredSize(new Dimension(400,500));
        logInTitlePanel.setPreferredSize(new Dimension(400,30));
        
       
        //positioning components since no layout manager
        logInTitlePanel.setBounds(450,80,400,60);
        logInLabel.setBounds(170,0,60,60);
        inputPanel.setBounds(450,130,400,480);
        email.setBounds(100,90,200,30);
        emailField.setBounds(100,130,200,30);

        password.setBounds(100,180,200,30);
        passwordField.setBounds(100,220,200,30);
        
        logInBotton.setBounds(150,300,100,50);
        creatAccountBotton.setBounds(100,400,200,50);
        
        
        logInTitlePanel.add(logInLabel);
        mainPanel.add(logInTitlePanel);
        inputPanel.add(email);
        inputPanel.add(emailField);
        inputPanel.add(password);
        inputPanel.add(passwordField);
        inputPanel.add(logInBotton);
        inputPanel.add(creatAccountBotton);
        mainPanel.add(inputPanel);
        
      
        logInFrame.setLayout(new BorderLayout());
        logInFrame.add(mainPanel,BorderLayout.CENTER);
       
        logInFrame.setVisible(true);


    logInBotton.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        new SchoolMenu();
        
    }
});
        

    creatAccountBotton.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        creatAccountBotton.setLocation(creatAccountBotton.getX(), creatAccountBotton.getY() + 2);
        new CreateAccount();
        logInFrame.dispose();
    }
    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        creatAccountBotton.setLocation(creatAccountBotton.getX(), creatAccountBotton.getY() - 2);
    }
});


        
    }







    public static void main(String[] args) {
        new SchoolLogin();
    }
}