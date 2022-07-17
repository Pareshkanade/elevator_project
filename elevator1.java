// Using Oject Oriented Programming,  Class n Object.

import java.util.*;

class operations
{

		Scanner sc = new Scanner(System.in);
		int cur_pos=0, status=0, tot_floors;
		int floors[] = new int[10]; 

		int lower_ar[] = new int[9]; 
		int upper_ar []= new int[9];
		int lower_cnt=0, upper_cnt = 0;
		int upper_pos=0, lower_pos=0;

		public void input()
		{	
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
		}

		public void output()
		{
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
		}
		public void arrangeFloors()
		{
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
		}

		public void showResult()
		{

		    if( status == 1)
		    {
			SortFloors1();
			
			System.out.print("\n\n\t Lift is Moving UP ^^^^^ , Position of floors is : ");
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
		   else
		   {
		 	SortFloors_1();
			System.out.print("\n\n\t Lift is Moving DOWN \\\\\\> , Position of floors is : ");
			for(int i=0; i<lower_pos; i++)
			{
				System.out.print("  " + lower_ar[i] );
			}

			System.out.print("  | 5 |  " );

			for(int i=0; i<upper_pos; i++)
			{
				System.out.print("  " + upper_ar[i] );
			}					

		   }
		  
		}
		public void SortFloors1()
		{
			int i,j, t;
			System.out.print("\n\n\t Upper position is : " + upper_pos );
			System.out.print("\n\n\t Lower position is : " + lower_pos );
			//  Upper Array sorting using Bubble sort technique.
			for(i=0; i<upper_pos-1; i++)
			{
				for(j=0; j<upper_pos-1;  j++)
				{
					if( upper_ar[j] > upper_ar[j+1] )
					{
						t = upper_ar[j];
						upper_ar[j] = upper_ar[j+1];
						upper_ar[j+1] = t;
					}
				}
			}
			// Lower Array sorting using Bubble sort technique.
			for(i=0; i<lower_pos-1;i++)
			{
				for(j=0; j<lower_pos-1; j++)
				{
					if( lower_ar[j] < lower_ar[j+1] )
					{
						t = lower_ar[j];
						lower_ar[j] = lower_ar[j+1];
						lower_ar[j+1] = t;
					}
				}
			}

			//============================================================================= 
		}
		public void SortFloors_1()
		{
			int i,j, t;
			System.out.print("\n\n\t Upper position is : " + upper_pos );
			System.out.print("\n\n\t Lower position is : " + lower_pos );
			//  Upper Array sorting using Bubble sort technique.
			for(i=0; i<upper_pos-1; i++)
			{
				for(j=0; j<upper_pos-1;  j++)
				{
					if( upper_ar[j] > upper_ar[j+1] )
					{
						t = upper_ar[j];
						upper_ar[j] = upper_ar[j+1];
						upper_ar[j+1] = t;
					}
				}
			}
			// Lower Array sorting using Bubble sort technique.
			for(i=0; i<lower_pos-1;i++)
			{
				for(j=0; j<lower_pos-1; j++)
				{
					if( lower_ar[j] < lower_ar[j+1] )
					{
						t = lower_ar[j];
						lower_ar[j] = lower_ar[j+1];
						lower_ar[j+1] = t;
					}
				}
			}

			//============================================================================= 
		}
}
public class elevator1
{
	public static void main(String ar[] )
	{
		     operations c = new operations();
				c.input();
				c.output();
				c.arrangeFloors();
				c.showResult();

	}
}