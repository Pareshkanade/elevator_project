import java.util.*;

public class test
{
    public static void main(String ar[] )
    {
	Scanner sc = new Scanner(System.in);
	ArrayList < Integer > Floor_List = new ArrayList<Integer>();  
	int n;	

//	while( 1 > 0 )
	{
	      System.out.print("\n\n\t Select flor num ( 0 to 9 ), if not type (999) ");
	       n = sc.nextInt();

/*	       if( n == 999)
	       {
		return;
	       } 
	      else */ if( n >=0 && n <= 9 )
	      {
		Floor_List.add( n );
	       }
	 }     
	System.out.print("\n\n\t Values are " + Floor_List );

   }
}