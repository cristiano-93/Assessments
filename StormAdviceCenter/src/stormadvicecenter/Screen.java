package stormadvicecenter;

import java.util.Scanner;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Cristiano
 */
public class Screen extends JFrame implements ActionListener 
{
    private GridBagConstraints constraints;    
    
    private JLabel lbltype;
    private JLabel lblname;
    private JLabel lblwind;
    private JLabel lbltemp;  
    private JLabel lblscreen;
    private JLabel lbladvice;
    
    private JTextField txttype;
    private JTextField txtname;
    private JTextField txtwind;
    private JTextField txttemp;
           
    private JButton btnAdd;
    private JButton btnEdit;
    private JButton btnRemove;
    private JButton btnSearch;
    private JButton btnDisplay;
    
    private AdviceCenter ac;
    private Storm s;
    
    
    public Screen()
	{
		this.setTitle("Storm Advice Center");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setLayout(new GridBagLayout());
                constraints = new GridBagConstraints();
                
		ac = new AdviceCenter();
                
		// Set up our components
		initComponents();
		
		// Create layout
		layoutComponents();
        }
    public void initComponents()
        {
            lbltype = new JLabel("Storm Type");
            lblname = new JLabel("Storm Name");
            lblwind = new JLabel("Wind Speed");
            lbltemp = new JLabel("Temperature"); 
            lblscreen = new JLabel("Screen");
            lbladvice = new JLabel("Advice");

            txtname = new JTextField();// setting char limit to 50
            txttype = new JTextField();
            txtwind = new JTextField();
            txttemp = new JTextField();
            
            btnAdd = new JButton    ("     Add    ");
            btnAdd.addActionListener(this);
            btnEdit = new JButton   ("    Edit    ");
            btnEdit.addActionListener(this);
            btnSearch = new JButton ("   Search   ");
            btnSearch.addActionListener(this);
            btnDisplay = new JButton("Display All");
            btnDisplay.addActionListener(this);
            btnRemove = new JButton ("   Remove   ");
            btnRemove.addActionListener(this);
        }
    public void layoutComponents()
        {
            constraints.gridy = 0;
            constraints.gridx = 0;
            constraints.gridwidth = 3;
            this.add(lbltype, constraints);
            constraints.fill = GridBagConstraints.HORIZONTAL;
            
            constraints.gridx = 4;
            this.add(txttype, constraints);
            
            constraints.gridy = 1;
            constraints.gridx = 0;
            this.add(lblname, constraints);
            
            constraints.gridx = 4;
            this.add(txtname, constraints);
                                   
            constraints.gridy = 2;
            constraints.gridx = 0;
            this.add(lblwind, constraints);
            
            constraints.gridx = 4;
            this.add(txtwind, constraints);
                        
            constraints.gridy = 3;
            constraints.gridx = 0;
            this.add(lbltemp, constraints);
            
            constraints.gridx = 4;
            this.add(txttemp, constraints);            
            
            constraints.fill = GridBagConstraints.NONE;            
            constraints.gridy = 4;
            constraints.gridx = 0;
            constraints.gridwidth = 2;
            this.add(btnAdd, constraints);
            
            constraints.gridx = 2;
            this.add(btnEdit, constraints);
                                    
            constraints.gridx = 4;
            this.add(btnRemove, constraints);     
            
            constraints.gridy = 5;
            constraints.gridx = 0;
            constraints.gridwidth = 3;
            this.add(btnSearch, constraints);
            
            constraints.gridx = 3;
            this.add(btnDisplay, constraints);
            
            constraints.gridy = 6;
            constraints.gridx = 0;
            constraints.gridwidth = 6;
            this.add(lblscreen, constraints);
            
            constraints.gridy = 7;
            constraints.gridx = 0;
            this.add(lbladvice, constraints);
        }
    //@Override
    public void actionPerformed(ActionEvent ev)
        {            
            
            
            if(ev.getSource().equals(btnAdd))
            {
                String type = txttype.getText();
                String name = txtname.getText();
                int wind = Integer.parseInt(txtwind.getText());
                int temp = Integer.parseInt(txttemp.getText());
                
                 Storm s = null;//copy from javaapp1
                
                if(type.equals("Hurricane"))
                {
                    s = new Hurricane(name, wind, temp);                   
                }
                else if(type.equals("Tornado"))
                {
                    s = new Tornado(name, wind, temp);                   
                }
                else if(type.equals("Blizzard"))
                {
                    s = new Blizzard(name, wind, temp);                    
                }
                else //not working
                {
                    lblscreen.setText("Storm type not Supported");
                }
                
                if(ac.addStorm(s))
                {
                    lblscreen.setText("Storm Added");
                }
                else
                {
                    lblscreen.setText("Storm not Added**********needs better text**********");
                }
            }
            else if(ev.getSource().equals(btnEdit))
            {
                String nameIn = txtname.getText();
                int windIn = Integer.parseInt(txtwind.getText());
                int tempIn = Integer.parseInt(txttemp.getText());
                
                ac.edit(nameIn, windIn, tempIn);
            }
            else if(ev.getSource().equals(btnSearch))
            {
                String name = txtname.getText();
                //ac.search(name);
                 lblscreen.setText(ac.search(name));
                 lbladvice.setText(s.getAdvice());      //advice not showing
                
            }
            else if(ev.getSource().equals(btnDisplay))
            {
                
                lblscreen.setText(ac.display());
                
            }  
            else if(ev.getSource().equals(btnRemove))
            {
                String name = txtname.getText();             
                
                if(ac.removeStorm(name))
                {
                    lblscreen.setText("Storm Removed");
                }
                else
                {
                    lblscreen.setText("Storm not found");
                }
            }
            
        }
    
}
