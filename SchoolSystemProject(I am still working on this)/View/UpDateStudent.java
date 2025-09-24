package View;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class UpDateStudent extends AddGrade
{

    private JPanel upDateStudentPanel;
    private JTable table;
    private JScrollPane scrollPane;
    private final String [] COLUMMNAMESARRAY = {"ID","FirstName","LastName","DOB","Address"};

    private Object [][] data = {
                                    {"C003","Hamed","Zon","28-12-1999","21 somewhere in kilkenny"},
                                    {"C001","Ali","Colum","02-01-2003","01 Dublin "},
                                    {"C002","K","Lyon","28-12-1999","30 Carlow"},
                                    /* 
                                     {"C003","Hamed","Zon","28-12-1999","21 somewhere in kilkenny"},
                                    {"C001","Ali","Colum","02-01-2003","01 Dublin "},
                                    {"C002","K","Lyon","28-12-1999","30 Carlow"},

                                     {"C003","Hamed","Zon","28-12-1999","21 somewhere in kilkenny"},
                                    {"C001","Ali","Colum","02-01-2003","01 Dublin "},
                                    {"C002","K","Lyon","28-12-1999","30 Carlow"},

                                     {"C003","Hamed","Zon","28-12-1999","21 somewhere in kilkenny"},
                                    {"C001","Ali","Colum","02-01-2003","01 Dublin "},
                                    {"C002","K","Lyon","28-12-1999","30 Carlow"},
                                     {"C003","Hamed","Zon","28-12-1999","21 somewhere in kilkenny"},
                                    {"C001","Ali","Colum","02-01-2003","01 Dublin "},
                                    {"C002","K","Lyon","28-12-1999","30 Carlow"},
                                     {"C003","Hamed","Zon","28-12-1999","21 somewhere in kilkenny"},
                                    {"C001","Ali","Colum","02-01-2003","01 Dublin "},
                                    {"C002","K","Lyon","28-12-1999","30 Carlow"},
                                     {"C003","Hamed","Zon","28-12-1999","21 somewhere in kilkenny"},
                                    {"C001","Ali","Colum","02-01-2003","01 Dublin "},
                                    {"C002","K","Lyon","28-12-1999","30 Carlow"},
                                     {"C003","Hamed","Zon","28-12-1999","21 somewhere in kilkenny"},
                                    {"C001","Ali","Colum","02-01-2003","01 Dublin "},
                                    {"C002","K","Lyon","28-12-1999","30 Carlow"},
                                     {"C003","Hamed","Zon","28-12-1999","21 somewhere in kilkenny"},
                                    {"C001","Ali","Colum","02-01-2003","01 Dublin "},
                                    {"C002","K","Lyon","28-12-1999","30 Carlow"},
                                     {"C003","Hamed","Zon","28-12-1999","21 somewhere in kilkenny"},
                                    {"C001","Ali","Colum","02-01-2003","01 Dublin "},
                                    {"C002","K","Lyon","28-12-1999","30 Carlow"},
                                     {"C003","Hamed","Zon","28-12-1999","21 somewhere in kilkenny"},
                                    {"C001","Ali","Colum","02-01-2003","01 Dublin "},
                                    {"C002","K","Lyon","28-12-1999","30 Carlow"},
                                     {"C003","Hamed","Zon","28-12-1999","21 somewhere in kilkenny"},
                                    {"C001","Ali","Colum","02-01-2003","01 Dublin "},
                                    {"C002","K","Lyon","28-12-1999","30 Carlow"},
                                     {"C003","Hamed","Zon","28-12-1999","21 somewhere in kilkenny"},
                                    {"C001","Ali","Colum","02-01-2003","01 Dublin "},
                                    {"C002","K","Lyon","28-12-1999","30 Carlow"},
                                     {"C003","Hamed","Zon","28-12-1999","21 somewhere in kilkenny"},
                                    {"C001","Ali","Colum","02-01-2003","01 Dublin "},
                                    {"C002","K","Lyon","28-12-1999","30 Carlow"}*/

                                };
    public UpDateStudent()
    {
        
        setTable();
        setUpDateStudentPanel();
        
    }

   
    private void setTable()
    
    {
        table = new JTable(data,COLUMMNAMESARRAY);
        //table.setAutoCreateRowSorter(true);
        //table.setFillsViewportHeight(true);
        //table.setBackground(new Color(75,0,130));
        scrollPane = new JScrollPane(table);
        
        //scrollPane.setBounds(20, 20, 600, 200);

    }
    public void setUpDateStudentPanel()
    {
        upDateStudentPanel = new JPanel();
        upDateStudentPanel.setLayout(new BorderLayout());
        //upDateStudentPanel.setLayout(null);
        upDateStudentPanel.add(scrollPane,BorderLayout.CENTER);
    }


    
    public JPanel getUpDateStudentPanel()
    {
        return upDateStudentPanel;
    }
}