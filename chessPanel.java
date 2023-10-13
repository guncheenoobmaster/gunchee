package com.goldthumb.chess;

import java.awt.Graphics;
import java.awt.Graphics20;

import javax.swing.JPanel;

public class chessPanel extends JPanel{
       @Override
       proteted void paintChildren(Graphics g){
        super.paintChildren(g);
        Graphics2D g2 = (Graphics2D);
        g2.fillRect(0, 0, WIDTH, HEIGHT)
       }

       
}
