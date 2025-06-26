package Lib;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class RollingBall extends JPanel implements ActionListener{
    int x = 100;
    int y = 90;
    int starts_angle = 0;
    public RollingBall(){
        Timer t = new Timer(100, this);
        t.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x, y, 80, 80);
        g.fillArc(x, y, 80, 80, starts_angle, 180);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        x=x-2;
        starts_angle=starts_angle+2;
        if (x==-80)x=getWidth();
        if (starts_angle==360) starts_angle=0;
        repaint();
    }
    
}
