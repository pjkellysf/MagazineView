//********************************************************************
//  MagazineView.java       Authors: Clifford/Dos Santos/Kelly
//
//  Creates frame and panel for MagazineView assignment
//  Assigment number 8, Due December 10th, CS 111B, 1:00pm section
//********************************************************************

import java.awt.Dimension;

import javax.swing.JFrame;
public class MagazineView
    {
    //-----------------------------------------------------------------
    // Creates and displays the application frame.
    //-----------------------------------------------------------------
    public static void main (String[] args)
    {
        JFrame frame = new JFrame ("MagazineView");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MagazinePanel());
        frame.setSize(500,400);
        frame.setVisible(true);
    }
}
