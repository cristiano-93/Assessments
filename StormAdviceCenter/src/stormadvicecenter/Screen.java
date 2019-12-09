/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Screen extends JFrame //implements ActionListener 
{
    private GridBagConstraints constraints;
    
    private JLabel lbltitle;
    private JLabel lblname;
    private JLabel lblwind;
    private JLabel lbltemp;
    private JLabel lbladvice;
    private JLabel lblDname;
    private JLabel lblDwind;
    private JLabel lblDtemp;
    private JLabel lblRname;
    private JLabel lblRwind;
    private JLabel lblRtemp;
    
    private JTextField txtname;
    private JTextField txtwind;
    private JTextField txttemp;
    
    private JButton btnAdd;
    private JButton btnEdit;
    private JButton btnRemove;
    
    public Screen()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setLayout(new GridBagLayout());
                constraints = new GridBagConstraints();
		
		// Set up our components
		initComponents();
		
		// Create layout
		layoutComponents();
        }
    public void initComponents()
        {
            lbltitle = new JLabel("Storm Advice Center");
            lblname = new JLabel("Storm Name");
            lblwind = new JLabel("Wind Speed");
            lbltemp = new JLabel("Temperature");
            lbladvice = new JLabel("Storm Advice: ");
            lblDname = new JLabel("details: name");
            lblDwind = new JLabel("details: wind");
            lblDtemp = new JLabel("details: temperature");
            lblRname = new JLabel("name");
            lblRwind = new JLabel("wind");
            lblRtemp = new JLabel("temp");

            txtname = new JTextField();
            txtwind = new JTextField();
            txttemp = new JTextField();
            
            btnAdd = new JButton("Add");
            //btnAdd.addActionListener(this);
            btnEdit = new JButton("Edit");
            //btnEdit.addActionListener(this);
            btnRemove = new JButton("Remove");
            //btnRemove.addActionListener(this);
        }
    public void layoutComponents()
        {
            constraints.gridy = 0;
            constraints.gridx = 0;
            constraints.gridwidth = 6;
            this.add(lbltitle, constraints);
            constraints.fill = GridBagConstraints.HORIZONTAL;
            
            constraints.gridy = 1;
            constraints.gridwidth = 3;
            this.add(lblname, constraints);
            
            constraints.gridx = 3;
            this.add(txtname, constraints);
                                   
            constraints.gridy = 2;
            constraints.gridx = 0;
            this.add(lblwind, constraints);
            
            constraints.gridx = 3;
            this.add(txtwind, constraints);
                        
            constraints.gridy = 3;
            constraints.gridx = 0;
            this.add(lbltemp, constraints);
            
            constraints.gridx = 3;
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
            constraints.gridwidth = 6;
            this.add(lbladvice, constraints);
            
            constraints.gridy = 7;
            constraints.gridx = 0;
            constraints.gridwidth = 3;
            this.add(lblDname, constraints);
            
            constraints.gridx = 3;
            this.add(lblRname, constraints);
            
            constraints.gridy = 8;
            constraints.gridx = 0;
            this.add(lblDwind, constraints);
            
            constraints.gridx = 3;
            this.add(lblRwind, constraints);
            
            constraints.gridy = 9;
            constraints.gridx = 0;
            this.add(lblDtemp, constraints);
            
            constraints.gridx = 3;
            this.add(lblRtemp, constraints);
            
        }
    //@Override
    public void actionPerformed(ActionEvent ev)
        {
            
        }
    
}
