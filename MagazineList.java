//*******************************************************************
//  MagazineList.java       Authors: Clifford/Dos Santos/Kelly
//
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
   //  Deletes the next reference in list
   //----------------------------------------------------------------
   public void deleteAll ()
   {
       if(list != null)
            list = null;
   }

   public void deleteMag(Magazine mag){


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


 public void deleteMagazine(String mag){
	 System.out.println(" deleting " + mag);
 }
 
	//----------------------------------------------------------------
	//  Looks for a specific string in the list and deletes it if found. 
	//----------------------------------------------------------------
   public void deleteSpecific (String str)
   {
       MagazineNode current = list;

      while (current != null)
      {
          String testString = "" + current.magazine;
          
          if(testString.equals(str))
          {
              //Match found in the list
              System.out.println("Found match for " + str);
          }
          
          current = current.next;
          
          if(current == null){
              
              //Reached the last item in the list and no matches
              System.out.println("No match in the list for " + str);
          }
      }
   }
}
