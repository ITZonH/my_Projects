package View;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;



public class AddStudent
{
    /*
        Autor : Hamed Zon
        date 25/08/2025
        This is the front end of the add student FORM.
        Jave Swing is use for the user interface
    
    */
    private Font H1 = new Font("Arial",Font.BOLD,18);
    private Font buttonsfont = new Font("Arial",Font.BOLD,15);
    private Font textFont = new Font("Arial",Font.BOLD,15);
    private EmptyBorder emptyBorder = new EmptyBorder(0,20,0,20);
    private Color emgFColor = new Color(205,10,130);
    private Color labelsColor = new Color(255,250,250);
    private JPanel inputPanel = new JPanel();
    private final JLabel HEADER = new JLabel();
    private JLabel dOb = new JLabel();
    private JTextField firstNameF = new JTextField();
    private JTextField lastNameF = new JTextField();
    private SpinnerDateModel model = new SpinnerDateModel();
    private JSpinner dateSpinner =new JSpinner(model);
    private JLabel firstName = new JLabel();
    private JLabel lastName = new JLabel();
    private JRadioButton fButton = new JRadioButton();
    private JRadioButton mButton = new JRadioButton();
    private JRadioButton pfn = new JRadioButton();
    private ButtonGroup group = new ButtonGroup();
    private JLabel emergence = new JLabel();
    private JLabel emrgName = new JLabel();
    private JLabel emrgContact = new JLabel();
    private JTextField emrgNameField= new JTextField();
    private JTextField emrgContactField = new JTextField();
    private JLabel address = new JLabel();
    private JTextField addressField = new JTextField();
    private JLabel eircode = new JLabel();
    private JTextField eirField = new JTextField();
    private JButton sButton = new JButton();
    private JButton cButton = new JButton();


