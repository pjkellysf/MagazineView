//*******************************************************************
//  MagazineView.java       Authors: Clifford/Kelly
//
//  Driver to exercise the MagazineList collection.
//*******************************************************************

public class MagazineView
{
   //----------------------------------------------------------------
   //  Creates a MagazineList object, adds several magazines to the
   //  list, then prints it.
   //----------------------------------------------------------------
   public static void main (String[] args)
   {    
      MagazineList rack = new MagazineList();
      
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
             
   }
}
