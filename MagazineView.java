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
        
        MagazineList rack = new MagazineList();
      
        //TEST CODE
        /*
        //Adds new magazines to the END of the list
        rack.add (new Magazine("A"));
        rack.add (new Magazine("B"));
        rack.add (new Magazine("C"));
        rack.add (new Magazine("D"));
        rack.add (new Magazine("E"));

        System.out.println ("Add at end \n" + rack);
        rack.deleteAll();

        //Adds new magazines to the BEGINNING of the list
        rack.insert (new Magazine("A"));
        rack.insert (new Magazine("B"));
        rack.insert (new Magazine("C"));
        rack.insert (new Magazine("D"));
        rack.insert (new Magazine("E"));

        System.out.println ("Add at beginning \n" + rack);
        rack.deleteAll(); 

        //DELETES the magazines from the list

        rack.deleteAll();

        System.out.println ("Deletes all \n" + rack);
        System.out.println (rack);
        */
    }
}