   public AddStudent()
    {

        sButton.setText("Submit");
        sButton.setForeground(labelsColor);
        sButton.setFont(buttonsfont);

        cButton.setText("Cancel");
        cButton.setForeground(labelsColor);
        cButton.setFont(buttonsfont);

        sButton.setBackground(Color.ORANGE);
        sButton.setFocusPainted(false);
        sButton.setBounds(400,500,100,50);

        cButton.setBackground(Color.RED);
        cButton.setFocusPainted(false);
        cButton.setBounds(530,500,100,50);

        eircode.setText("Eircode:");
        eircode.setForeground(labelsColor);
        eircode.setFont(textFont);
        eircode.setBounds(510,430,100,20);

        eirField.setFont(textFont);
        eirField.setBackground(emgFColor);
        eirField.setForeground(labelsColor);
        eirField.setCaretColor(labelsColor);
        eirField.setBorder(emptyBorder);
        eirField.setBounds(600,420,200,50);

        address.setText("Address:");
        address.setFont(textFont);
        address.setBounds(200,430,100,20);
        address.setForeground(labelsColor);

        addressField.setBounds(300,420,200,50);
        addressField.setBackground(emgFColor);
        addressField.setCaretColor(labelsColor);
        addressField.setBorder(emptyBorder);
        addressField.setForeground(labelsColor);
        addressField.setFont(textFont);


        emergence.setText("EMERGENCY CONTACT!");
        emergence.setBounds(400,260,300,50);
        emergence.setFont(getHeaderFont());
        emergence.setForeground(labelsColor);


        emrgContact.setText("Tel:");
        emrgContact.setForeground(labelsColor);
        emrgContact.setBounds(620, 330, 50, 30);
        emrgContact.setFont(textFont);


        emrgContactField.setBounds(670,320,200,50);
        emrgContactField.setBackground(emgFColor);
        emrgContactField.setFont(textFont);
        emrgContactField.setBorder(emptyBorder);
        emrgContactField.setForeground(labelsColor);
        emrgContactField.setCaretColor(labelsColor);

        emrgName.setText("Full Name:");
        emrgName.setForeground(labelsColor);
        emrgName.setFont(textFont);
        emrgName.setBounds(200,330,130,20);

        emrgNameField.setBounds(310,320,300,50);
        emrgNameField.setForeground(labelsColor);
        emrgNameField.setBackground(emgFColor);
        emrgNameField.setCaretColor(labelsColor);
        emrgNameField.setBorder(emptyBorder);
        emrgNameField.setFont(textFont);



        mButton.setText("Male:");
        mButton.setFont(buttonsfont);
        mButton.setForeground(Color.BLACK);
        mButton.setBounds(520,218,70,20);
        mButton.setHorizontalTextPosition(SwingConstants.LEFT);
        mButton.setFocusPainted(false);
        mButton.setSelected(true);
        group.add(mButton);

        fButton.setText("Female:");
        fButton.setFont(buttonsfont);
        fButton.setForeground(Color.BLACK);
        fButton.setBounds(610,218,90,20);
        fButton.setFocusPainted(false);
        fButton.setHorizontalTextPosition(SwingConstants.LEFT);
        group.add(fButton);



        pfn.setText("Prefer not to say:");
        pfn.setFont(buttonsfont);
        pfn.setForeground(Color.BLACK);
        pfn.setBounds(720,218,150,20);
        pfn.setHorizontalTextPosition(SwingConstants.LEFT);
        pfn.setFocusPainted(false);
        group.add(pfn);


        JSpinner.DateEditor editor = new JSpinner.DateEditor(dateSpinner, "yyyy-MM-dd");
        dateSpinner.setEditor(editor);
        dateSpinner.setBounds(400,215,100,30);
        dateSpinner.setFont(getButtonsFont());
        inputPanel.setLayout(null);

        HEADER.setText("Add New Student!");
        HEADER.setFont(new Font("Arial",Font.BOLD,50));
        HEADER.setForeground(getTextOrLabelColor());
        HEADER.setBounds(300,15,500,60);

        firstName.setText("First Name:");
        firstName.setBounds(300,100,200,30);
        firstName.setFont(getTextFont());
        firstName.setForeground(getTextOrLabelColor());


        lastName.setText("Last Name:");
        lastName.setBounds(630,100,200,30);
        lastName.setFont(getTextFont());
        lastName.setForeground(getTextOrLabelColor());

        dOb.setText("Select or Enter DOB:");
        dOb.setBounds(200,215,200,30);
        dOb.setFont(getTextFont());
        dOb.setForeground(getTextOrLabelColor());


        firstNameF.setBounds(200,140,300,50);
        firstNameF.setBorder(getEmptyBorder());
        firstNameF.setBackground(getFieldColor());
        firstNameF.setForeground(getTextOrLabelColor());
        firstNameF.setFont(getTextFont());
        firstNameF.setCaretColor(getTextOrLabelColor());

        lastNameF.setBounds(530,140,300,50);;
        lastNameF.setBackground(getFieldColor());
        lastNameF.setForeground(getTextOrLabelColor());
        lastNameF.setFont(getTextFont());
        lastNameF.setBorder(getEmptyBorder());
        lastNameF.setCaretColor(getTextOrLabelColor());
        
        
        inputPanel.setBackground(new Color(75,0,130));
        inputPanel.add(HEADER);
        inputPanel.add(firstName);
        inputPanel.add(firstNameF);
        inputPanel.add(lastName);
        inputPanel.add(lastNameF);
        inputPanel.add(dOb);
        inputPanel.add(dateSpinner);
        inputPanel.add(mButton);
        inputPanel.add(fButton);
        inputPanel.add(pfn);
        inputPanel.add(emergence);
        inputPanel.add(emrgName);
        inputPanel.add(emrgNameField);
        inputPanel.add(emrgContact);
        inputPanel.add( emrgContactField );
        inputPanel.add(address);
        inputPanel.add(addressField);
        inputPanel.add(eircode);
        inputPanel.add(eirField);
        inputPanel.add(sButton);
        inputPanel.add(cButton);
        
        
        

        
    }

    public Font getHeaderFont()
    {
        return this.H1;
    }
    public Font getButtonsFont()
    {
        return this.buttonsfont;
    }

    public Font getTextFont()
    {
        return this.textFont;
    }

    public EmptyBorder getEmptyBorder()
    {
        return this.emptyBorder;
    }
    
    public Color getFieldColor()
    {
        return this.emgFColor;
    }
   
    public Color getTextOrLabelColor()
    {
        return this.labelsColor;
    }

    public JPanel getAddStudentJPanel()
    {
        return inputPanel;
    }

}