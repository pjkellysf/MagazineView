//********************************************************************
//  MagazinePanel.java       Authors: Clifford/Dos Santos/Kelly
//
//  Represents the primary drawing panel for the Magazine program.
//********************************************************************
    import javax.swing.JPanel;
    import javax.swing.JButton;
    import javax.swing.JLabel;
    import javax.swing.JTextField;
    import javax.swing.JTextArea;
    import java.awt.*;
    import java.awt.event.*;

    public class MagazinePanel extends JPanel{

    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnDeleteMag;
    private JTextField inputText;
    private JTextArea textArea;


        MagazineList rack = new MagazineList();


        //-----------------------------------------------------------------
        // Constructor: Sets up this panel to listen for button events.
        //-----------------------------------------------------------------
        public MagazinePanel(){


            //Text Input Field
            inputText = new JTextField(10);
            add (inputText);

            //Add Magazine Button
            btnDeleteMag = new JButton ("Delete This Magazine");
            btnDeleteMag.addActionListener (new ButtonListener());
            add (btnDeleteMag);



            //Add Magazine Button
            btnAdd = new JButton ("Add This Magazine");
            btnAdd.addActionListener (new ButtonListener());
            add (btnAdd);
            //Scrollable Text Area
            textArea = new JTextArea(15, 20);
            add (textArea);
            //Delete All Magazines Button
            btnDelete = new JButton ("Delete All Magazines");
            btnDelete.addActionListener (new ButtonListener());
            add (btnDelete);
            //Frame preferences
            setPreferredSize (new Dimension(400, 400));
        }

        private class ButtonListener implements ActionListener
        {
        //--------------------------------------------------------------
        // Adds a magazine when clicked
        //--------------------------------------------------------------
            public void actionPerformed (ActionEvent event)
            {

		JButton buttonClicked = (JButton)event.getSource();

		if(buttonClicked == btnAdd & (!inputText.getText().equals(""))){
          		rack.insert (new Magazine(inputText.getText()));
            		textArea.setText(rack.toString());
            		inputText.setText("");
		}

		if(buttonClicked == btnDelete){
            		rack.deleteAll();
            		textArea.setText("");
		}

		if(buttonClicked == btnDeleteMag){
			String deletedMagazine = inputText.getText();
			rack.delete (deletedMagazine);
            		inputText.setText("");
            		textArea.setText(rack.toString());
		}
     }
   }
}
