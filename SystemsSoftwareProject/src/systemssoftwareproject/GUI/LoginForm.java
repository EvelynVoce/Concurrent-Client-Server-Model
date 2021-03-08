package systemssoftwareproject.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LoginForm extends JFrame implements ActionListener {
    
    // Components
    private Container c;
    private JLabel title;
    private JLabel user;
    private JTextField userInp;
    private JLabel pass;
    private JTextField passInp;
    private JButton login;
    private JButton signup;
    
    public LoginForm() {
        setTitle("User Client");
        setBounds(300, 90, 600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        c = getContentPane();
        c.setLayout(null);
        
        title = new JLabel("User Client");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(25, 20);
        c.add(title);
        
        user= new JLabel("Username"); 
        user.setFont(new Font("Arial", Font.PLAIN, 20)); 
        user.setSize(100, 20); 
        user.setLocation(25, 80); 
        c.add(user); 
  
        userInp = new JTextField(); 
        userInp.setFont(new Font("Arial", Font.PLAIN, 15)); 
        userInp.setSize(190, 20);
        userInp.setLocation(150, 80); 
        c.add(userInp); 
  
        pass = new JLabel("Password"); 
        pass.setFont(new Font("Arial", Font.PLAIN, 20)); 
        pass.setSize(100, 20); 
        pass.setLocation(25, 130); 
        c.add(pass); 
  
        passInp = new JTextField(); 
        passInp.setFont(new Font("Arial", Font.PLAIN, 15)); 
        passInp.setSize(190, 20); 
        passInp.setLocation(150, 130); 
        c.add(passInp); 
        
        login = new JButton("Login"); 
        login.setFont(new Font("Arial", Font.PLAIN, 15)); 
        login.setSize(100, 20); 
        login.setLocation(70, 200); 
        login.addActionListener(this); 
        c.add(login); 
  
        signup = new JButton("Signup"); 
        signup.setFont(new Font("Arial", Font.PLAIN, 15)); 
        signup.setSize(100, 20); 
        signup.setLocation(220, 200); 
        signup.addActionListener(this); 
        c.add(signup); 
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        // Run login authentication
        if (e.getSource() == login){
            
        }
        
        // Send user to SignupForm
        if (e.getSource() == signup){
           this.dispose();
           new SignupForm().setVisible(true);
        }
    }
}