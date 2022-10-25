package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton rules,quit;
    JTextField name;

    Login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);

        JLabel heading=new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel nameLabel=new JLabel("Enter your Name");
        nameLabel.setBounds(810,150,300,20);
        nameLabel.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        nameLabel.setForeground(new Color(30,144,254));
        add(nameLabel);
        
        name=new JTextField();
        name.setBounds(735,200,300,25);
        name.setFont(new Font("Times New Roman",Font.BOLD,20));
        heading.setForeground(new Color(30,144,254));
        add(name);
        
        rules=new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        add(rules);
        
        quit=new JButton("Quit");
        quit.setBounds(915,270,120,25);
        quit.setBackground(new Color(30,144,254));
        quit.setForeground(Color.white);
        quit.addActionListener(this);
        add(quit);

        setSize(1200,500);
        setLocation(100,120);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==rules){
            setVisible(false);
            new Rules(name.getText()).setVisible(true);
        }else{
            setVisible(false);
        }
    }
    public static void main(String args[])
    {
        new Login();
    }

}
