import java.util.*;

public class test1
{
    public static void main(String ar[] )
    {
	TreeSet<Integer> ints = new TreeSet<Integer>();
        ints.add(2);
        ints.add(20);
        ints.add(10);
        ints.add(5);
        ints.add(7);
        ints.add(3);
 
       TreeSet<Integer> intsReverse = (TreeSet<Integer>)ints.descendingSet();
 
        // Print the set
        System.out.println("Without descendingSet(): " +
                                                 ints);
        System.out.println("With descendingSet(): " +
                                           intsReverse);
   }
}