// WAP to draw shapes:
// SQUARE
// CIRCLE
// ELLIPSE

import java.applet.*;
import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.*;

public class shapes extends Applet implements ActionListener{
    private boolean d1, d2, d3;
    Button b1 = new Button ("SQUARE");
	Button b2 = new Button ("CIRCLE");
    Button b3 = new Button ("ELLIPSE");
    public void init(){
	  add (b1);
      add (b2);
	  add (b3);  	  
	  b1.addActionListener(this);
	  b2.addActionListener(this);
      b3.addActionListener(this);
    }
    public void paint(Graphics g){
        if(d1){
            g.drawRect(100,100,50,50);
        }
        if(d2){
            g.drawOval(100,150,50,50);
        }
        if(d3){
            g.drawOval(100,200,50,40);
        }
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            d1 = true;
        }
        repaint();
        if(e.getSource()==b2){
            d2 = true;
        }
        repaint();
        if(e.getSource()==b3){
            d3 = true;
        }
        repaint();
    }
}