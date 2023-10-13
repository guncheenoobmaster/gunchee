/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.goldthumb.chess;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class chessPanel extends JPanel {
    
    @Override
        protected void paintChildern(Graphics g) {
        super.paintChildren(g);
        
        Graphics2D g2 = (Graphics2D)g;
        
        g2.fillRect(0, 0, 600/8, 600/8);
       }
       
}
