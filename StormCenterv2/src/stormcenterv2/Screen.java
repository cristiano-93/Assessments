package stormcenterv2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Cristiano
 */
public class Screen extends JFrame implements ActionListener
    {
        private JPanel panelAddStorm;
        private JPanel panelButtons;
        private JPanel panelScreen;
        
        private JLabel lblname;
        private JLabel lblwind;
        private JLabel lbltemp;
        private JLabel lbltype;

        private JTextField txtname;
        private JTextField txtwind;
        private JTextField txttemp;

        private JButton btnAdd;
        private JButton btnEdit;
        private JButton btnRemove;
        private JButton btnSearch;
        private JButton btnApply;
        private JButton btnCancel;

        private JTextArea txtascreen;
        private JComboBox combox;
        
        private Center center;
        
    public Screen()
    {
        this.setTitle("Storm Advice Center"); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        BoxLayout box = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
        this.setLayout(box);
        this.pack();
        this.setVisible(true);
        center = new Center();
       
        //Initiating the components
        initComponents(); 
        AddPanelAddStorm();
        AddPanelButtons();
        AddPanelScreen();
    }
    
    private void initComponents()
    {    
        lbltype = new JLabel("Storm Type");
        lblname = new JLabel("Storm Name");
        lblwind = new JLabel("Wind Speed");
        lbltemp = new JLabel("Temperature");
        
        txtname = new JTextField(20);
        txtwind = new JTextField(20);
        txttemp = new JTextField(20);

        btnAdd = new JButton    ("Add");
        btnAdd.setPreferredSize(new Dimension(90, 30));
        btnAdd.addActionListener(this);
        btnEdit = new JButton   ("Edit"); 
        btnEdit.setPreferredSize(new Dimension(90, 30));
        btnEdit.addActionListener(this);
        btnSearch = new JButton ("Search");
        btnSearch.setPreferredSize(new Dimension(90, 30));
        btnSearch.addActionListener(this);
        btnRemove = new JButton ("Remove");
        btnRemove.setPreferredSize(new Dimension(90, 30));
        btnRemove.addActionListener(this);
        btnApply = new JButton ("Apply");
        btnApply.setPreferredSize(new Dimension(90, 30));
        btnApply.setForeground(Color.green);
        btnApply.addActionListener(this);
        btnCancel = new JButton ("Cancel");
        btnCancel.setPreferredSize(new Dimension(90, 30));
        btnCancel.setForeground(Color.RED);
        btnCancel.addActionListener(this);

        combox = new JComboBox();
        combox.addItem("Hurricane");
        combox.addItem("Tornado");
        combox.addItem("Blizzard");
        combox.setBackground(Color.WHITE);
        
        txtascreen = new JTextArea(8,36);
        txtascreen.setEditable(false);

        panelAddStorm = new JPanel(new GridBagLayout());
        panelButtons = new JPanel(new GridBagLayout());
        panelScreen = new JPanel(new GridBagLayout());                        
    }
    
    private void AddPanelAddStorm()
    {
        GridBagConstraints gbc = new GridBagConstraints();
        panelAddStorm.setLayout(new GridBagLayout());
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(10, 10, 10, 10);
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridy = 0;
        gbc.gridx = 0;
        panelAddStorm.add(lbltype, gbc);
        
        gbc.gridx = 1;
        panelAddStorm.add(combox, gbc);  
        
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridy = 1;
        gbc.gridx = 0;
        panelAddStorm.add(lblname, gbc);
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        panelAddStorm.add(txtname, gbc);
        
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridy = 2;
        gbc.gridx = 0;
        panelAddStorm.add(lblwind, gbc);
        
        gbc.fill = GridBagConstraints.HORIZONTAL;        
        gbc.gridx = 1;
        panelAddStorm.add(txtwind, gbc);
        
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridy = 3;
        gbc.gridx = 0;
        panelAddStorm.add(lbltemp, gbc);
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        panelAddStorm.add(txttemp, gbc);
        
        this.add(panelAddStorm);
    }
    
    private void AddPanelButtons()
    {
        GridBagConstraints gbc = new GridBagConstraints();
        panelButtons.setLayout(new GridBagLayout());
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridwidth = 2;
        
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridy = 0;
        gbc.gridx = 0;
        panelButtons.add(btnAdd, gbc);
                               
        gbc.gridx = 2;
        panelButtons.add(btnRemove, gbc);                                     
               
        gbc.gridx = 4;
        panelButtons.add(btnSearch, gbc);
        
        gbc.gridy = 1;
        gbc.gridx = 0;
        panelButtons.add(btnApply, gbc);
        btnApply.setVisible(false);
        
        gbc.gridx = 2;
        panelButtons.add(btnEdit, gbc);
        
        gbc.gridx = 4;
        panelButtons.add(btnCancel, gbc);
        btnCancel.setVisible(false);
        
        this.add(panelButtons); 
    }
    
    private void AddPanelScreen()
    {
        GridBagConstraints gbc = new GridBagConstraints();
        panelScreen.setLayout(new GridBagLayout());
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(10, 10, 10, 10);
        
        gbc.fill = GridBagConstraints.NONE;        
        gbc.gridy = 0;
        gbc.gridx = 0;
        panelScreen.add(txtascreen, gbc);
        
        this.add(panelScreen);
    }
    
    private void clearInput()
    {
        txtname.setText(null);
        txtwind.setText(null);
        txttemp.setText(null);
    }
    
    public void actionPerformed(ActionEvent ev)
        {            
            
            
            if(ev.getSource().equals(btnAdd))
            {
                String typeInput = combox.getSelectedItem().toString();                
                String nameInput = txtname.getText();
                int windInput = Integer.parseInt(txtwind.getText());
                int tempInput = Integer.parseInt(txttemp.getText());
                txtascreen.setText(null);                                     
                txtascreen.append(center.addStorm(nameInput, windInput, tempInput, typeInput)+center.output(nameInput)); 
                clearInput();
            }
            else if(ev.getSource().equals(btnEdit))
            {                
                txtascreen.setText(null);
                txtwind.setEditable(true);
                txttemp.setEditable(true);
                btnApply.setVisible(true);
                btnCancel.setVisible(true);
                                                
                String nameIn = txtname.getText();
                txtwind.setText(center.editPrintWind(nameIn));
                txttemp.setText(center.editPrintTemp(nameIn));
            }                
            else if(ev.getSource().equals(btnApply))
            {                 
                String nameIn = txtname.getText();
                int windIn = Integer.parseInt(txtwind.getText());        
                int tempIn = Integer.parseInt(txttemp.getText());
                txtascreen.setText(center.editStorm(nameIn, windIn, tempIn)+center.output(nameIn));
                
                btnApply.setVisible(false);
                btnCancel.setVisible(false);
                clearInput();
            }
            else if(ev.getSource().equals(btnCancel))
            {
                btnApply.setVisible(false);
                btnCancel.setVisible(false);  
                clearInput();
            }                         
            else if(ev.getSource().equals(btnSearch))              
            {
                String nameIn = txtname.getText();  
                txtascreen.setText(null);
                txtascreen.append(center.searchStorm(nameIn));                
            }
            else if(ev.getSource().equals(btnRemove))
            {
                String nameIn = txtname.getText();             
                txtascreen.setText(null);
                if(center.removeStorm(nameIn))
                {
                    txtascreen.append("Storm "+nameIn+" has been removed");
                }
                else       
                {
                    txtascreen.append("Storm not found");
                }
            }            
        }    
}
