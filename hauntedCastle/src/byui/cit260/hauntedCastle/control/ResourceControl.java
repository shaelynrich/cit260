/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.control;

import byui.cit260.hauntedCastle.model.Item;

/**
 *
 * @author Shaelyn
 */
public class ResourceControl {

     public static void main()
     {
             String[ ] Item = {"sword", "potion", "key", "food", "magic"};
             sortStringBubble (Item);
             for ( int i = 0;  i < 5;  i++ )
                System.out.println( Item [i] );
      }

      public static void sortStringBubble( String x [] )
      {
            int j;
            boolean flag = true;  // will determine when the sort is finished
            String length;

            while ( flag )
            {
                  flag = false;
                  for ( j = 0;  j < x.length - 1;  j++ )
                  {
                          if ( x [ j ].compareToIgnoreCase( x [ j+1 ] ) > 0 )
                          {                                             // ascending sort
                                      length = x [ j ];
                                      x [ j ] = x [ j+1];     // swapping
                                      x [ j+1] = length; 
                                      flag = true;
                           } 
                   } 
            } 
      }
}
