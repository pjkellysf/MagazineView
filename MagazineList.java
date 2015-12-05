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

 
	//----------------------------------------------------------------
	//  Looks for a specific string in the list and deletes it if found. 
	//----------------------------------------------------------------
   public void deleteSpecific (String str)
   {
       MagazineNode current = list;
       
       System.out.println("Looking for " + str);
       
       int count = 0;

      while (current != null)
      {
          count += 1;
          
          String testString = "" + current.magazine;
          
          if(testString.equals(str))
          {
              //Match found in the list
              System.out.println("Found match for " + str + " at position " + count);
          }
          
          current = current.next;
          
      }
   }
}
