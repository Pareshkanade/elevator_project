// Using Hard Coding., only by using if..else  and  loops.

import java.util.*;

public class elevator
{
	public static void main(String ar[] )
	{
		Scanner sc = new Scanner(System.in);
		int cur_pos=0, status=0, tot_floors;
		int floors[] = new int[10]; 

		int lower_ar[] = new int[9]; 
		int upper_ar []= new int[9];
		int lower_cnt=0, upper_cnt = 0;
		int upper_pos=0, lower_pos=0;
		
		System.out.print("\n\n\t Enter Current Position of Elavator (bet 0 to 9) : ");
		cur_pos = sc.nextInt();
		System.out.print("\n\n\t Enter Status of Elavator Up or Down( 1 or -1 ) ");
		status = sc.nextInt();

		System.out.print("\n\n\t Select number of Floors to Stop. ( 0 to 9 ) "); 
		tot_floors = sc.nextInt();

		for(int i=0; i<tot_floors; i++)
		{
			System.out.print("\n\t\t Select Floor Number ( 0 to 9 ) : ");
			floors[i] = sc.nextInt();
		}

		System.out.print("\n\t ===========================================================" );
		System.out.print("\n\n\t **********  GIVEN  INFORMATION  ************ "); 	
		System.out.print("\n\n\n\t Elavator Current Position (between 0 to 9) is \t : " + cur_pos); 	
		System.out.print("\n\n\n\t Elavator Status (Up or Down) is \t : " + status); 
		System.out.print("\n\n\t  Number of Floors, Where Lift will Stop. ( 0 to 9 ) " + tot_floors );
		for(int i=0; i<tot_floors; i++)
		{
			System.out.print("\n\t\t Floor Number is : " + floors[i] );
		}
		System.out.print("\n\t ===========================================================" );
		
		for(int i=0; i<tot_floors; i++)
		{
			if( floors[i] > cur_pos)
			{
				upper_ar[ upper_pos] = floors[i] ;
				upper_pos++;
			}
			else
			{
				lower_ar[ lower_pos ] = floors[i] ;
				lower_pos++;
			}
		}

		System.out.print("\n\n\t After Arranging, Position of floors to stop is : ");
		for(int i=0; i<upper_pos; i++)
		{
			System.out.print("  " + upper_ar[i] );
		}
		System.out.print("  | 5 |  " );
		for(int i=0; i<lower_pos; i++)
		{
			System.out.print("  " + lower_ar[i] );
		}

	}
	

}