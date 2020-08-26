import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionDemi 
{
     public static void main(String args[])
     {
    	// Collection values = new ArrayList();
    /*	 List values = new ArrayList();
    	 values.add(4);
    	 values.add(5);
    	 values.add(6);
    	 values.add(7);  */
//If we want only particular data type than we can 
 //use the concept of genetics//Using data type along with collection
    	 List<Integer> values = new ArrayList<>();
    	 values.add(90);
    	 values.add(223);
    	 values.add(52);
    	 values.add(171);
    	 
    	 Collections.sort(values,(i,j) -> i%10>j%10?1:-1); //For getting values in ascending order
    	 
    	 
    	 
    	 for(Object k : values)
    	 {
    		 System.out.println(k);
    	 }
    	 
    	/*Iterator it = values.iterator(); 
    	 while(it.hasNext())   // in case of collection only we have
    	 			          	 to use while loop..
    	 {
    	 System.out.println(it.next());
     } */
}
}
