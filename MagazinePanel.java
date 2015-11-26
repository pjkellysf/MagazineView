//********************************************************************
//  MagazinePanel.java       Authors: Clifford/Kelly
//
//  Represents the primary drawing panel for the Spaceship program.
//********************************************************************
    import javax.swing.JPanel;
    import javax.swing.JButton;
    import javax.swing.JLabel;
    import javax.swing.JTextField;
    import javax.swing.JTextArea;
    import java.awt.*;
    import java.awt.event.*;

    public class MagazinePanel extends JPanel
{
        MagazineList rack = new MagazineList();
        
        private JButton btnAdd;
        private JButton btnDelete;
        private JTextField inputText;
        private JTextArea textArea;
        //-----------------------------------------------------------------
        // Constructor: Sets up this panel to listen for button events.
        //-----------------------------------------------------------------
        public MagazinePanel()
       {
            //Text Input Field
            inputText = new JTextField(20);
            add (inputText);
            //Add Magazine Button
            btnAdd = new JButton ("Add Magazine");
            btnAdd.addActionListener (new AddButtonListener());
            add (btnAdd);
            //Scrollable Text Area
            textArea = new JTextArea(10, 20);
            add (textArea);
            //Delete All Magazines Button
            btnDelete = new JButton ("Delete All Magazines");
            btnDelete.addActionListener (new DeleteButtonListener());
            add (btnDelete);
            //Frame preferences
            setPreferredSize (new Dimension(400, 400));
        }

        private class AddButtonListener implements ActionListener
        {
        //--------------------------------------------------------------
        // Adds a magazine when clicked
        //--------------------------------------------------------------
            public void actionPerformed (ActionEvent event)
            {
                System.out.println("Adding");
                //TEST CODE
                rack.insert (new Magazine(inputText.getText()));
                textArea.setText(rack.toString());
                //textArea.setText(inputText.getText());
                inputText.setText("");
                //rack.insert (new Magazine("A"));
                //rack.insert (new Magazine("B"));
                System.out.println(rack);
            }
        }
        
        private class DeleteButtonListener implements ActionListener
        {
        //--------------------------------------------------------------
        // Deletes all magazines when clicked
        //--------------------------------------------------------------
            public void actionPerformed (ActionEvent event)
            {
                System.out.println("Deleting");
                rack.deleteAll();
                textArea.setText("");
                System.out.println(rack);
            }
        }
    }
