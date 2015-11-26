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
      /*rack.add (new Magazine("Time"));
      rack.add (new Magazine("Woodworking Today"));
      rack.add (new Magazine("Communications of the ACM"));
      rack.add (new Magazine("House and Garden"));
      rack.add (new Magazine("GQ"));*/
       
       //Adds new magazines to the BEGINNING of the list
       rack.insert (new Magazine("Time"));
      rack.insert (new Magazine("Woodworking Today"));
      rack.insert (new Magazine("Communications of the ACM"));
      rack.insert (new Magazine("House and Garden"));
      rack.insert (new Magazine("GQ"));
      
      System.out.println (rack); 
       
       //DELETES the magazines from the list
       
       rack.deleteAll();
       
       System.out.println ("empty" + rack); 
       
       
   }
}
