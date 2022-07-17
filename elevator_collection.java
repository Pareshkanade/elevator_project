// Elevator program Using Collections .

import java.util.*;

class operations
{
		Scanner sc = new Scanner(System.in);
		int cur_pos=0, status=0;
		int n;
		ArrayList < Integer > Floor_List = new ArrayList<Integer>(); 
		TreeSet <Integer > Tree_List = new TreeSet<Integer> ( );
		TreeSet <Integer> Lower_Floors = new TreeSet<Integer>();
		TreeSet <Integer> Upper_Floors = new TreeSet<Integer>();
		TreeSet <Integer> decending_Floors = new TreeSet<Integer>();

		public void input()
		{	
			System.out.print("\n\n\t Enter Current Position of Elavator (bet 0 to 9) : ");
			cur_pos = sc.nextInt();
			System.out.print("\n\n\t Enter Status of Elavator Up or Down( 1 or -1 ) ");
			status = sc.nextInt();

			while( 1 > 0 )   {
			      System.out.print("\n\n\t Select flor num ( 0 to 9 ), if not type (999) "); 
			      n = sc.nextInt();

			      if( n == 999)
				break;
			     else if (n >=0 && n <= 9)  {   
				if(  n != cur_pos   ) 
				         Floor_List.add( n );
	       		       	else  
			           	         System.out.print("\n\t  Are Bhava, Tu tyach floor la aahes, Utar.  ");
			    } 			    
			    else
			           System.out.print("\n\t Invalid floor, plz, Enter bet 0 to 9 ");
			}
			Tree_List.addAll( Floor_List );
		}

		public void output()  {
			System.out.print("\n\t ===========================================================" );
			System.out.print("\n\n\t **********  GIVEN  INFORMATION  ************ "); 	
			System.out.print("\n\n\n\t Elavator Current Position (between 0 to 9) is \t : " + cur_pos); 	
			System.out.print("\n\n\n\t Elavator Status (Up or Down) is \t : " + status); 
			//System.out.print("\n\n\t  Number of Floors, Where Lift will Stop. ( 0 to 9 ) " +  Floor_List );
			System.out.print("\n\n\t  Number of Floors, Where Lift will Stop. ( 0 to 9 ) " +  Tree_List );
			System.out.print("\n\n\t  Selected Upper Floors :  " +  Upper_Floors );
			System.out.print("\n\n\t  Selected Lower Floors :  " +  Lower_Floors );
			
			System.out.print("\n\t ===========================================================" );
		}
		public void arrangeFloors() {
			for( Integer x : Tree_List )  {
			     if ( x > 5 )
			              	Upper_Floors.add( x ) ;  //System.out.print(" \n\t Upper floor is  " +  x ); 
			     else  
				Lower_Floors.add( x ) ;  // System.out.print(" \n\t -----Lower floor is  " +  x ); 
			}
		}

		public void showResult() {
			SortFloors();
			if( status == 1 ) 
			    System.out.print("\n\n\t  Lift is Moving UP :  " +  Upper_Floors + "   | " +  cur_pos + " |   " +  decending_Floors );
			else  
			    System.out.print("\n\n\t  Lift is Moving DOWN :  " +  decending_Floors + "   | " +  cur_pos + " |   " + Upper_Floors );
		}
		public void SortFloors()  {
			decending_Floors =(TreeSet<Integer>)Lower_Floors.descendingSet();			
		}
}
public class elevator_collection {
	public static void main(String ar[] ) {
		     operations c = new operations();
				c.input();
				c.arrangeFloors();
				c.output();
				c.showResult();
	}
}