

package ac.za.cput.userprojectgui;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.*;


/**
 *
 * @author mbali
 */
public class UserGui extends JFrame implements ActionListener{
    private JPanel panelWest, panelSouth, panelNorth, panelLabel, panelEast;
    private JLabel labelUsername, labelPassword;
    private JTextField txtUsername;
    private JTextField txtPassword;
    private JButton btnLogin, btnClear, btnExit;
    
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem itemLogin, itemClear, itemExit;
    private Font ft1, ft2;
    

    public UserGui(){
        super("User Authentication");
        panelWest = new JPanel();
        panelSouth = new JPanel();
        panelLabel = new JPanel();
        panelNorth = new JPanel();
        panelEast = new JPanel();
        
        labelUsername = new JLabel("Username:");
        labelPassword = new JLabel("Password: ");
       
        txtUsername = new JTextField();
        txtPassword = new JTextField();
        
        btnLogin = new JButton("Login");
        btnClear = new JButton("Clear");
        btnExit = new JButton("Exit");
        
        btnLogin.setBackground(Color.red);
        btnClear.setBackground(Color.green);
        btnExit.setBackground(Color.blue);
    }
   
    public void setUserGui(){
        panelWest.add(labelUsername);
        panelWest.add(labelPassword);
        panelEast.add(txtUsername);
        panelEast.add(txtPassword);
        
        panelWest.setLayout(new GridLayout(2, 1));
        panelEast.setLayout(new GridLayout(2,1));
        panelSouth.setLayout(new GridLayout(1, 3));
        panelEast.setPreferredSize(new Dimension(200, 20));
        
        panelLabel.setLayout(new BorderLayout());
        
        this.add(panelWest,BorderLayout.WEST);
        this.add(panelSouth,BorderLayout.SOUTH);
        this.add(panelEast, BorderLayout.EAST);
     
        
        labelUsername = new JLabel("Username:");
        labelPassword = new JLabel("Password: ");
       
        txtUsername = new JTextField();
        txtPassword = new JTextField();
        
       
        panelSouth.add(btnLogin);
        panelSouth.add(btnClear);
        panelSouth.add(btnExit);
        
        btnLogin.addActionListener(this);
        btnClear.addActionListener(this);
        btnExit.addActionListener(this);
        
        
    
       
       
    }
    
     

    @Override
    public void actionPerformed(ActionEvent e) {
          ArrayList<User> users = new ArrayList<User>();
          users.add(new User("Motlalepula", "Kgatlhane"));
          if(e.getSource() == btnExit){
               System.exit(0);
          }
             
          if(e.getSource() == btnClear){
              txtUsername.setText(null);
              txtPassword.setText(null);
          }
          
          if(e.getSource() == btnLogin){
              Boolean operator;
              operator = true;
              
              for (int i = 0; i < users.size(); i++) {
             if (users.get(i).getUsername().equals(txtUsername.getText())
                        && users.get(i).getPassword().equals(txtPassword.getText())) {
                    JOptionPane.showMessageDialog(null, "Login Successful");
                    operator = false;
                    break;

                }

            }
            if (operator) {
                JOptionPane.showMessageDialog(null, "Invalid username or password");

            }

          }
          }
          
          
        }   

