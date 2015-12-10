//*******************************************************************
//  MagazineList.java       Authors: Clifford/Dos Santos/Kelly
//
//  Assigment number 8, Due December 10th, CS 111B, 1:00pm section
//  Represents a collection of magazines.
//*******************************************************************

public class MagazineList
{
   private MagazineNode list;

   //----------------------------------------------------------------
   //  Sets up an initially empty list of magazines.
   //----------------------------------------------------------------
   public MagazineList()
   {
      list = null;
   }

   //----------------------------------------------------------------
   //  Creates a new MagazineNode object and adds it to the end of
   //  the linked list.
   //----------------------------------------------------------------
   public void add (Magazine mag)
   {

      MagazineNode node = new MagazineNode (mag);
      MagazineNode current;

      if (list == null)
         list = node;
      else
      {
         current = list;
         while (current.next != null)
            current = current.next;
         current.next = node;
      }
   }

    //----------------------------------------------------------------
   //  Creates a new MagazineNode object and adds it to the BEGINNING of
   //  the linked list.
   //----------------------------------------------------------------
   public void insert (Magazine mag)
   {
        MagazineNode node = new MagazineNode(mag);
        node.next = list;
        list = node;
   }

   //----------------------------------------------------------------
   //  Deletes the first reference in list
   //----------------------------------------------------------------
   public void deleteAll ()
   {
       if(list != null)
            list = null;
   }
    //----------------------------------------------------------------
   //  Deletes a specific reference in list
   //----------------------------------------------------------------
   public void delete(String str){

       MagazineNode previous = list;
       MagazineNode current = list;

       //Matches first item in list
       if (current.magazine.toString().equals(str)){

           list = current.next;
       }
       else
       {
            while (current != null)
          {
             //Matches between two nodes
             if((current.next != null)&&(current.magazine.toString().equals(str)))
            {
                //System.out.println("Match at " + current.magazine.toString());
                previous.next = current.next;
            }
                //Matches at the end of the list
                else if((current.next == null)&&(current.magazine.toString().equals(str)))
             {
                 previous.next = null;
             }
             previous = current;
             current = current.next;
          }
       }

   }

   //----------------------------------------------------------------
   //  Returns this list of magazines as a string.
   //----------------------------------------------------------------
   public String toString ()
   {
      String result = "";

      MagazineNode current = list;

      while (current != null)
      {
         result += current.magazine + "\n";
         current = current.next;
      }

      return result;
   }

   //  An inner class that represents a magazine node in the magazine list.
   //// basically sets a magazine to a new node.

   private class MagazineNode
   {
      public Magazine magazine;
      public MagazineNode next;

      public MagazineNode (Magazine mag)
      {
         magazine = mag;
         next = null;
      }
      public String toString(){
    	  return "deleting" ;
      }
   }
}
