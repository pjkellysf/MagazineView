//********************************************************************
//  MagazinePanel.java       Authors: Clifford/Kelly
//
//  Represents the primary drawing panel for the Spaceship program.
//********************************************************************
    import javax.swing.JPanel;
    import javax.swing.JButton;
    import javax.swing.JLabel;
    import java.awt.*;
    import java.awt.event.*;

    public class MagazinePanel extends JPanel
{
        private JButton btnAdd;
        private JButton btnDelete;
        //-----------------------------------------------------------------
        // Constructor: Sets up this panel to listen for button events.
        //-----------------------------------------------------------------
        public MagazinePanel()
       {
            //Add Magazine Button
            btnAdd = new JButton ("Add Magazine");
            btnAdd.addActionListener (new AddButtonListener());
            add (btnAdd);
            //Delete All Magazines Button
            btnDelete = new JButton ("Delete All Magazines");
            btnDelete.addActionListener (new DeleteButtonListener());
            add (btnDelete);
            //Frame preferences
            setBackground (Color.cyan);
            setPreferredSize (new Dimension(400, 400));
        }
        
        //*****************************************************************
        // Represents the listener for all mouse events.
        //*****************************************************************

        private class ShipMouseListener implements MouseListener,
                                            MouseMotionListener
        {
        //--------------------------------------------------------------
        //  Updates the x and y position of the mouse when moved
        //--------------------------------------------------------------
        public void mouseMoved (MouseEvent event)
        {
            repaint();
        }
        //--------------------------------------------------------------
        //  Reports the x and y position of the mouse when clicked
        //--------------------------------------------------------------
        public void mousePressed (MouseEvent event)
        {
            repaint();
        }

        public void mouseReleased (MouseEvent event) {
			repaint();
	}

        //--------------------------------------------------------------
        //  Provide empty definitions for unused event methods.
        //--------------------------------------------------------------
        public void mouseEntered (MouseEvent event) {}
        public void mouseExited (MouseEvent event) {}
        public void mouseClicked (MouseEvent event) {}
        public void mouseDragged (MouseEvent event) {}
        }

        private class AddButtonListener implements ActionListener
        {
        //--------------------------------------------------------------
        // Updates the counter and label when the button is pushed.
        //--------------------------------------------------------------
            public void actionPerformed (ActionEvent event)
            {
                System.out.println("Adding");
                repaint();
            }
        }
        
        private class DeleteButtonListener implements ActionListener
        {
        //--------------------------------------------------------------
        // Updates the counter and label when the button is pushed.
        //--------------------------------------------------------------
            public void actionPerformed (ActionEvent event)
            {
                System.out.println("Deleting");
                repaint();
            }
        }
    }
