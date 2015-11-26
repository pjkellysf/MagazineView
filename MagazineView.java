//********************************************************************
//  MagazineView.java       Authors: Clifford/Kelly
//
//  Draws a spaceship and line at the mouse position.
//********************************************************************

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
        frame.pack();
        frame.setVisible(true);
    }
}
