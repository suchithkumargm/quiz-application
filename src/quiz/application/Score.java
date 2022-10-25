package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{

    Score(String name,int score){
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setBounds(300,100,750,550);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);

        JLabel heading=new JLabel("Thank you "+name+" for playing Simple Minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,26));
        add(heading);

        JLabel plScore=new JLabel("Your score is "+score);
        plScore.setBounds(350,200,300,30);
        plScore.setFont(new Font("Tahoma",Font.BOLD,26));
        add(plScore);

        JButton playAgain=new JButton("Play Again");
        playAgain.setBounds(380,270,120,40);
        playAgain.setBackground(new Color(30,144,255));
        playAgain.setForeground(Color.white);
        playAgain.addActionListener(this);
        add(playAgain);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Login().setVisible(true);
    }
    public static void main(String args[])
    {
        new Score("user",0);
    }

}
