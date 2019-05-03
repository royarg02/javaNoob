// WAP to add in applets

import java.applet.*; // applet package
import java.awt.*;
import java.awt.event.*; // to handle all the actions like buttons and methodes

public class add extends Applet implements ActionListener{
    TextField  T1,T2,T3;
    Button B1;
    public void init(){
        setLayout(null);
        setBackground(Color.green);
        T1=new TextField();
        T2=new TextField();
        T3=new TextField();
        B1=new Button( "+" );
        B1.setBounds (50,200,50,20);
        T1.setBounds (200,100,100,20);
        T2.setBounds (200,140,100,20);
        T3.setBounds (200,250,100,20);
        add(T1);
        add(T2);
        add(T3);
        add(B1);
        B1.addActionListener(this);
    }
    public void actionPerformed (ActionEvent e){
        int n1=Integer.parseInt(T1.getText());  
        int n2=Integer.parseInt(T2.getText());  
        if(e.getSource()==B1){
            T3.setText(String.valueOf(n1+n2));
        }
    }
}