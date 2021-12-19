// package com.zetcode;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class Board extends JPanel implements MouseListener{

    private ArrayList<Box> boxes = new ArrayList<Box>();

    // Constructor
    public Board(int box_width, int x, int y){
        // Fill ArrayList boxes with objects of type Box
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                boxes.add(new Box(box_width, x + box_width*j, y + box_width*i));
            }
        }
    }

    // Draws component
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        drawBoard(g);
    }

    // Draws the playing board
    public void drawBoard(Graphics g){
        for (Box e : boxes){
            e.paintComponent(g);
        }
    }

    // Mouse event methods
    public void mouseClicked(MouseEvent e){

    }
    public void mousePressed(MouseEvent e){
        
    }
    public void mouseReleased(MouseEvent e){
        
    }
    public void mouseEntered(MouseEvent e){
        
    }
    public void mouseExited(MouseEvent e){
        
    }
}
