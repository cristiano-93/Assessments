package stormadvicecenter;

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
        private JLabel lblclass;

        private JTextField txtname;
        private JTextField txtwind;
        private JTextField txttemp;

        private JButton btnAdd;
        private JButton btnEdit;
        private JButton btnRemove;
        private JButton btnSearch;

        private JTextArea txtascreen;
        private JComboBox combox;

        String name;
        String wind;
        String temp;
        String type;
        
        private AdviceCenter ac;    
        
    public Screen()
    {
        this.setTitle("Storm Advice Center");
        //this.setSize(500, 500); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        BoxLayout box = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
        this.setLayout(box);
        this.pack();
        this.setVisible(true);
       
        //Initiate the components
        initComponents(); 
        AddPanelAddStorm();
        AddPanelButtons();
        AddPanelScreen();
    }
    public void initComponents()
    {    
        lbltype = new JLabel("Storm Type");
        lblname = new JLabel("Storm Name");
        lblwind = new JLabel("Wind Speed");
        lbltemp = new JLabel("Temperature");
        lblclass = new JLabel("Classification");            

        txtname = new JTextField(20);
        txtwind = new JTextField(20);
        txttemp = new JTextField(20);

        btnAdd = new JButton    ("   Add  ");  
        btnAdd.addActionListener(this);
        btnEdit = new JButton   ("  Edit  "); 
        btnEdit.addActionListener(this);
        btnSearch = new JButton (" Search ");                 
        btnSearch.addActionListener(this);
        btnRemove = new JButton (" Remove ");
        btnRemove.addActionListener(this);

        combox = new JComboBox();
        combox.addItem("Hurricane");
        combox.addItem("Tornado");
        combox.addItem("Blizzard");
        combox.setBackground(Color.WHITE);
        
        txtascreen = new JTextArea(6,36);
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
        //add insets??? look at end result
        
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
        
        gbc.fill = GridBagConstraints.NONE;//check if leaving it at NONE affects end result
        gbc.gridy = 0;
        gbc.gridx = 0;
        panelButtons.add(btnAdd, gbc);
        
        //gbc.fill = GridBagConstraints.NONE;        
        gbc.gridx = 1;
        panelButtons.add(btnRemove, gbc);
        
        //gbc.fill = GridBagConstraints.NONE;        
        gbc.gridx = 2;
        panelButtons.add(btnEdit, gbc);
        
        //gbc.fill = GridBagConstraints.NONE;        
        gbc.gridx = 3;
        panelButtons.add(btnSearch, gbc);
        
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
    //@Override
    public void actionPerformed(ActionEvent ev)
        {            
            
            
            if(ev.getSource().equals(btnAdd))
            {
                String type = combox.getSelectedItem().toString();
                String name = txtname.getText();
                int wind = Integer.parseInt(txtwind.getText());
                int temp = Integer.parseInt(txttemp.getText());
                txtascreen.setText(null);                       //check if this line is required
                
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
                    
                }
                
                if(ac.addStorm(s))
                {
                    txtascreen.append("Storm Added");
                }
                else
                {
                    txtascreen.append("<html>Storm System is operating at full capacity<BR>"
                            + "Unable to add any more storms to the system</html>");
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
                txtascreen.append(ac.search(name));                
            }
            else if(ev.getSource().equals(btnRemove))
            {
                String name = txtname.getText();             
                
                if(ac.removeStorm(name))
                {
                    txtascreen.append("Storm Removed");
                }
                else
                {
                    txtascreen.append("Storm not found");
                }
            }            
        }    
}
